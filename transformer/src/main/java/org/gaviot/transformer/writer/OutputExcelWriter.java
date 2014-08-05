package org.gaviot.transformer.writer;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.model.generic.Order;

public class OutputExcelWriter {
	Logger LOGGER = Logger.getLogger(OutputExcelWriter.class);

	private String templateFile;

	public String getTemplateFile() {
		return templateFile;
	}

	public void setTemplateFile(String templateFile) {
		this.templateFile = templateFile;
	}

	public void write(List<Order> orders, String outputExcelFileName) throws ParsePropertyException,
			InvalidFormatException, IOException {
		LOGGER.info("Writing output file: " + outputExcelFileName);
		Map beans = new HashMap();
		beans.put("order", orders);
		XLSTransformer transformer = new XLSTransformer();
		File templateFile = new File(this.templateFile);
		transformer.transformXLS(templateFile.getPath(), beans, outputExcelFileName);
	}

}
