package Slide_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
	// Scrolling upto the element or into view
	// To scroll need to use JSE, so creating a static method for that
	// If need to scroll to an element, first locate the element
	// Then call the scrolling method by passing the located element and driver
	//To scroll all down or scrollto(), create a diff method but no Webelelemt element needed, as no scrolling into element
	// scrollIntoview() method to scroll into an element
		
		System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000); 

		
		//WebElement gifts= driver.findElement(By.xpath("//span[text()='Shop gifts for everyone on your list']")); 
		//scrollIntoViews(driver, gifts); // If method was in a diff class, then classname.method would work to call static method
		
		scrollbottom(driver); 
	}
	//Scroll upto element
public static void scrollIntoViews(WebDriver driver, WebElement element) {
	JavascriptExecutor JSE=(JavascriptExecutor)driver; 
	JSE.executeScript("arguments[0].scrollIntoView(true)", element); 
	
}
//Scroll page down
public static void scrollbottom(WebDriver driver) {
	JavascriptExecutor jsexecutor= (JavascriptExecutor)driver; 
	jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 
}
}

