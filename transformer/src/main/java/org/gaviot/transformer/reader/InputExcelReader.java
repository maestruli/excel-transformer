package org.gaviot.transformer.reader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jxls.reader.ReaderBuilder;
import net.sf.jxls.reader.XLSReadStatus;
import net.sf.jxls.reader.XLSReader;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.model.progreso.Orden;
import org.xml.sax.SAXException;

public class InputExcelReader implements ExcelReader {

	final static String MAPPING_CONFIGURATION = "mapping.xml";
	Logger LOGGER = Logger.getLogger(InputExcelReader.class);

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Orden> read(File inputExcelFile) throws IOException, SAXException, InvalidFormatException {
		InputStream inputXML = new BufferedInputStream(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream(MAPPING_CONFIGURATION));
		XLSReader mainReader = ReaderBuilder.buildFromXML(inputXML);
		InputStream inputXLS = new BufferedInputStream(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream(inputExcelFile.getPath()));
		List ordenes = new ArrayList();
		Map beans = new HashMap();
		beans.put("ordenes", ordenes);
		XLSReadStatus readStatus = mainReader.read(inputXLS, beans);
		return (List<Orden>) beans.get("ordenes");
	}

	public boolean isValidFile(File inputExcelFile) {
		return true;
	}

}
