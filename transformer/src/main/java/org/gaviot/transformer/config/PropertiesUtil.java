package org.gaviot.transformer.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * The Class PropertiesUtil.
 */
public class PropertiesUtil {

	static Properties PROPS = new Properties();
	static String PROPERTY_FILE = "transformer.properties";
	static InputStream INPUT = null;
	static Logger LOGGER = Logger.getLogger(PropertiesUtil.class);

	static {
		try {
			INPUT = Thread.currentThread().getContextClassLoader().getResourceAsStream(PROPERTY_FILE);
			PROPS.load(INPUT);
		} catch (FileNotFoundException e) {
			LOGGER.error("Se produjo un error", e);
		} catch (IOException e) {
			LOGGER.error("Se produjo un error", e);
		}
	}

	/**
	 * Gets the property.
	 * 
	 * @param key
	 *            the key
	 * @return the property
	 */
	public static String getProperty(String key) {
		return PROPS.getProperty(key);
	}
}
