package learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import learnautomation.base.BaseClass;
import learnautomation.pages.RegisterPage;
import learnautomation.utility.BrowserFactory;

public class RegisterPageTest extends BaseClass{

	//WebDriver driver;
	@Test
	public void regApp() throws InterruptedException
	{
		//driver=BrowserFactory.startApplication(driver, "Chrome", "http://demo.guru99.com/test/newtours/index.php");
		
	    logger=report.createTest("Register to Guru");
	    logger.info("Starting Application");
	    logger.pass("Login Success");
		
		
		RegisterPage Regpage=PageFactory.initElements(driver, RegisterPage.class);
		Regpage.registeruser();
		//BrowserFactory.quitbrowser(driver);
	}
	
	
	
}
