package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTocartTest extends BaseTest
{

	
	@Test (priority=2)
	public void searchtextwine() 
	{
		
     cart.searchtext("Wine");
	}
	
	@Test(priority=3)
	public void productsearchimage() throws InterruptedException
	{
		Thread.sleep(3000);
		cart.SearchProduct();
	}
	@Test (priority=4)
	public void AddProduct()
	{
		
    cart.Addbasket();
	}
}
