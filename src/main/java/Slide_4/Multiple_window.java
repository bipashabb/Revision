package Slide_4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_window {
	static WebDriver driver; 

	public static void main(String[] args)throws InterruptedException {
		//Alt+Click on the button opens new tab in same browser
		//Shift+click on button opens a new window, different browser
		// TO manage two diff windows/tab, it is similar concept to frame
		// JVM must go inside the other window to perform task and come outside
		// These can be differentiated as each window/tab has a unique session ID
		// By naming/storing these sessionID into a String. JVM can switch to whichever sessionID I need. 
		// The first main window is parent, and if another window opens from this, then its child
		//Getwindownhandle() and getwindowhandles(), one gives the sessionID for every session we are opening a new window
		//But for every window opened in a single session ,we use getwindowhandles()
		
		
		//parent window
		Ibrowser("chrome");
		driver.get("https:www.amazon.com");
		Thread.sleep(7000);
		WebElement deals= driver.findElement(By.linkText("Today's Deals"));  
		//Open this in a new window, so use keyboard control with help of ActionClass
		Actions act= new Actions(driver); 
		//Child window
		act.keyDown(Keys.SHIFT).build().perform();
		deals.click();
		act.keyUp(Keys.SHIFT).build().perform();
		
		
		// Storing String sessionID
		// Because we will have multiple values from getwindowhandles(), must be stored in <set> 
		// Set is a collection frameword. It will convert string varibale box into Array
		//Each session ID will put in Array box, but it is not array, it's collection
		// TO print the collection, we need help of iterator and take value of this collection into that iterator, and print one by one
		// parentID is storing both sessionID
		Set<String> parentID =driver.getWindowHandles(); 
		// TO make iterator for the above collection, we need String type iterator
		Iterator<String> it1=parentID.iterator(); 
		// The iterator box is it1. 
		String ParentSessionID= it1.next(); // Will return the value of the first index only, and then shut completely, so when print again, print 2nd index
		String ChildSessionId=it1.next(); // Now the second value of second index is stored in a diff string
		
		System.out.println(ParentSessionID);
		System.out.println(ChildSessionId);
		
		//switch to childwindow to perform task
		driver.switchTo().window(ChildSessionId); 
		WebElement coupons = driver.findElement(By.xpath("//span[contains(text(),'Coupons')]")); 
		coupons.click();
		
		//switching back to parent window
		driver.switchTo().window(ParentSessionID); 
		
		

	}
	public static void Ibrowser (String nameofBrowser) throws InterruptedException {
		if(nameofBrowser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
			driver= new ChromeDriver(); 
		
		}
			
			else if (nameofBrowser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\msedgedriver.exe");
				driver=new EdgeDriver(); 
			
			}
			
	}

}
