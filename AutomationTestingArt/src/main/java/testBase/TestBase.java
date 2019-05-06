package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop=new Properties();
		    FileInputStream ip=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\AutomationTestingArt\\src\\main\\resources\\Confic.properties");
		    prop.load(ip);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void intialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationWithSelenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox")) {
	System.setProperty("|http://www.google.com/search?q=*&source-id=Mozilla%20Firefox&start=0\"", null);
	driver=new ChromeDriver();

}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));


}
}
