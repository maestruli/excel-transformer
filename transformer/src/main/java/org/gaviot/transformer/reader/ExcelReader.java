package org.gaviot.transformer.reader;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.model.generic.Order;
import org.xml.sax.SAXException;

public interface ExcelReader {

	List<Order> read(File inputExcelFile) throws IOException, SAXException, InvalidFormatException;

}
