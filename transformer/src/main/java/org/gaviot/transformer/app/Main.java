package org.gaviot.transformer.app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.model.progreso.Orden;
import org.gaviot.transformer.reader.ExcelReader;
import org.gaviot.transformer.reader.InputExcelReader;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		ExcelReader reader = new InputExcelReader();
		File input = new File("classpath:Input.xlsx");
		try {
			List<Orden> ordenes = reader.read(input);
			System.out.println(ordenes.toString());
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}

}
