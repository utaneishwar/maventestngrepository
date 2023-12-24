package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart
{
 WebDriver driver;
 WebDriverWait  wait;
 
 ////*[@class='site-header__search-form is-active']
 ////*[@action='/search']
	
 
   @FindBy (xpath ="(//*[@name='q'])[1]")
	WebElement search;
	@FindBy (xpath ="//*[@fill='rgba(255,255,255,1)']")
	WebElement popup;
	
	////*[@id="shopify-section-template--14917334401158__main"]//*[text()='Freixenet Alcohol-Removed Sparkling White Wine']
	
	@FindBy (xpath ="(//*[@class='grid-item__meta']//*[text()='Freixenet Alcohol-Removed Sparkling White Wine'])[2]")
	WebElement image;
	
////*[@id="AddToCartForm-template--14917335646342__main-6875173224582"]//*[@type='submit']
	@FindBy (xpath="//*[@id=\"AddToCartForm-template--14917335646342__main-6875173224582\"]//*[@type='submit']")
	WebElement submit;
	
	public AddToCart (WebDriver driver)
	{
		this.driver = driver;
	PageFactory.initElements(driver, this);
	wait =new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void PopupHandle() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(popup));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].click();", popup);
		
	    
		
		
//		Thread.sleep(2000);
//		
     	//  popup.click();
	}   
	
	// wine
	public void searchtext(String searchtext) 
	{
		  // wait.until(ExpectedConditions.visibilityOf(search));
		    
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		     js.executeScript("arguments[0].'value=searchtext'",search);
		
		      search.sendKeys(searchtext);  // wine 
  		      Actions act  =new Actions(driver);
  		      act.sendKeys(Keys.ENTER).build().perform();
	}
	public void SearchProduct()
	{
		//wait.until(ExpectedConditions.visibilityOf(image));
		image.click();
	}
	public void Addbasket()
	{
		//wait.until(ExpectedConditions.visibilityOf(submit));
		submit.click();
	}
	
	
	
}
