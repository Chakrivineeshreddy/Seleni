package task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Exl {
	

	public static void main(String[] args) throws Throwable {
		File ex=new File("C:\\Users\\chakr\\Desktop\\test cases.xlsx");
		FileInputStream in=new FileInputStream(ex);
		XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet=book.getSheet("Logout");
		int row=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cells;j++)
				
			{
				DataFormatter df=new DataFormatter();
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
			}
			System.out.println("_________________");
		}

	}

}
