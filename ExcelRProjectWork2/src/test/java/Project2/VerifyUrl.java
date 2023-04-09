package Project2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyUrl 
{
	@Test
	public static void main() throws IOException
	{
		try {
			System.setProperty("Webdriver.chromedriver","C:\\Users\\polavaishnavi\\eclipse-workspace\\ExcelRProjectWork2");
			FileInputStream fis = new FileInputStream ("/ExcelRProjectWork2/src/test/resources/propertyfile/config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(prop.getProperty("Url"));
			
			driver.manage().window().maximize();
					
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	    	
	}

}
