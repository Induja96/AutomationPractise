package DataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class column_data {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\INDHU\\eclipse-workspace\\Automationpractise\\target\\USERDATA.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		int numberOfSheets = wb.getNumberOfSheets();
		System.out.println("Numer of sheet :"+numberOfSheets);

		Sheet sheetAt = wb.getSheetAt(0);
		int row_size = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Number of rows :" + row_size);
		
		int row_count = sheetAt.getPhysicalNumberOfRows();
	
		for (int i = 0; i < row_count; i++) {
			
			System.out.println("Column Data");

			for (int j = 0; j < 3; j++) {

				Row row = sheetAt.getRow(j);
				Cell cell = row.getCell(i);

				System.out.println(cell);

			}
		}
	}
}
