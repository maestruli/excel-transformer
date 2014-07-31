package org.gaviot.transformer.reader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
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
import org.xml.sax.SAXException;

public class InputExcelReader implements ExcelReader {

	Logger LOGGER = Logger.getLogger(InputExcelReader.class);
	private String mappingConfiguration;

	public InputExcelReader() {
		super();
	}

	public InputExcelReader(String mappingConfiguration) {
		super();
		this.mappingConfiguration = mappingConfiguration;
	}

	public String getMappingConfiguration() {
		return mappingConfiguration;
	}

	public void setMappingConfiguration(String mappingConfiguration) {
		this.mappingConfiguration = mappingConfiguration;
	}

	/* (non-Javadoc)
	 * @see org.gaviot.transformer.reader.ExcelReader#read(java.io.File)
	 */
	@Override
	public <T> List<T> read(File inputExcelFile) throws IOException, SAXException, InvalidFormatException {
		LOGGER.info("Reading input file: " + inputExcelFile.getName());
		InputStream inputXML = new BufferedInputStream(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream(mappingConfiguration));
		XLSReader mainReader = ReaderBuilder.buildFromXML(inputXML);
		InputStream inputXLS = new BufferedInputStream(new FileInputStream(inputExcelFile));
		List orders = new ArrayList();
		Map beans = new HashMap();
		beans.put("orders", orders);
		XLSReadStatus readStatus = mainReader.read(inputXLS, beans);
		return (List<T>) beans.get("orders");
	}

}
