package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationWithSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("ks.gd1994@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
	   password.sendKeys("Jaimatadi1@");
	   
	  driver.findElement(By.xpath("//input[@value='royal_login_button']")).click();
		//scrollPageDown(driver);
		}
	public void clickElementByJS(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",element);}
	
	//public static void scrollPageDown(WebDriver driver1) {
	// JavascriptExecutor js = (JavascriptExecutor)driver1;
	//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//js.executeScript("window.scrollBy(0,220)");	}

}


