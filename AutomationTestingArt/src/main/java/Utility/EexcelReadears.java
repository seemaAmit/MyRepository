package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EexcelReadears {
	 public static void main(String args[]) throws IOException
	 {
		 //try {
		 File src=new File("C:\\Users\\HP\\Documents\\datadriven.xlsx");
		 //load file
		 FileInputStream fis=new FileInputStream(src);
		 //load workbook
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 //load sheet -here we are loading first sheet only
		 XSSFSheet sh1=wb.getSheetAt(0);
		 //get row()specify which row we want to read
		//get row()specify which clounm we want to read
		 //getStringCellValue() specify that we
		 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
		 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		 System.out.println(sh1.getRow(3).getCell(0).getStringCellValue());
		 System.out.println(sh1.getRow(3).getCell(1).getRawValue());
		 sh1.getRow(0).createCell(2).setCellValue("passed");
		 sh1.getRow(1).createCell(2).setCellValue("passed");
		 sh1.getRow(2).createCell(2).setCellValue("failed");
		 sh1.getRow(3).createCell(2).setCellValue("success");
		 FileOutputStream fout=new  FileOutputStream(new File("C:\\\\Users\\\\HP\\\\Documents\\\\datadriven.xlsx"));
		 wb.write(fout);
		 }
}
		 
		  //catch(Exception e) {
		  
		 // System.out.println(e.getMessage());
	 
	 

