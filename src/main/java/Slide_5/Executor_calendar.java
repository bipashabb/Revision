package Slide_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Executor_calendar extends Utilities {
	static WebDriver driver; 
	//Can also do calendar handling with JSExecutor
	// Format for date on this webpage is dd//mm/yyyy
	// To select the date with automation and JSExecutor
	//Inspection and location of Xpath
	

	public static void main(String[] args) throws InterruptedException {
		Ibrowser("chrome", "https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(3000); 
	
		WebElement datefield= driver.findElement(By.xpath("//input[@id='first_date_picker']")); 
		datefield.click(); // Opening calendar
		Thread.sleep(3000); 
		
		String mydate ="01/01/2023";  // The date I want to pick as a String
		DatewithJSE(driver, datefield, mydate); 
		
	}
	// Creating a method for JSExecutor 
	public static void DatewithJSE(WebDriver driver, WebElement element, String Datevalue) {
		JavascriptExecutor JSE=(JavascriptExecutor)driver; 
		JSE.executeScript("arguments[0].setAttributes('value','"+Datevalue+"')", element); 
		// Put Datevalue as a value, but would like to pass mydate String here
		// Calling the Java Script Method in main method, where I can modify input parameters and pass mydate
		// There are 3 strings in it but want to pass Datevalue as a variable, 
		// Putting in between "" with ++
		// TO change the date just change the value of the String mydate
	}
		
		
	

	

}
