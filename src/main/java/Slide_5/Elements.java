package Slide_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements extends Utilities {
	static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		Ibrowser("chrome", "https:www.amazon.com");
		Thread.sleep(5000);
		//Find Elements can locate all that has same 
		//Because returning multiple elements must be stores in List<Webelement>
		// When doing single elements, if element not found, then error comes up. such as if text been changed or link
		// whereas with elements, it will show 0 but the script will run as normal, rather than showing error 
	
		List<WebElement> links= driver.findElements(By.tagName("a")); //Named links because locating all <a tags
		System.out.println(links.size());// Printing how many there are No need for iterator when printing list
		// Can put this in for loop statement
		
		for (int i=0; i<links.size(); i++) {
			System.out.println("Text of the link is "+ links.get(i).getText());// Get text will print the actual text of the link
			System.out.println("Link of the text is "+ links.get(i).getAttribute("href")); // The link will print because href
			
		}
		
		
	}

}
