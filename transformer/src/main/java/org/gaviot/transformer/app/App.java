package org.gaviot.transformer.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import net.sf.jxls.exception.ParsePropertyException;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.config.AppConstants;
import org.gaviot.transformer.finder.DirectoryScanner;
import org.gaviot.transformer.model.generic.ElProgresoMailOrder;
import org.gaviot.transformer.model.generic.ElProgresoSystemOrder;
import org.gaviot.transformer.model.generic.Order;
import org.gaviot.transformer.reader.ExcelReader;
import org.gaviot.transformer.reader.InputExcelReader;
import org.gaviot.transformer.reader.InputExcelReaderFactory;
import org.gaviot.transformer.writer.OutputExcelWriter;
import org.xml.sax.SAXException;

public class App {

	static Logger LOGGER = Logger.getLogger(InputExcelReader.class);


	public static void main(String[] args) {
		DirectoryScanner directoryScanner = new DirectoryScanner();
		List<File> excelFiles = directoryScanner.getExcelFiles(AppConstants.INPUT_DIRECTORY);
		try {
			processExcelFiles(excelFiles);
			infoBox("Los archivos fueron procesados. Puede consultarlos en: " + AppConstants.OUTPUT_DIRECTORY);
		} catch (Exception e) {
			LOGGER.error("An error has occurred", e);
			errorBox(e.getMessage());
		}
	}

	private static void processExcelFiles(List<File> excelFiles) throws InvalidFormatException, IOException,
			SAXException {
		if (!excelFiles.isEmpty()) {
			for (File excelFile : excelFiles) {
				inspectExcelFile(excelFile);
			}
		}
	}

	private static void inspectExcelFile(File inputExcelFile) {
		Object orderType = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(inputExcelFile.getPath());
			HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
			HSSFSheet worksheet = workbook.getSheet("Hoja4");
			HSSFRow row1 = worksheet.getRow(0);
			HSSFCell cellA1 = row1.getCell(0);
			String a1Val = cellA1.getStringCellValue().trim();
			if ("Nro. de Orden".equals(a1Val)) {
				orderType = new ElProgresoMailOrder();
			}
			if ("Fecha".equals(a1Val)) {
				orderType = new ElProgresoSystemOrder();
			}
			if (orderType == null) {
				LOGGER.error("Estructura de excel inválida");
				System.exit(1);
			}

			List<Order> orders = readOrders(inputExcelFile, orderType);
			writeOrders(orders, inputExcelFile.getPath());
		} catch (Exception e) {
			LOGGER.error("Se produjo un error.", e);
		}
	}
	
	private static List<Order> readOrders(File excelFile, Object orderType) throws InvalidFormatException,
			IOException, SAXException {
		ExcelReader reader = InputExcelReaderFactory.getInstance(orderType.getClass());
		List<Order> orders = reader.read(excelFile);
		return orders;
	}

	private static void writeOrders(List<Order> orders, String sourceExcelFileName) throws ParsePropertyException,
			InvalidFormatException, IOException {
		OutputExcelWriter writer = new OutputExcelWriter();
		String outputFileName = AppConstants.OUTPUT_DIRECTORY + File.separator + AppConstants.PROCESS_FILE_PREFIX
				+ FilenameUtils.removeExtension(sourceExcelFileName) + AppConstants.DEFAULT_OUTPUT_EXTENSION;
		writer.write(AppConstants.TEMPLATE_FILE, orders, outputFileName);
	}

	public static void infoBox(String infoMessage) {
		JOptionPane.showMessageDialog(null, infoMessage, "Clinnnnn!!!!", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void errorBox(String errorMessage) {
		JOptionPane.showMessageDialog(null, errorMessage, "Channnnnn!!!!", JOptionPane.ERROR_MESSAGE);
	}
}
