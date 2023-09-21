package Library_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtiityClass 
{
	
	//Automation TE: Viraj
	//Date:15/01/2023
	//Day:Sat
	//Fetch Data From Property File
	
	@Test                 //EM               //PSW
	public static String getDatafromPF(String key) throws IOException 
	{
		//To reach upto property file
		FileInputStream file=new FileInputStream("C:\\Users\\VIRAJ\\eclipse-workspace\\6_Aug_A_Morning_Maven\\propertyFile.propertites");
		
		//Create object of propertites Class
		Properties prop=new Properties();
		
		//To open property file
		prop.load(file);
		
		//To fetch data from PF
	String	value1=prop.getProperty(key); //EM    saradeg41@gmail.com
		                                   //PSW  Sai@1117
	
			return value1;    //saradeg41@gmail.com   Sai@1117
	
	}
	
	
	
	@Test                                       //6       //0
	public static String getDatafromExcelsheet(int Row,int Cell) throws EncryptedDocumentException, IOException 
	{
		
		//To reach upto Excelsheet	
		  FileInputStream file=new FileInputStream("C:\\Users\\VIRAJ\\eclipse-workspace\\6_Aug_A_Morning_Maven\\TestData\\6_Aug_A_morning.xlsx");
				
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet12"); 
				               //6           //0
	   String Value2=Sh.getRow(Row).getCell(Cell).getStringCellValue(); //saradeg41@gmail.com   //Guru99
		
		
		return Value2;  //saradeg41@gmail.com  //Guru99  //"25"  //50000
		
	}
	
	
	
	@Test                //driver-->info                        //101
	public static void CaptureScreenshot(WebDriver driver, int TestCaseID) throws IOException
	{
		 //Typecast/Downcasting/Convert   
		File  Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
		System.out.println(Source);
		   
		                                                      //101
		File Destination=new File("C:\\Users\\VIRAJ\\eclipse-workspace\\6_Aug_A_Morning_Maven\\Screenshot\\"+TestCaseID+".jpg");
		   
		FileHandler.copy(Source,Destination);  //Source Path    Destination Path
		   
	}
	
	
	
	
	
	
	

}
