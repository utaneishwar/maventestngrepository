package extentreport;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import test.BaseTest;
import utility.Screenshotcode;





public class TestNG extends BaseTest implements ITestListener
{
	ExtentReports extent =ExtentReportGenrate.ExtentReport();
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("test case "+result.getName()+" Started");
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test case "+result.getName()+" Has passed");
		test.log(Status.PASS,"Test Case Passed");
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("test case "+result.getName()+" has failed");	
		test.fail(result.getThrowable());

		Screenshotcode scr=new Screenshotcode();



		try {
			String path = scr.ScreenshotReader(driver, result.getName());
			test.addScreenCaptureFromPath(path);
		}
		catch (IOException e)
		{

			System.out.println("while excuting take screenshot");
			String message = e.getMessage();
			System.out.println(message);
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("test case "+result.getName()+" has Skipped");
		test.log(Status.SKIP, "test case Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{

	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("test tag "+context.getName()+" has started ");		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("test tag "+context.getName()+" has completed ");
		extent.flush();
	}

}
