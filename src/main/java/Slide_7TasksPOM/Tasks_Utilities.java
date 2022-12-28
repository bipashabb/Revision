package Slide_7TasksPOM;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Tasks_Utilities {
	public WebDriver driver;
	
	 public void Ibrowser (String nameofBrowser, String url) throws InterruptedException {
			if(nameofBrowser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
				driver= new ChromeDriver(); 
				driver.get(url);
			}
				else if (nameofBrowser.equalsIgnoreCase("edge")) {
					System.setProperty("webdriver.edge.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\msedgedriver.exe");
					driver=new EdgeDriver(); 
					driver.get(url);
				}
	}
	// Screenshot method
	  public void Screenshots() throws IOException {
			String ud=System.getProperty("user.dir"); 
			Date object=new Date(); 
			String converted=object.toString().replace(" ", "_").replace(":", "_"); 
			System.out.println(converted); 
			File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshots, new File(ud+"\\Pictures\\"+converted+"Screenshot.jpg"));
		}
	  
	  // creating different path for SS, one for each folder, after test and between test, will call diff SS so saved in diff location
	  public void ScreenshotsAfter() throws IOException {
			String ud=System.getProperty("user.dir"); 
			Date object=new Date(); 
			String converted=object.toString().replace(" ", "_").replace(":", "_"); 
			System.out.println(converted); 
			File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshots, new File(ud+"\\Pictures\\SS after test\\"+converted+"Screenshot.jpg"));
	  }
	  public void ScreenshotsInside() throws IOException {
			String ud=System.getProperty("user.dir"); 
			Date object=new Date(); 
			String converted=object.toString().replace(" ", "_").replace(":", "_"); 
			System.out.println(converted); 
			File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshots, new File(ud+"\\Pictures\\SS inside tasks\\"+converted+"Screenshot.jpg"));
	  }
	  
		public static void changecolor (String color, WebElement element, WebDriver driver) {
			JavascriptExecutor jse= (JavascriptExecutor)driver; 
			jse.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		public static void flash(WebElement element, WebDriver driver) {
			String bcolour= element.getCssValue("backgroundColor"); 
			System.out.println(bcolour);
			for(int a=0; a<10; a++) {
				changecolor("#00FFFF", element, driver);
				changecolor(bcolour, element, driver);
			}
		}
		
		public static void border(WebElement element, WebDriver driver) {
			JavascriptExecutor jse= (JavascriptExecutor)driver; 
			jse.executeScript("arguments[0].style.border='5px solid pink'", element);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		public static void date(WebDriver driver, WebElement element, String date) {
			JavascriptExecutor jse= (JavascriptExecutor)driver; 
			jse.executeScript("arguments[0].setAttribute('value','"+date+"')", element); 
			
		}
	  
		public static void redborder(WebElement element, WebDriver driver) {
			JavascriptExecutor jse= (JavascriptExecutor)driver; 
			jse.executeScript("arguments[0].style.border='5px solid red'", element);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
}
