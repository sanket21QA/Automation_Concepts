package automation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcelCreate {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("D:\\Study\\DATA\\Testing\\eclipse\\Auto\\testdata\\"
								+ "newdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("dataSheet");
		
		XSSFRow row0 =  sheet.createRow(0);
		
			row0.createCell(0).setCellValue("welcome");   // entry in column cells
			row0.createCell(1).setCellValue(12345);
			row0.createCell(2).setCellValue("PUNE");
		
			
		workbook.write(file);
		
		workbook.close();
		file.close();
		
//		for dynamic input
		
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		
		
		
		
		
			
		
	}

}
