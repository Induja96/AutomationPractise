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

public class Rowdata {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\INDHU\\eclipse-workspace\\Automationpractise\\target\\USERDATA.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);
		int row_size = sheetAt.getPhysicalNumberOfRows();
		Row row = sheetAt.getRow(1);

		for (int i = 0; i < row_size; i++) {

			int cell_size = row.getPhysicalNumberOfCells();
			Cell cell = row.getCell(i);

			CellType cellType = cell.getCellType();

			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);

			} else if (cellType.equals(cellType.NUMERIC)) {
				double numeric = cell.getNumericCellValue();
				int value = (int) numeric;// narrow casting
				System.out.println(value);

			}

		}

	}

}
