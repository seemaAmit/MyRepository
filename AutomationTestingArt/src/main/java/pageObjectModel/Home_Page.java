package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	private static WebElement element=null;
	public static WebElement lnk_Profile(WebDriver driver) {
	element=driver.findElement(By.xpath("//span[@class='_1vp5']"));
	return element;

}

  public static WebElement lnk_AccountSetting(WebDriver driver)
  {
  element=driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
  return element;
  }
  public static WebElement lnk_logout(WebDriver driver)
  {
  element=driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
  return element;
  }
}



