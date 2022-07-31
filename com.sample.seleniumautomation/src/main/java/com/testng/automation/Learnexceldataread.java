package com.testng.automation;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Learnexceldataread {
	
@Test
public void dataread() throws IOException {
	
	XSSFWorkbook wbook = new XSSFWorkbook("./Utilities/data.xlsx");
	XSSFSheet sheet = wbook.getSheet("Sheet1");
	int rowcount = sheet.getLastRowNum();
	int colcount = sheet.getRow(0).getLastCellNum();
	
	for (int i=1;i<=rowcount;i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j=0;j<colcount;j++) {
			
			XSSFCell cell = row.getCell(j);
			String CellValue = cell.getStringCellValue();
			System.out.println(CellValue);
			
			
		}
	}
	wbook.close();
	
}

	

}
