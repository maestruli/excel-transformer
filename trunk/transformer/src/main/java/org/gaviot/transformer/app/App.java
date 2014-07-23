package org.gaviot.transformer.app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.gaviot.transformer.config.PropertiesUtil;
import org.gaviot.transformer.finder.DirectoryScanner;
import org.gaviot.transformer.model.progreso.Orden;
import org.gaviot.transformer.model.sancor.OrdenSancorBuilder;
import org.gaviot.transformer.reader.ExcelReader;
import org.gaviot.transformer.reader.InputExcelReader;
import org.gaviot.transformer.writer.OutputExcelWriter;
import org.xml.sax.SAXException;

public class App {

	public static void main(String[] args) {
		Logger LOGGER = Logger.getLogger(InputExcelReader.class);

		DirectoryScanner directoryScanner = new DirectoryScanner();
		ExcelReader reader = new InputExcelReader();
		String inputDirectory = PropertiesUtil.getProperty("INPUT_DIRECTORY");
		String outputDirectory = PropertiesUtil.getProperty("OUTPUT_DIRECTORY");
		
		List<File> excelFiles = directoryScanner.getExcelFiles(inputDirectory);
		List<org.gaviot.transformer.model.sancor.Orden> ordenesSancor=new ArrayList<org.gaviot.transformer.model.sancor.Orden>();
		
		if (!excelFiles.isEmpty()) {
			for (File excelFile : excelFiles) {
				try {
					List<Orden> ordenes = reader.read(excelFile);
					for (Orden orden : ordenes) {
						OrdenSancorBuilder builder = new OrdenSancorBuilder();
						builder.addIdOrden(orden.getOrdenId())
								.addFechaRegistro(orden.getSolicitud())
								.addClienteDomicilio(orden.getDomicilio())
								.addRiesgoLocalidad(orden.getLocalidad())
								.addAseguradora(orden.getAseguradora())
								.addBienAsegurado(orden.getBienAsegurado())
								.addRiesgoACubrir(orden.getRiesgoACubrir())
								.addSumaAsegurada(orden.getSumaAsegurada())
								.addVigencia(orden.getVigencia())
								.addObservaciones("")
								.addVigenciaInicio(orden.getVigenciaInicio())
								.addVigenciaFin(orden.getVigenciaFin());
						ordenesSancor.add(builder.build());
					}
					OutputExcelWriter writer = new OutputExcelWriter();
					String outputFile = outputDirectory + File.separator + "SANCOR_" + excelFile.getName();
					String template=ClassLoader.getSystemResource("TEMPLATE.xls").getFile();
					writer.write(template, ordenesSancor, outputFile);
				} catch (InvalidFormatException e) {
					LOGGER.error("Se produjo un error.", e);
				} catch (IOException e) {
					LOGGER.error("Se produjo un error.", e);
				} catch (SAXException e) {
					LOGGER.error("Se produjo un error.", e);
				}
			}
		}

	}

}
