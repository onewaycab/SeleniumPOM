package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ui_component.LoginComponent;

public class AbstractTest 
{
	LoginComponent 	loginComponent;
	WebDriver driver;
    
	public AbstractTest()
	{
		loginComponent=new LoginComponent();
		
	}
	@BeforeTest
	public void setupEnvironment()
	{
System.setProperty("webdriver.chrome.driver",System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe"));
WebDriver driver=new ChromeDriver();
driver.get("http://newtours.demoaut.com");
PageFactory.initElements(driver, loginComponent);
	}
	@AfterTest
	public void closeEnvironment()
	{
		driver.close();
	}
}
