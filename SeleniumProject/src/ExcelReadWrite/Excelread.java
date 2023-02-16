package ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	
	public static void main(String[] args) throws IOException {
//		File path = new File("‪D:\\Book1.xlsx");
		FileInputStream load= new FileInputStream("‪‪C:\\Users\\mis\\Pictures\\shubh.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet= workbook.getSheetAt(0);
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
	}

}
