package org.gaviot.transformer.writer;

import java.io.IOException;
import java.util.List;

import net.sf.jxls.exception.ParsePropertyException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.model.generic.Order;

public interface ExcelWriter {

	public abstract void write(String template, List<Order> orders,
			String outputExcelFileName) throws ParsePropertyException,
			InvalidFormatException, IOException;

}