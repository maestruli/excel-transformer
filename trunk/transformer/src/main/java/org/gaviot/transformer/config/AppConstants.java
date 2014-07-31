package org.gaviot.transformer.config;

import java.io.File;

public class AppConstants {

	public static String INPUT_DIRECTORY = PropertiesUtil.getProperty("INPUT_DIRECTORY");
	public static String OUTPUT_DIRECTORY = PropertiesUtil.getProperty("OUTPUT_DIRECTORY");
	public static String TEMPLATE_FILE = "." + File.separator + "res" + File.separator + "template.xls";
	public static String PROCESS_FILE_PREFIX = "SANCOR_";
	public static String DEFAULT_OUTPUT_EXTENSION = ".xls";

}
