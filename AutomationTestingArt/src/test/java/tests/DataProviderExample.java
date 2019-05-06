package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import Utility.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage_PF;
import pageObject.LoginPage_PF;

public class DataProviderExample {
	WebDriver driver;
	
	/*@DataProvider(name="Authentication")
	public static Object[][] credentials() {
			return new Object[][]
			{{"testuser1","test@23","seyu34,SJHG23"},};*/
	@DataProvider(name="Authentication")
	public static Object[][] credentials() throws Exception{
		 ExcelUtils.setExcelFile("C:\\Users\\HP\\Documents\\datadriven.xlsx","Sheet1");
		 Object[][] obj=ExcelUtils.getExcelData();
		 return obj;
	}
	
  
	
@Test(dataProvider="Authentication")
public void test(String Username,String Password) throws AWTException{
	System.setProperty("webdriver.chrome.driver", "C:\\AutomationWithSelenium\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys(Username);
	driver.findElement(By.id("pass")).sendKeys(Password);
	//driver.findElement(By.xpath("//input[@value='log in']")).click();
	driver.quit();
	
	
}
}
			
		
