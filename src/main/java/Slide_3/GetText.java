package Slide_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	
	//To verify if a page os showing a supposed text, we can use gettext() method
	// Locate the text with method .gettext() at the end. Only Text, so the black writing, as may be here as a link or else
	// By storing the String you can print it
	// Can verify without having to print, with if concept
	// This would work with get text, size
	//Size() will print amount of the text and if 0 codes will still run after

	// Get text() will print the text and exception will show if not available
	
	static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		String homepagetext = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")). getText(); 
		System.out.println(homepagetext);
		
		// findElementss the total amount that contains the element in the current page. Size should be at the end
				int amount= driver.findElements(By.xpath("//h2[contains(text(),'Facebook helps')]")).size(); 

				//can do * tags in xpath as well
				System.out.println(amount);
				
				if (amount!=0) {
					System.out.println("Text is present");
				}
				else {
					System.out.println("Text not present");
				}
			//Another example from diff website
				int amountofbutton = driver.findElements(By.xpath("//*[@type='button']")).size(); 
				System.out.println(amountofbutton);
				
				if (amountofbutton != 0) {
					System.out.println("button type element is present");
				} else {
					System.out.println("Button type element not present");
				}
				
		

	}

}
