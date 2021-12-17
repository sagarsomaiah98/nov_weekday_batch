import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Write_Excel {
	
	
	//Download apache poi jars-https://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-5.1.0-20211024.zip
	
	//https://poi.apache.org/components/spreadsheet/quick-guide.html

	public static void main(String[] args) throws IOException {
		
		
		Workbook wb = new HSSFWorkbook();
		
		try  (OutputStream fileOut = new FileOutputStream("D:\\JANBASK\\NOV WEEKDAY BATCH\\Excel_Read_Write\\src\\TEST_SUITE\\SampleTest.xls"))
		
		
		
		{
			
			Sheet sheet1 = wb.createSheet("SHEET_1");
			Sheet sheet2 = wb.createSheet("SHEET_2");
			Row row = sheet1.createRow(0);
			
			Row row1 = sheet2.createRow(1);
	        Cell cell1 = row1.createCell(0);
	       
	        cell1.setCellValue(100);
	        //or
	        row1.createCell(1).setCellValue(2.1);
	        row1.createCell(2).setCellValue("janbask");
	             
	        row1.createCell(3).setCellValue(false);
			
		    wb.write(fileOut);
		}

		

	}

}
