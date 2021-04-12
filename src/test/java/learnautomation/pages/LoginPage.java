package learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


	WebDriver driver;
	
	public LoginPage(WebDriver bdriver)
	{
		this.driver = bdriver;
	}
	@FindBy(linkText = "SIGN-ON") WebElement signbtn;
	@FindBy(name = "userName") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(name = "submit") WebElement submit;
	
	public void Loginuser (String uname, String pwdnm) throws InterruptedException
	{
		signbtn.click();
		username.sendKeys(uname);
		password.sendKeys(pwdnm);
		submit.click();
}
}
