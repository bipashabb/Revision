package Slide_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	// Xpath, most imp locator of Java, with specific ways to find elements
	// Even if the attributes isn't supported in Selenium, can still the locator is xpath
	// It works like a home, where you have steps to reach, which cannot be skipped
	// Similarly, we use HTML DOM structure from parent to grandchild to search an element
	// Xpath= //tagname[@attribute='Value']
	// Two types of Xpath, absolute and relative
	// Absolute is the direct way to find the element, but often these get changed, and when re run, no elements are found. Absolute xpath starts with single dash /
	// Which means, it is selecting from the root: /tagname/tagname/tagname (in purple). 
	// The right element will be highlight and will show 1/1, if more then add ()[] with which index nb
	// Relative xpath is with double //, and can have many diff ways to be found
	// //tagname[@attribute='value'] or //*[@attribute='value']
	// Attributes not supported by Selenium can be used too. 
	// Some elements only have texts, then we can do Text Xpath
	// Text Xpath //tagname[text()='TEXT']
	// Contains xpath //tagname[contains(text(),'TEXT')] or //*[contains(text(),'text')]
	// Contains xpath is also about the value, not always the Text, so //*contains(@attribute,'value')], or starting with tagname
	// Both can be separated with and/or operator to be more specific sometimes
	// and= all the attributes and values linked with and must be present
	// or= any of the attributes values can be present, not necessary
	// When contains, never use equal sign, instead put a comma. 
	//Starts with Xpath, similar to contains but must start with whatever it starts with first
	// //*[starts-with(@attribute,'value')] or //tagname[starts-with(@attribute,'value')] 
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https:www.facebook.com");
		Thread.sleep(3000);
		//AbsoluteXpath
		 WebElement gendermale = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]" ));
		 
		 //relative xpath on sign in button
		 WebElement sign_in=driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
		 
		 //Contains Xpath
		 WebElement forgotpassword = driver.findElement(By.xpath("//a[contains(text(), 'Forgotten password?')]")); 
		 
		 
		 
		 
	}
	
	

}
