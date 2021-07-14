package DataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {
	
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\INDHU\\eclipse-workspace\\Automationpractise\\target\\USERDATA.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet createSheet = wb.createSheet("New excel");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("User Name");
		
		wb.getSheet("New excel").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("New excel").createRow(1).createCell(0).setCellValue("Induja");
		wb.getSheet("New excel").getRow(1).createCell(1).setCellValue("ABC123");
		
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("Sheet created successfully");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
