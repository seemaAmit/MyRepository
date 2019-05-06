package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_PF {
	@FindBy(how=How.ID,using="email")
     public WebElement txtbx_UserName;
	
	@FindBy(how=How.ID,using="pass")
    public WebElement txtbx_Password;
	
	@FindBy(how=How.XPATH,using="//input[@value='Log In']")
    public WebElement btn_login;
}
