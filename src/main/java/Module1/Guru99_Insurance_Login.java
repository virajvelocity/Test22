package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_Insurance_Login 
{
	//POM-I
	
//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	@FindBy(xpath="//input[@name='email']")	private    WebElement   Email;   //private WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
	@FindBy(xpath="//input[@name='password']")	private   WebElement   Password;  //private WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
	@FindBy(xpath="//input[@name='submit']")	private        WebElement   loginbtn;//private WebElement loginbtn=driver.findElement(By.xpath("//input[@name='submit']"));
	
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public Guru99_Insurance_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3. Utilize within a method with access level public
	
	public void enterEmail(String EmailAdd)    //saradeg41@gmail.com
	{
		Email.sendKeys(EmailAdd); //saradeg41@gmail.com
	}
	
	
	public void enterPassword(String Pass)  //Sai@1117 
	{
		Password.sendKeys(Pass);   //Sai@1117
	}
	
	public void clickLoginBtn() 
	{
		loginbtn.click();
	}
	
	
	
	
	
	
	
	

}
