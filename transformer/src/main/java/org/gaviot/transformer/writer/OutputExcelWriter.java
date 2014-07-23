package org.gaviot.transformer.writer;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.model.sancor.Orden;

public class OutputExcelWriter {

	public boolean write(String template, List<Orden> ordenes, String outputExcelFile) throws ParsePropertyException,
			InvalidFormatException, IOException {
		Map beans = new HashMap();
		beans.put("orden", ordenes);
		XLSTransformer transformer = new XLSTransformer();
		transformer.transformXLS(template, beans, outputExcelFile);
		return true;
	}

}
