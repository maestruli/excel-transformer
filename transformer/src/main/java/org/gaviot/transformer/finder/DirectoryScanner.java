package org.gaviot.transformer.finder;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class DirectoryScanner {
	final static String XLS_EXTENSION = ".xls";

	public List<File> getExcelFiles(String path) {
		List<File> ret = new ArrayList<File>();
		File directory = new File(path);
		FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (pathname.getPath().toLowerCase().endsWith(XLS_EXTENSION)) {
					return true;
				}
				return false;
			}
		};
		File[] onlyFiles = directory.listFiles(fileFilter);
		for (File f : onlyFiles) {
			ret.add(f);
		}
		return ret;
	}
}
