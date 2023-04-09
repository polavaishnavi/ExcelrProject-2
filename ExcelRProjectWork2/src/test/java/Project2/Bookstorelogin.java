package Project2;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bookstorelogin
{
	public static WebDriver driver;
	@Test
	public static void Login()
	{
		try {
			System.setProperty("Webdriver.chromedriver","C:\\Users\\polavaishnavi\\eclipse-workspace\\ExcelRProjectWork2");
			
			FileInputStream fis = new FileInputStream ("C:\\Users\\polavaishnavi\\eclipse-workspace\\ExcelRProjectWork2\\src\\test\\resources\\propertyfile\\config.properties");
			FileInputStream fis1 = new FileInputStream ("C:\\Users\\polavaishnavi\\eclipse-workspace\\ExcelRProjectWork2\\src\\test\\resources\\propertyfile\\locators.properties");
			Properties prop = new Properties();
			prop.load(fis);
			prop.load(fis1);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("Url"));
			
			driver.manage().window().maximize();
			
			 boolean disp =driver.findElement(By.xpath("book")).isDisplayed();
			Thread.sleep(4000);
			driver.findElement(By.xpath("book")).click();

			driver.findElement(By.xpath("booklogin")).isDisplayed();
			Thread.sleep(4000);
					
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
