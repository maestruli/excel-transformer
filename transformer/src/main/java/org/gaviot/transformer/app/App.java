package org.gaviot.transformer.app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import net.sf.jxls.exception.ParsePropertyException;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.config.PropertiesUtil;
import org.gaviot.transformer.finder.DirectoryScanner;
import org.gaviot.transformer.model.generic.Order;
import org.gaviot.transformer.reader.ExcelReader;
import org.gaviot.transformer.reader.InputExcelReader;
import org.gaviot.transformer.writer.ExcelWriter;
import org.gaviot.transformer.writer.OutputExcelWriter;
import org.xml.sax.SAXException;

public class App {

	static Logger LOGGER = Logger.getLogger(InputExcelReader.class);
	static String INPUT_DIRECTORY = PropertiesUtil.getProperty("INPUT_DIRECTORY");
	static String OUTPUT_DIRECTORY = PropertiesUtil.getProperty("OUTPUT_DIRECTORY");
	static String TEMPLATE_FILE = "template.xls";
	static String PROCESS_FILE_PREFIX = "SANCOR_";

	public static void main(String[] args) {
		DirectoryScanner directoryScanner = new DirectoryScanner();
		List<File> excelFiles = directoryScanner.getExcelFiles(INPUT_DIRECTORY);
		try {
			processExcelFiles(excelFiles);
		} catch (Exception e) {
			LOGGER.error("An error has occurred", e);
		}
	}

	private static void processExcelFiles(List<File> excelFiles) throws InvalidFormatException, IOException,
			SAXException {
		if (!excelFiles.isEmpty()) {
			for (File excelFile : excelFiles) {
				List<Order> orders = readOrders(excelFile);
				writeOrders(orders, excelFile.getName());
			}
		}
	}

	private static List<Order> readOrders(File excelFile) throws InvalidFormatException, IOException, SAXException {
		ExcelReader reader = new InputExcelReader();
		List<Order> orders = reader.read(excelFile);
		return orders;
	}

	private static void writeOrders(List<Order> orders, String sourceExcelFileName) throws ParsePropertyException,
			InvalidFormatException, IOException {
		ExcelWriter writer = new OutputExcelWriter();
		String outputFileName = OUTPUT_DIRECTORY + File.separator + PROCESS_FILE_PREFIX + sourceExcelFileName;
		writer.write(TEMPLATE_FILE, orders, outputFileName);
	}

}
