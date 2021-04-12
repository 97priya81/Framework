package learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage 
{

	WebDriver driver;
	
	public RegisterPage(WebDriver bdriver)
	{
		this.driver = bdriver;
	}
	
	@FindBy(linkText = "REGISTER") WebElement regbtn;
	@FindBy(name = "firstName") WebElement fname;
	@FindBy(name = "lastName") WebElement lname;
	@FindBy(name = "phone") WebElement phn;
	@FindBy(id = "username") WebElement uname;
	@FindBy(name = "address1") WebElement add1;
	@FindBy(name = "city") WebElement cityname;
	@FindBy(name = "state") WebElement statename;
	@FindBy(name = "postalCode") WebElement postalcode;
	@FindBy(name = "country") WebElement countryname;
	@FindBy(id = "email") WebElement email;
	@FindBy(name = "password") WebElement password;
	@FindBy(name = "confirmPassword") WebElement confirmpassword;
	@FindBy(name = "submit") WebElement submit;
	
	public void registeruser () throws InterruptedException
	{
		regbtn.click();
		fname.sendKeys("Priya");
		lname.sendKeys("Joshi");
		phn.sendKeys("123655666");
		uname.sendKeys("piyu12");
		Thread.sleep(5000);
		add1.sendKeys("234 M.I.G Colony");
		cityname.sendKeys("Indore");
		statename.sendKeys("MadhyaPradesh");
		postalcode.sendKeys("455001");
		Select country1 = new Select(countryname);
		country1.selectByValue("INDIA");
		Thread.sleep(5000);
		email.sendKeys("Piyu912@gmail.com");
		password.sendKeys("Piyu1249");
		confirmpassword.sendKeys("Piyu1249");
		submit.click();


	}
}
