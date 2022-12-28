package Slide_5;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilities {
	static WebDriver driver; 
	//Storing the basics in Utilites so can have access easily with inheritence
	// Creating Screenshot method as well
	// Now any class that extends Utilities will have the same methods in backend, so just calling the method only will work
	// Methods are static so need for Objects either
	
	public static void Ibrowser (String nameofBrowser, String url) throws InterruptedException {
		
		String ud=System.getProperty("user.dir");
		//The value of ud=U:\\eclipsework bipasha\\Eclipse work\\Revision
		//Replaced the path with ud String so that if sent to someone they can access it without my SAME path but theirs
		
		if(nameofBrowser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",ud+ "\\Drivers\\chromedriver.exe"); 
			driver= new ChromeDriver(); 
			driver.get(url);
		
		}
			else if (nameofBrowser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", ud+ "\\Drivers\\msedgedriver.exe");
				driver=new EdgeDriver(); 
				driver.get(url);
			}
		
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


