package MAX;



import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class SeleniumTests {		
	    private WebDriver driver;		
		@Test	
		public void max()
		{
			
			
			
			
		
			
			
			driver.get("https://www.google.com/");
			System.out.println(driver.getTitle());
			driver.quit();
		
			
		}	
		@BeforeTest
		
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver",
			           "C:\\Users\\VDW7QYM\\Desktop\\chromedriver.exe");
			
			System.out.println("Welcome to Selenium Tests");
			
		    driver = new ChromeDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();
			
		}		
}	