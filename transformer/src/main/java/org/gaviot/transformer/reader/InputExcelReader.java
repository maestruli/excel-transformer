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

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.model.progreso.Orden;
import org.xml.sax.SAXException;

public class InputExcelReader implements ExcelReader {

	public List<Orden> read(File inputExcelFile) throws IOException, SAXException, InvalidFormatException {
		InputStream inputXML = new BufferedInputStream(ClassLoader.getSystemResourceAsStream("classpath:mapping.xml"));
		XLSReader mainReader = ReaderBuilder.buildFromXML(inputXML);
		InputStream inputXLS = new BufferedInputStream(ClassLoader.getSystemResourceAsStream(inputExcelFile.getAbsolutePath()));
		List<Orden> ordenes = new ArrayList();
		Map beans = new HashMap();
		beans.put("ordenes", ordenes);
		XLSReadStatus readStatus = mainReader.read(inputXLS, beans);
		return (List<Orden>) beans.get("ordenes");
	}

	public boolean isValidFile(File inputExcelFile) {
		return true;
	}

}
