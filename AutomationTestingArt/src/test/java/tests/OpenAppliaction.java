package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.ScreenShotCapture;
import testBase.TestBase;

public class OpenAppliaction {
	public static void main (String[] arg) throws Exception {
	TestBase obj=new TestBase();
    obj.intialization();
     //ScreenShotCapture.getScreenShot(TestBase.driver, "LoginScreenshot");
    // TestBase.driver.close();
     TestBase.driver.findElement(By.xpath("email").className("_2zrpKA").value("seemarkdfist@gmail.com"));
}
}