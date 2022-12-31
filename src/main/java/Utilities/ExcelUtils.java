package Utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	private Workbook wb;

	public ExcelUtils(String excelFileName) throws EncryptedDocumentException, IOException {
		if (wb == null) {

			InputStream is = PropertiesFileUtils.class.getClassLoader()
					.getResourceAsStream("excelFiles/" + excelFileName);

			wb = WorkbookFactory.create(is);
		}
	}

	public LinkedHashMap<String, String> getExcelDataAsMap(String sheetName) {
		LinkedHashMap<String, String> dataAsMap = new LinkedHashMap<String, String>();
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			String key=row.getCell(0).getStringCellValue();
			String value=row.getCell(1).getStringCellValue();
			dataAsMap.put(key, value);
		}
		
		return dataAsMap;

	}

}
