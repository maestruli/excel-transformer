package org.gaviot.transformer.finder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

/**
 * The Class DirectoryScanner.
 */
public class DirectoryScanner {
	final static String XLS_EXTENSION = ".xls";
	final static String XLSX_EXTENSION = ".xlsx";

	/**
	 * Gets the excel files.
	 *
	 * @param path the path
	 * @return the excel files
	 */
	public List<File> getExcelFiles(String path) {
		List<File> ret = new ArrayList<File>();
		File directory = new File(path);
		IOFileFilter xlsFileFilter = FileFilterUtils.andFileFilter(FileFilterUtils.fileFileFilter(),
				FileFilterUtils.suffixFileFilter(".xls"));
		IOFileFilter xlsxFileFilter = FileFilterUtils.andFileFilter(FileFilterUtils.fileFileFilter(),
				FileFilterUtils.suffixFileFilter(".xlsx"));
		java.io.FileFilter fileFilter = FileFilterUtils.orFileFilter(xlsFileFilter, xlsxFileFilter);
		File[] onlyFiles = directory.listFiles(fileFilter);
		for (File f : onlyFiles) {
			ret.add(f);
		}
		return ret;
	}
}
