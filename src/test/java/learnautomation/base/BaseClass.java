package learnautomation.base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import learnautomation.utility.BrowserFactory;
import learnautomation.utility.ExcelDataProvider;

public class BaseClass {
	
public WebDriver driver;
public ExcelDataProvider excel;
public ExtentReports report;
public ExtentTest logger;


@BeforeSuite
public void SetupSuite()
{
 excel = new ExcelDataProvider();
 
 //ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/FreeGuru.html"));
 ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("./Reports/FreeGuru.html"));
 report = new ExtentReports();
 report.attachReporter(extent);
 
 
}

@BeforeClass
public WebDriver StartApp()
{
	driver=BrowserFactory.startApplication(driver, "Chrome", "http://demo.guru99.com/test/newtours/index.php");	
    return driver;
}

@AfterClass
public void quitApp()
{
	BrowserFactory.quitbrowser(driver);
}


@AfterMethod
public void flushrep()
{
report.flush();
}


}