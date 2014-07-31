package org.gaviot.transformer.reader;

import org.gaviot.transformer.model.generic.ElProgresoMailOrder;
import org.gaviot.transformer.model.generic.ElProgresoSystemOrder;

public class InputExcelReaderFactory {
	
	public static ExcelReader getInstance(Object orderType) {
		if (orderType instanceof ElProgresoMailOrder) {
			return new InputExcelReader("mailsource.xml");
		}
		if (orderType instanceof ElProgresoSystemOrder) {
			return new InputExcelReader("systemsource.xml");
		}
		return null;
	}

}
