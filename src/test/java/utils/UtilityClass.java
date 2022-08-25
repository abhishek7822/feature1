package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class UtilityClass
{
	
	public static String readProperty(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}
	
		
	}
	

