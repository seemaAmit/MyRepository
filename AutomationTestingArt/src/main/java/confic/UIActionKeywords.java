package confic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIActionKeywords 
{
	public static WebDriver d;
	
	public static void openbrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationWithSelenium\\chromedriver.exe");
		d=new ChromeDriver();
		
		}
	
	public static void openApp() {
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.facebook.com");
	}
	
	public static void enterEmail()
	{
		d.findElement(By.id("email")).sendKeys("ks.gd1994@gmail");
	}
	
	public static void enterpassword () 
	{
		d.findElement(By.id("pass")).sendKeys("Jaimatadi1@");
}
	public static void clicklogin()
	{
		d.findElement(By.xpath("//input[@value='Log In']"));
}
	public static void applywait() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	public static void closeBrowser()
	{
		d.quit();
	}
	}