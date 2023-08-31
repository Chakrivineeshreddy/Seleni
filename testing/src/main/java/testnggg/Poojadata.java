package testnggg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Poojadata {
	@DataProvider(parallel = true)
	public String[][] log() throws Throwable
	{
		File Data=new File("C:\\Users\\chakr\\Desktop\\Log.xlsx");
		FileInputStream input=new FileInputStream(Data);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheeeet=workbook.getSheet("Pooja");
		int row=sheeeet.getPhysicalNumberOfRows();
		int cell=sheeeet.getRow(1).getLastCellNum();
		String rowdata[][]= new String[row-1][cell];
		for(int i=0;i<row-1;i++)
		{
			for(int j=0;j<cell;j++)
			{  
				DataFormatter dformater=new DataFormatter();
				rowdata[i][j]=dformater.formatCellValue(sheeeet.getRow(i+1).getCell(j));
				}
		}
		workbook.close();
		input.close();
		return rowdata;
		
	}
	

}
