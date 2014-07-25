package org.gaviot.transformer.writer;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.model.generic.Order;

public class OutputExcelWriter implements ExcelWriter {
	Logger LOGGER = Logger.getLogger(OutputExcelWriter.class);

	public void write(String template, List<Order> orders, String outputExcelFileName) throws ParsePropertyException,
			InvalidFormatException, IOException {
		LOGGER.info("Writing outout file: " + outputExcelFileName);
		Map beans = new HashMap();
		beans.put("order", orders);
		XLSTransformer transformer = new XLSTransformer();
		transformer.transformXLS(template, beans, outputExcelFileName);
	}

}
