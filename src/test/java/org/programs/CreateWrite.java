package org.programs;

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

public class CreateWrite {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Krishna\\eclipse-workspace(1)\\Mavenframe\\External file\\Details.xlsx");
FileInputStream fin=new FileInputStream(f);
Workbook book=new XSSFWorkbook(fin);

//UPDATE MODIFYING THE EXITING DATA
Sheet sh = book.getSheet("Login");
Row r = sh.getRow(0);

Cell c = r.getCell(0);
String s  = c.getStringCellValue();

if (s.startsWith("U")) {
	
	c.setCellValue("email");
}
else {
	c.setCellValue("Ph no");
}

// NEW FILE CREATION
//		Workbook book = new XSSFWorkbook();
//		
//		Sheet sh = book.createSheet("Login");
//
//		Row r = sh.createRow(0);
//		Row r1 = sh.createRow(1);
//		
//		
//		Cell c1 = r.createCell(0);
//		Cell c2 = r.createCell(1);
//
//		Cell c3 = r1.createCell(0);
//		Cell c4 = r1.createCell(1);
//		
//		c1.setCellValue("Username");
//		c2.setCellValue("Password");
//		
//		c3.setCellValue("Krithika");
//		c4.setCellValue("12345");
		
		FileOutputStream fo=new FileOutputStream(f);
		book.write(fo);
		System.out.println("Written......");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
