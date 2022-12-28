package Slide_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https:www.jquery.com");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);  // Going inside the Iframe, index nb is 0, because using the first Iframe
		
		//Locate both drag and drop it area
		
		 WebElement dragstart = driver.findElement(By.id("draggable")); 
		 WebElement dropin = driver.findElement(By.id("droppable")); 
		 // Create Action Class Objectd riverhelp of driver
		 
		 Actions act= new Actions(driver); 
		 act.dragAndDrop(dragstart, dropin).build().perform(); // Located both element, one as a start and the other as end, with method drapanddrop()
		 
		// However, element not located because if looked at the HTML structure, we can see that these elements are located inside a frame.
		// WE must identify if a element is inside a frame, because we need to be inside the frame to locate the element, otherwise not possible
		// Identifiable with <i frame, and everything inside it, is inside the frame and can be located only once inside the frame
		 // So to perform action inside the iframe, and then get out of the Iframe
		 
		 driver.switchTo().parentFrame(); // Coming out of the Iframe to the parent frame
		 WebElement resize = driver.findElement(By.linkText("Resizable")); 
			
			resize.click(); // Now this command will perform as it is outside the Iframe, if needed to go back inside 
			// switch to Iframe again
			// Can perform multiple task within the Frame, if needed. 
		 
}
}
