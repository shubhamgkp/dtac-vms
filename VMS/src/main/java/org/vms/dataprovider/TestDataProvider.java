package org.vms.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFirstFooter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class TestDataProvider {

	@DataProvider(name="XL")
	public static Object[][] dataprovider() throws IOException {
		
		File file = new File("./TestData/TestData.xlsx");
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int n=sheet.getPhysicalNumberOfRows();
		Object[][] testData = new Object[n][2];
		
		for(int i=0;i<n;i++) {
			
			XSSFRow row = sheet.getRow(i);
			XSSFCell roleCode=row.getCell(0);
			XSSFCell roleName=row.getCell(1);
			
			testData[i][0]=roleCode.getStringCellValue();
			testData[i][1]=roleName.getStringCellValue();			
		}
		return testData;
	}
}
