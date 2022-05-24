package org.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	public static void main(String[] args) throws IOException {

		// Locating a file
		File f = new File("C:\\Users\\Krishna\\eclipse-workspace(1)\\Mavenframe\\External file\\Maven data.xlsx");

		// To read
		FileInputStream fin = new FileInputStream(f);

		// WorkBook ------------> Interface
		Workbook book = new XSSFWorkbook(fin);

		Sheet sh = book.getSheet("Details");

		// To get rows
		int noofRows = sh.getPhysicalNumberOfRows();
		System.out.println("Total no of rows:" + noofRows);

		// To get particular row and cell
		Row r = sh.getRow(3);
		Cell c = r.getCell(2);
		System.out.println(c);

		// To get all rows and cells

		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {

			Row r1 = sh.getRow(i);
			for (int j = 0; j < r1.getPhysicalNumberOfCells(); j++) {

				Cell c1 = r1.getCell(j);
				System.out.println(c1);

			}

		}

		int type = c.getCellType();
		if (type==1) {
		
			String input = c.getStringCellValue();
			System.out.println(input);
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			System.out.println(da);
		//date to string
			
			SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
			String input = sim.format(da);
			System.out.println(input);
		}
		
		else {
			double d = c.getNumericCellValue();
			System.out.println(d);
			
			// double to long
			
			long l=(long)d;
			System.out.println(l);
			
			//long to string
			
			String input = String.valueOf(l);
			System.out.println(input);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
