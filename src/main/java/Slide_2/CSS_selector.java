package Slide_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector {
	static WebDriver driver; 
	// We can directly copy the selector from the DOM structure
	// Basic Css selector works with ID and Class only
	
	// For ID, basic Css Selector can be 1) htmltag#valueOftheID or 2) #valueoftheID
	// For class, basic Css Selector can be 1) htmlTag.ValueoftheClass or 2) .ValueOftheClass
	
	// For ex, if id="email" in inspect box, then Css selector will be #email because #value
	// For class, if class="_8esh" then Css Selector is ._8esh because   .valueofClass
	// Can also find Css Selector with html tag of element, if tag <input, then input#email
	// If tag is <a for Class, then we could also do a._8esh
	
	
	// Css Selector for Coumpound Class
	// Some class attributes can have many values inside one class, usually noted with space in between the values. Each is a diff value
	// rather than all together. Each are separted with dot when writing CSS selector
	// Basic rule is 1)tagname.class1value.class2value.class3value 2) tagname.class1value.class2value
	// 3).class1value.class2value.class3value 4).class3value.class4value 5).class3value
	
	// There is dot before putting Class value, whereas for ID we put #
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https:www.facebook.com");
		Thread.sleep(3000);
		WebElement emailfield= driver.findElement(By.cssSelector("#email")); // It is a string
		emailfield.click();
		emailfield.sendKeys("bip@gmai.com");
		

	}

}
