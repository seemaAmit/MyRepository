package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectModel.Home_Page;
import pageObjectModel.Login_Page;

public class TC_ValidLogin {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationWithSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//use page object library now 
		Login_Page.txtbx_UserName(driver).sendKeys("ks.gd1994@gmail.com");
		Login_Page.txtbx_Password(driver).sendKeys("Jaimatadi1@");
		Login_Page.txtbx_LogIn(driver).click();
		System.out.println("login sucessfully");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		Home_Page.lnk_AccountSetting(driver).click();
		Home_Page.lnk_logout(driver).click();
		System.out.println("logout sucessfully");
		
		
		
		

}
}
