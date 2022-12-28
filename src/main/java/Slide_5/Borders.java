package Slide_5;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Borders {
	static WebDriver driver; 
	//Create draw border method, so when calling, it will draw border on the element that is inside the input parameters
	// This can be useful for screenshots, so creating SS method here
	public static void main(String[] args) throws InterruptedException, IOException {	
	System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.amazon.com");
	Thread.sleep(5000); 
	WebElement gamingacc= driver.findElement(By.xpath("//h2[text()='Gaming accessories']")); 
	drawborder(gamingacc, driver); 
	//After border
	Thread.sleep(3000); 
	Screenshots(); 


	}

	public static void drawborder(WebElement element, WebDriver driver) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver; 
		jsexecutor.executeScript("arguments[0].style.border='3px solid red'", element); 
		// can change the colour by changing the red
		// Pixel size chnage means border thicker or thinner
	}
	public static void Screenshots() throws IOException {
		String ud=System.getProperty("user.dir"); 
		Date object=new Date(); 
		String converted=object.toString().replace(" ", "_").replace(":", "_"); 
		System.out.println(converted); 
		File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshots, new File(ud+"\\Pictures\\"+converted+"Screenshot.jpg"));
	}

}
