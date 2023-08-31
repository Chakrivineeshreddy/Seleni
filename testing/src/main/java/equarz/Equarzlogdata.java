package equarz;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Equarzlogdata {
	@DataProvider
	public String[][] logdata() throws Throwable
	{
		File ex=new File("C:\\Users\\chakr\\Desktop\\Log.xlsx");
		//System.out.println(ex.exists());
		FileInputStream in=new FileInputStream(ex);
		XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet=book.getSheet("sheet1");
		int row=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(1).getLastCellNum();
		String[][] data=new String[row-1][cells];
		
		for(int i=0;i<row-1;i++)
		{
			for(int j=0;j<cells;j++)
				
			{
				DataFormatter df=new DataFormatter();
				//System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		
		}
//		for(String []arr:data)
//		{
//			System.out.println(Arrays.toString(arr));
//		}
		book.close();
		in.close();
		return data;

}
}
