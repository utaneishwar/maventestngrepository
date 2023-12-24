package extentreport;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utility.ReadData;
import utility.Screenshotcode;

public class ExtentReportGenrate 
{   
	static ExtentReports report;

	public static ExtentReports ExtentReport()
	{
		//String file = "C:\\Users\\intel\\eclipse-workspace\\MavenTestng\\Reports.html";
				//System.getProperty("User.dir")+"//reports//MavenTestng.html";
		
		
		String file= System.getProperty("user.dir")+"//reports//MavenTestng.html";
		ExtentHtmlReporter reporter =new ExtentHtmlReporter(file);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("MavenTestngHtmlReport");

		report =new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Executed by","MavenTestng" );
		report.setSystemInfo("Environment", "SIT");
		report.setSystemInfo("Browser","chrome" );
		return report;

	}
}

