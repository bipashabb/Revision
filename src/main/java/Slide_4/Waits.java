package Slide_4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	static WebDriver driver; 
	
	// Implicit Waits= Only need to write once in a method, and it will work for ENTIRE method. Will wait unitl programs loads perfectly
	// ( if we give 100 sec), will sait 100 for loading momemnt
	//This is put at the begining after initilising giving the url
	
	
	// Explicit Wait= It waits for a specfic element to load, not ENTIRE method, for ex if task is click on button, it will wait for 
	// the button to become clickable
	// For Explicit wait, we need to create object of Webdriverwait Class, as all methods are inside that class
	
	public static void main(String[] args)throws InterruptedException {
		
		Ibrowser("chrome");
		driver.get("https:www.amazon.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
		// implicitywait(long.Timeunit.Secoond); 
		
		
		//ExplicitWait, creating of object Webdriverwait(org.openqa.selenium(webdriver driver.Duration timeout)
		WebDriverWait ob= new WebDriverWait(driver, Duration.ofSeconds(30)); 
		// using this object to call until
		ob.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Today's Deals")));
		//ob.until(ExpectedConditionsorg.openqa.selenium). may conditions are available from this point
		//I can use ob anywhere to wait for any element, just  need to change the locator info
		
		WebElement deals= driver.findElement(By.linkText("Today's Deals")); 
		deals.click();
		
	}
	
	public static void Ibrowser (String nameofBrowser) throws InterruptedException {
		if(nameofBrowser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
			driver= new ChromeDriver(); 
		
		}
			
			else if (nameofBrowser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\msedgedriver.exe");
				driver=new EdgeDriver(); 
			
			}
}
}
