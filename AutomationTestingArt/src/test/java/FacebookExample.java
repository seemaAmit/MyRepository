import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectModel.Login_Page;
import testBase.TestBase;

public class FacebookExample {
	
	public static void main(String[] args) {
		TestBase c=new TestBase();
	    TestBase.intialization();
	Login_Page.txtbx_UserName(TestBase.driver).sendKeys("dbjdsfgs");
	Login_Page.txtbx_Password(TestBase.driver).sendKeys("gsdgdfg");
	Login_Page.txtbx_LogIn(TestBase.driver).click();
	
	   
	}

}
