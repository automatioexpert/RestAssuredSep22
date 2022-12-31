package UnitTest;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;

import Utilities.ExcelUtils;

public class TestExcelUtils {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		ExcelUtils excel = new ExcelUtils("DemoExcel.xlsx");

		LinkedHashMap<String, String> data = excel.getExcelDataAsMap("Sheet1");
		System.out.println(data);

	}

}
