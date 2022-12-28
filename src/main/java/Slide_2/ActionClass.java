package Slide_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	// With help of Action Class, already set in Java, we control mouse pointer
	// Create an Action class object, which will have all the methods of Actions, and are required to control mouse
	// And will use my webdriver too, so I can use its methods as well. 
	// Must always have build().perform(); at the end
	// If needed to do two actions together such as hover and click, put move to element(target).click()
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https:www.amazon.com");
		Thread.sleep(3000);

		 // hello sign
		 WebElement hellosign = driver.findElement(By.id("nav-link-accountList-nav-line-1")); 
		 // Actionclass variable with WEbdriver 
		 Actions act=new Actions(driver); 
		 act.moveToElement(hellosign).build().perform(); // Meaning the mouse will move to this element
		 
		 // Hoover and click together
		 WebElement membership = driver.findElement(By.xpath("//span[contains(text(),'Memberships & Subscriptions')]"));
		 act.moveToElement(membership).click().build().perform();
		 
		 
	
	
	
	}
}
