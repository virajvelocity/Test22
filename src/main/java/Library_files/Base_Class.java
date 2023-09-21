package Library_files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	public WebDriver driver;
	
	public  void InitializeBrowser() 
	{
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIRAJ\\eclipse-workspace\\6_Aug_A_Morning_Maven\\Browser\\chromedriver.exe");	
			
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
			 driver=new ChromeDriver();
			
			
			//To open an application/To enter an URL
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
