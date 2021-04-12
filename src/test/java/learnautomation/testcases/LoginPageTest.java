package learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import learnautomation.base.BaseClass;
import learnautomation.pages.LoginPage;
import learnautomation.pages.RegisterPage;
import learnautomation.utility.BrowserFactory;

public class LoginPageTest extends BaseClass{

	
	//WebDriver driver;
	@Test
	public void signinApp() throws InterruptedException
	{
		
	    logger=report.createTest("Login to Guru");
	    		
		//driver=BrowserFactory.startApplication(driver, "Chrome", "http://demo.guru99.com/test/newtours/index.php");
		LoginPage logpage=PageFactory.initElements(driver, LoginPage.class);
		//logpage.Loginuser("piyu12", "Piyu1249");
		
		logger.info("Starting Application");
		
        logpage.Loginuser(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		//BrowserFactory.quitbrowser(driver);
		
		logger.pass("Login Success");
	}
	
	}
