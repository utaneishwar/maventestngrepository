package utility;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Source;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotcode
{
 public String ScreenshotReader(WebDriver driver ,String Filename) throws IOException
 {
       TakesScreenshot ts = (TakesScreenshot)driver;
      File source = ts.getScreenshotAs(OutputType.FILE);
     //String path = System.getProperty("User.dir")+"\\Reports\\Screenshots\\living.jpg";
      String path ="C:\\Users\\intel\\eclipse-workspace\\MavenTestng\\Reports\\Screenshots\\living.jpg";
       //	String path = "C:\\Users\\intel\\eclipse-workspace\\MavenTestng\\Reports\\Screenshots";
       File file =new File(path);
       FileHandler.copy(source, file);
       return path;
	
}
}
