package Slide_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Elements {
	static WebDriver driver; 
	
	//Every button/field is called Element
	//Every element has some different items inside those elements called attributes
	// When Element is located on the DOM structure it will highlight and show which one it has found
	// Sometimes can find multilple link for the one thing you were looking for, 
	// After putting it all in bracket, use [] and put index number for which one you want to use

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https:www.facebook.com");
		Thread.sleep(3000);
		// When on a website, click on inspectm and the HTML DOM structure appears
		// Look for the element you are looking for
		// < Tag always starts with <
		// <a is a link tag
		// Attribute="Value"
		// id/linktext/partiallinktext/class/name/tag/xpath/css selector/ are attributes supported by Selenium and can be used to locate elements
		// Based on the one available to on HTML, and whatis supported find one so it can be used to locate elements

		WebElement emailfield=driver.findElement(By.id("email")); //Returning WebElement type value so storing inside webelement variable
		// Never write the value, always copy to minimise risk of errors
		
		//Always store the elements into a Webelement datatype variable so it can be used and reused, for instance 
		emailfield.clear(); // I'm getting many options with my variable. 
		
		// To type in, use sendkeys(); 
		emailfield.sendKeys("bipasha@gmail.com");
		// Locating with name
		WebElement passwordfield=driver.findElement(By.name("pass")); // Storing in Webelement type variable again
		passwordfield.sendKeys("house12345"); 
		
		// To click, we use click method
		// First locate the element you need to click
		WebElement loginbutton= driver.findElement(By.name("login")); 
		loginbutton.click();
		
		// Linktext
		// We use it when there is a link attached to a button, link starts with <a tag and the text is in black font 
		WebElement forgotpass= driver.findElement(By.linkText("forgot password?")); 
		forgotpass.click();
		
		// Partial linktext
		// Sometimes the text of a link is too long, so we use some parts of it to locate it. 
		// Same as Linktext, but full text not required. 
		
		//SelectorClass Drop Down
		// Most time, you find <select yag for drop downs, if expand it, you see all the child elements of that button as texts or buttons
		// We use Select Class for handling or location <select tag items.
		WebElement birthmonth= driver.findElement(By.name("birthday_month")); 
		Select month= new Select(birthmonth); // Inside select constructor we have to put Webelement elements, so stored all elements of birthmonths drop down inside month variable
		month.selectByIndex(0);// You can select by index, value, or by text 
		
		WebElement birthday= driver.findElement(By.name("birthday_day")); 
		Select day= new Select(birthday); // Stored all the drop downs in variable day
		day.deselectByValue("20");// Values are Strings
		
		WebElement birthyear= driver.findElement(By.name("birthday_year")); 
		Select year= new Select(birthyear); 
		year.selectByVisibleText("1997");
		
		
	}

}
