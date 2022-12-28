package Slide_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_management {
static WebDriver driver; 
	public static void main(String[] args) {
		// Professional and easier way to use multiple browser
		// Create a method Ibrowser, and set up input parameters, can also remove case senstivity
		// By setting name of the browser as input parameters and URL link
		// By just calling the method and input the details, i can access it without rewriting everything
		// Can call this method from all class, as long as, object is created
		// Or Can copy/paste this method in all classes, so just calling the method would work
		// Go on about normal testing functionalities without the usual beginning
		

	}

	public static void Ibrowser (String nameofBrowser, String url) throws InterruptedException {
		if(nameofBrowser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
			driver= new ChromeDriver(); 
			driver.get(url);
			Thread.sleep(3000);
		}
			
			else if (nameofBrowser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\msedgedriver.exe");
				driver=new EdgeDriver(); 
				driver.get(url); 
				Thread.sleep(3000);; 
			}
			
	}
}
