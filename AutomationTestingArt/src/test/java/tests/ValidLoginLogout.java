package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage_PF;
import pageObject.LoginPage_PF;

public class ValidLoginLogout {
	WebDriver driver;
	@BeforeTest
	public void Setup()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationWithSelenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	}
		@Test
		public void LoginToFB()
		{
			LoginPage_PF loginpage=PageFactory.initElements(driver,LoginPage_PF.class);
			
			loginpage.txtbx_UserName.sendKeys("ks.gd1994@gmail.com");
			loginpage.txtbx_Password.sendKeys("Jaimatadi1@");
			loginpage. btn_login.click();
			{
				System.out.println("Login Successfully,now it is the time to log off");
			}
		}
		@Test
		public void LogOutToFB() throws AWTException
		{
			HomePage_PF homepage=PageFactory.initElements(driver,HomePage_PF.class);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
			homepage.lnk_AccountSetting.click();
			homepage.lnk_LogOut.click();
			driver.quit();
			
		}
}
