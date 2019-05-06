package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage_PF {
	@FindBy(how=How.XPATH,using="//div[@class='_6qfu _5lxt f_click']")
	//@FindBy(how=How.XPATH,using="//div[@id='userNavigationLabel']")
    public WebElement lnk_AccountSetting;
    
	@FindBy(how=How.XPATH,using=".//*[@id='account_logout']/a")
    public WebElement lnk_LogOut;
}
