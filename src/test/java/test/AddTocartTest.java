package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTocartTest extends BaseTest
{
	@Test (priority=0)
	public void pop0() throws InterruptedException 
	{
		Thread.sleep(2000);
       cart.PopupHandle();
	}
	
	
	@Test (priority=2)
	public void pop() throws InterruptedException 
	{
		Thread.sleep(2000);
       cart.PopupHandle();
	}
	
	
	
	@Test (priority=1)
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
	public void AddProduct() throws InterruptedException
	{
		Thread.sleep(3000);
       cart.Addbasket();
	}
}
