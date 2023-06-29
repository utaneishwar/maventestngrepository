package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.AddToCart;

public class BaseTest 
{
	static public WebDriver driver;
	AddToCart cart;
	@BeforeSuite
	public void launch()
	{
     driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.betterrhodes.com");
	}
	@BeforeTest
	public void Constructor()
	{
		 cart = new AddToCart (driver);
	}


}
