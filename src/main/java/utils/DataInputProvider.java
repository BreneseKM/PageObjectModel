package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class DataInputProvider{

	
	
	public static String[][] getdata(String sheetName){
		
	       	String[][] testdata =null;
		
		   
		try {
			FileInputStream fi=new FileInputStream("./testData/TestDataSheet.xlsx");
			XSSFWorkbook wbook=new XSSFWorkbook(fi);
			XSSFSheet sheet=wbook.getSheet(sheetName);
			int rowcount=sheet.getLastRowNum();
			int colcount=sheet.getRow(0).getLastCellNum();
			testdata=new String[rowcount][colcount];
			for(int i=1;i<=rowcount;i++) {
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<colcount;j++) {
					String cellvalue=row.getCell(j).getStringCellValue();
					System.out.println("The value of row "+i+"and column "+j+" is "+cellvalue+"");
					testdata[i-1][j]=cellvalue;
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return testdata;
		
	}

}
