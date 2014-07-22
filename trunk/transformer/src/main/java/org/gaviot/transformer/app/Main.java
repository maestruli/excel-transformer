package org.gaviot.transformer.app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.model.progreso.Orden;
import org.gaviot.transformer.reader.ExcelReader;
import org.gaviot.transformer.reader.InputExcelReader;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		Logger LOGGER = Logger.getLogger(InputExcelReader.class);

		ExcelReader reader = new InputExcelReader();
		File input = new File("Input.xlsx");
		try {
			List<Orden> ordenes = reader.read(input);
		} catch (InvalidFormatException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (SAXException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

}
