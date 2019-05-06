package helper;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotCapture {
	public static String getScreenShot(WebDriver driver,String screenshotName) throws Exception
	{
		String dateName=new SimpleDateFormat("yyyyMddh").format(new Date());
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"//FailedTestScreenShots//"+screenshotName+dateName+".Png";
		File finalDestinaltion=new File(destination);
		FileHandler.copy(source,finalDestinaltion);
		return destination;
	}
	
}
