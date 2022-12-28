package Slide_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flashing_blinking {
	// Every button has a button at the back
	// Can alternate the colour of these bottoms
	// Need method to change the colour/ flash the element and maybe take screenshot
	// Easily identify the element for other observers or team memebers
	// The two flashing methods are together but only the one that chnages colour, flash is called
	//One method is colour change and the other one flash
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000); 
		WebElement gamingacc= driver.findElement(By.xpath("//h2[text()='Gaming accessories']")); 
		
		flash(gamingacc, driver); 	
	}
	
	// Changing colour, surround with try/catch

	public static void changecolour(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor jsexecutor= (JavascriptExecutor)driver; 
		jsexecutor.executeScript("arguments[0].style.backgroundColor='"+color+"'", element); 
		try {
			Thread.sleep(200);// For the colour to stay for that lenght 
			//If call this method twice, then flash twice
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	//flashing method	
	public static void flash(WebElement element, WebDriver driver) {
		//To find the background colour, which is a String
		String backgroundcolor=element.getCssValue("backgroundColor"); // The string is method already in Java. so accurate spelling
		System.out.println(backgroundcolor);
		for(int i=0; i<50; i++) {
			changecolour("#FF0000", element, driver);
			changecolour(backgroundcolor, element, driver);
			
		}
		
					
		}
	


}

