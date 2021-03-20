package org.datadriven;

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


@SuppressWarnings("unused")
public class WriteUpdate {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\RAHUL\\eclipse-workspace\\MavenData\\Excel\\Book1.xlsx");
	
		Workbook w = new XSSFWorkbook();  
		Sheet s = w.createSheet();
		Row r = s.createRow(4);
		Cell c = r.createCell(3);
		
		c.setCellValue("Rahul");
		FileOutputStream stream = new FileOutputStream(f);
		w.write(stream);
		
		System.out.println("Successfully Written");
		
		

	}

}
