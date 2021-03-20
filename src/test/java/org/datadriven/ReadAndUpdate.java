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
public class ReadAndUpdate {
    
	public static void mindtree() {
		System.out.println("Welcome to Mindtree family");

	}
	
	public static void main(String[] args) throws IOException {

        File f = new File("C:\\\\Users\\\\RAHUL\\\\eclipse-workspace\\\\MavenData\\\\Excel\\\\Book1.xlsx");
        FileInputStream fs = new FileInputStream(f);
        
        Workbook w = new XSSFWorkbook(fs);
        Sheet s = w.getSheet("Sheet0");
        Row r = s.getRow(4);
        Cell c = r.getCell(3);
        String sc = c.getStringCellValue();
        if(sc.equals("Rahul")) {
        	c.setCellValue("Thangavel");
        	FileOutputStream o = new FileOutputStream(f);
        	w.write(o);
        
        }
        
        mindtree();
        
	}

	

}
