package Slide_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executer {
	static WebDriver driver; 
	// Drivers work in UI level, not HTML DOM level, so can get errors like click intercepted/ element not interecebale
	// We can also scroll up/down in Java
	//If button is hidden with a pop up, JVM won't find the element
	// Java Script Executor performs the actions is DOM level but driver performs in UI level. 
	// Thats UI when an element is covered with ad/ pop up/ cookies etc. Element not found/clickable
	// We convert driver to a Java Script Executor org.openqa.selenium
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000); 
		
		WebElement searchfield= driver.findElement(By.cssSelector("input.gLFyf")); //Searchfield
		searchfield.sendKeys("abc");
		Thread.sleep(2000);
		
		WebElement clicksearch= driver.findElement(By.xpath("//input[@name='q']")); 
		// clicksearch.click(); // Not clickeable because element hidden by suggestion pop up. Being clicked through JSexecutor
		//Even if we put explicit wait for the element to load. Can't click through driver
		
		//Conversion to a JSexecutor object, similar to SS concept
		JavascriptExecutor executor= (JavascriptExecutor)driver; 
		executor.executeScript("arguments[0].click()", clicksearch); 
		// Clicking on it through the Executor, so no need for separate code for click button 
		//arguments[0] is always this and click() is the action, which can be changed but not arguments[0]
		// Will work with argument in index[0], and beause clicksearch is first element, will work with that
		// Same for other basic actions
		// Last is the button that needs to be clicked, so index[0] and the first argument
		
		
		
		
		
		

	}

}
