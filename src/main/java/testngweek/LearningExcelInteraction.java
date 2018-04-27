package testngweek;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearningExcelInteraction {

	public Object[][] readExcel() throws IOException {
		// Pre-req: 1) Create a folder with in your project (eclipse) and name it as data
		// 2) Create a xlsx file with in that folder with required columns and rows
	
		// a) Open the Excel from the path ./data/TC001.xlsx

		XSSFWorkbook wBook=new XSSFWorkbook("./data/TestData.xlsx");
		// b) Go to the sheet (first sheet)

		XSSFSheet sheet= wBook.getSheetAt(0);
		// c) Find the number of rows in the sheet 

		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		// d) Go to header row 

		XSSFRow row = sheet.getRow(0);
		// e) find the number of columns

		short columnCount = row.getLastCellNum();
		System.out.println(columnCount);
		Object[][] data=new Object[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			// f) Go to first data row

			XSSFRow firstRow = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				// g) Go to first cell of that row

				XSSFCell cell = firstRow.getCell(j);
				// h) Print the content of that cell

				data[i-1][j] = cell.getStringCellValue();
				System.out.println(data[i-1][j]);
			} 
		}
		return data;
		
		
		
		
	}

}
