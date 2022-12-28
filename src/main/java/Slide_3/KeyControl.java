package Slide_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyControl {
	// For keydown Keydown()
	// For releasing a key pressed down keyup()
	// To press normally without holding sendkeys()
	// Must create Actions Class, as required to use keys
	// Using the object of Actions Class, we put keyup/down()(keys.which key(control/alt/delete/etc)).sendkeys A/V/C/X depending what needed
	// A to select all, C to copy, V to paste, X to cut
	// Put build().perform() at the end
	// Easy if write steps down to better organise the codes
	// Some field requires a click before doing any control
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 

		driver= new ChromeDriver(); 
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		
		//locate search keys
		WebElement Searchfield= driver.findElement(By.id("twotabsearchtextbox")); 
		Searchfield.click(); 
		Thread.sleep(3000); 
		Searchfield.sendKeys("computer");
		
		// select all controlA the word
		Actions act = new Actions(driver); 
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.keyUp(Keys.CONTROL); 
		
		
		// copy the word
		act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		act.keyUp(Keys.CONTROL); 
		Thread.sleep(2000);
		
		//delete the word
		act.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(2000);
		
		// click on search bar before paste
		
		// paste the word
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}}
