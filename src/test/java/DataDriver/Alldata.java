package DataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alldata {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\INDHU\\eclipse-workspace\\Automationpractise\\target\\USERDATA.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		int row_size = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < row_size ; i++) {
			
			Row row = sheetAt.getRow(i);
			int cell_size = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < cell_size; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else if (cellType.equals(cellType.NUMERIC)) {
					double numeric = cell.getNumericCellValue();
					int value = (int) numeric;
					System.out.println(value);
					
				}
				
			}
			
		}
		
		
	}
	
	}
