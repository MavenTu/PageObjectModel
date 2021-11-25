package utils1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtils1 {
	
	
	@Test
	public static void getRowCount() throws IOException {
		
		
	
			XSSFWorkbook book = new XSSFWorkbook("D:\\MyWorkspace\\TestNG\\excel1\\testNGExcel.xlsx");
			XSSFSheet sheet  = book.getSheet("Sheet1");
		
			int rows=sheet.getLastRowNum();   
			int cols=sheet.getRow(1).getLastCellNum();
			for(int r=0;r<=rows;r++) 
			{
				XSSFRow row=sheet.getRow(r);
			for (int c=0;c<cols;c++)
			{
				
				XSSFCell cell= row.getCell(c);
				switch(cell.getCellType())
				{
				case STRING:System.out.println(cell.getStringCellValue());break;
				case NUMERIC:System.out.println(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
				}
			}
			System.out.println();
	}

	}
}




