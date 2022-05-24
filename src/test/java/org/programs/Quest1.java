package org.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Quest1 {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Krishna\\eclipse-workspace(1)\\Mavenframe\\External file\\Student details.xlsx");

		Workbook book = new XSSFWorkbook();
		Sheet sh = book.createSheet("Stud data");

		Row r = sh.createRow(0);
		Cell c = r.createCell(0);
		Cell c1 = r.createCell(1);
		c.setCellValue("Student Name");
		c1.setCellValue("Course details");

		Row r1 = sh.createRow(1);
		Cell c2 = r1.createCell(0);
		Cell c3 = r1.createCell(1);
		c2.setCellValue("Krithika");
		c3.setCellValue("Java");

		Row r2 = sh.createRow(2);
		Cell c4 = r2.createCell(0);
		Cell c5 = r2.createCell(1);
		c4.setCellValue("Pavithra");
		c5.setCellValue("Selenium");

		Row r3 = sh.createRow(3);
		Cell c6 = r3.createCell(0);
		Cell c7 = r3.createCell(1);
		c6.setCellValue("Tamil");
		c7.setCellValue("Framework");

		Row r4 = sh.createRow(4);
		Cell c8 = r4.createCell(0);
		Cell c9 = r4.createCell(1);
		c8.setCellValue("Lingesh");
		c9.setCellValue("SQL");

		Row r5 = sh.createRow(5);
		Cell c10 = r5.createCell(0);
		Cell c11 = r5.createCell(1);
		c10.setCellValue("Mugesh");
		c11.setCellValue("Maven");

		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);

		System.out.println("Done");
		
		
		int noRows = sh.getPhysicalNumberOfRows();
		System.out.println("Total no.of rows:"+noRows);
		
		int noCells = r.getPhysicalNumberOfCells();
		System.out.println("Total no.of cells:"+noCells*noRows);
		
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row row = sh.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
		
		
		
		
		
		
		
		

	}

}
