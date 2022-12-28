package Slide_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generate_Alerts {
static WebDriver driver; 
// To generate alerts on any page
// Create a method alert

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(4000); 
	WebElement gamingacc= driver.findElement(By.xpath("//h2[text()='Gaming accessories']")); 
		
		//After the amazon page, I want to generate a msg
	generateAlerts(driver, "Amazon page WELCOME"); 
	Thread.sleep(3000); 
	driver.switchTo().alert().accept(); 

	}

	public static void generateAlerts(WebDriver driver, String message) {
		JavascriptExecutor Jsexecutor = (JavascriptExecutor)driver; 
		Jsexecutor.executeScript("alert('"+message+"')"); 
	
		
	}
}

