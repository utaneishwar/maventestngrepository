package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart
{
 WebDriver driver;
 WebDriverWait  wait;
	@FindBy (xpath ="(//*[@name='q'])[1]")
	WebElement search;
	
	@FindBy (xpath ="(//*[@class='grid-item__content'])[1]")
	WebElement image;
	@FindBy (xpath="//*[@name='add']")
	WebElement submit;
	
	public AddToCart (WebDriver driver)
	{
		this.driver = driver;
	PageFactory.initElements(driver, this);
	wait =new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	
	public void searchtext(String searchtext)
	{
      
		wait.until(ExpectedConditions.visibilityOf(search));
  		  search.sendKeys(searchtext);
  		  search.click();
	}
	public void SearchProduct()
	{
		image.click();
	}
	public void Addbasket()
	{
		submit.click();
	}
	
	
	
}
