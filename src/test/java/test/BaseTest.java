package test;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.AddToCart;
import utility.ReadData;

public class BaseTest  
{
	static public WebDriver driver;
	AddToCart cart;
	@BeforeSuite
	public void launch() throws IOException
	{
	driver =new ChromeDriver();
 
     driver.manage().window().maximize();
     driver.get(ReadData.getPropData("url"));
	}
	@BeforeTest
	public void Constructor()
	{
		 cart = new AddToCart (driver);
	}


}
