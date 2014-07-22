package org.gaviot.transformer.reader;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.model.progreso.Orden;
import org.xml.sax.SAXException;

/**
 * The Interface ExcelReader.
 */
public interface ExcelReader {

	/**
	 * Read.
	 *
	 * @param inputExcelFile the input excel file
	 * @return the list
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws SAXException the sAX exception
	 * @throws InvalidFormatException the invalid format exception
	 */
	List<Orden> read(File inputExcelFile) throws IOException, SAXException, InvalidFormatException;


	/**
	 * Checks if is valid file.
	 *
	 * @param inputExcelFile the input excel file
	 * @return true, if is valid file
	 */
	boolean isValidFile(File inputExcelFile);
}
