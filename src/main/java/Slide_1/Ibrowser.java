package Slide_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {
	// Setting up browsers:
	//Interface Webdriver, we can call it globally with reference
	// Datatype is interface here. No primitive
	// This is already created in Java and through the dependencies
	// driver is the variable here
	// Make it Static so that we can use the variable directly inside main method
	
	
	static WebDriver driver; 
	

	public static void main(String[] args) throws InterruptedException {
		//Setting up the location of the driver
		System.setProperty("webdriver.chrome.driver","U:U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
// The key is a String datatype, and is unique to Chrome. The path is the location of the driver in the Driver folder in Maven Project
		
		// Chrome driver initialised
		driver =new ChromeDriver(); // Calling the chromedriver constructor class, which is already set in Java //
		// Top Casting, because some browser features are hidden in the Interface, while others are with Constructor
		// Creating the object of ChromeDriver Class. 
		// Now when we write driver. all the methods related to Chromedriver class and Webdriver Interface are displayed
		
		// Url opened
		driver.get("https://www.google.com");// Method to open the URL
		
		// Making Java wait before executing next code, so that website can load
		// Throw declaration
		Thread.sleep(3000); 
		
		// To refresh
		driver.navigate().refresh(); 
		// To maximise
		// Waiting a little again so that it can load properly
		Thread.sleep(3000); 
		driver.manage().window().maximize();
		
		// To go back
		Thread.sleep(3000);
		driver.navigate().back(); 
		
		// To go forward
		Thread.sleep(3000);
		driver.navigate(). forward(); 
		
		// Everytime you open a browser session, it creates a single session ID in backend. Provides info on how many times it opened
		// Mutiple browser window will have diff session ID, and with those Id you can perform specific tasks
		
		// This method is returning a String, so must be stored in a String variable
		String sessionID= driver.getWindowHandle(); 
		// Printing the session ID
		System.out.println(sessionID);
		
		// To get the url of the current page
		String currenturl=driver.getCurrentUrl(); // Also returning a String, so storing in String value so we can print as well
		System.out.println(currenturl);
		
		// To get title of the page
		String title=driver.getTitle(); // Also returning a String
		System.out.println(title);
		
		// If needed to verify the title of the page
		if (title.equalsIgnoreCase("google")) {
			System.out.println("Title correct");
			}
		else {
			System.out.println("Title incorrect");
			
		}
		
		// To close browser
		driver.close(); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
