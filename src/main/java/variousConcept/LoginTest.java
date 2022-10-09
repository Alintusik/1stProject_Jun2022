package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	@SuppressWarnings("deprecation")
	public static void main (String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		//clear cookies
		driver.manage().deleteAllCookies();
		
		//go to url
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//apply implicitly wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//identify user name and insert value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		//identify password and insert value
		driver.findElement(By.id("password")).sendKeys("abc12345");
		
		//identify sign in button and click
		driver.findElement(By.name("login")).click();
		
		
		//close browser
		//driver.close(); 
	
	
	}
}
