package learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
   XSSFWorkbook wb;
	
	public ExcelDataProvider() 
	{
		File src = new File("./TestData/Data.xlsx");
		
			try {
				FileInputStream fis = new FileInputStream(src);
				wb = new XSSFWorkbook(fis);
		     	}
		   catch (Exception e)
			    {
				System.out.println("Unable to read Excel File"+e.getMessage());
			    } 
	  }
		
	public String getStringData(String sheetName, int row, int Column)
	{
	return wb.getSheet(sheetName).getRow(row).getCell(Column).getStringCellValue();
	}
	
	public String getStringData(int sheetIndex, int row, int Column)
	{
	return wb.getSheetAt(sheetIndex).getRow(row).getCell(Column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int Column)
	{
	return wb.getSheet(sheetName).getRow(row).getCell(Column).getNumericCellValue();
	}
	
	
}
	

