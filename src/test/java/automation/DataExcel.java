package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("D:\\Study\\DATA\\Testing\\eclipse\\Auto\\testdata\\datafile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet =  workbook.getSheet("Sheet1");
		
		int totalnorows = sheet.getLastRowNum();
		
		int totalcells = sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalnorows +","+  totalcells);
//		count start from 0
		
		for (int r=0; r< totalnorows; r++)
		{
			XSSFRow row = sheet.getRow(r);
			
			for (int c=0; c<totalcells; c++)
			{
				XSSFCell cell = row.getCell(c);
				
				System.out.print(cell.toString() +"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
		
	}

}
