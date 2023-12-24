package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public  class ReadData 
{                                           // url from the base test class
	public static String getPropData(String key) throws IOException 
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\configue.properties";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key); // url

		return value;

	}

}
