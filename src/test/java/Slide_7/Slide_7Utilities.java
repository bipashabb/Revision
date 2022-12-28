package Slide_7;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

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
import org.testng.annotations.AfterClass;

public class Slide_7Utilities {
	public WebDriver driver; // Making it public so can use from all class we inherit, no need to rewrite it
	// Through inheritence concept, instead of copying and pasting browser initilisation and SS methods
	// Pasting Ibrowser in @BeforeClass, so that beginning of test, initiliase browser
	// Remember @Before/After class is diff than @Before/After method, as this runs before and after every @test
	// So if Need SS after each Test, call SS in @Aftermethod, and @BeforeMethod can have driver.geturl so that each Test can run its own url
	// Note this class, NO @Test, because being used for Utilities only
	

@Parameters ({"browser", "link"})// Which the same name that we give to parameter level in xml file
@BeforeClass
  public  void Ibrowser (String nameofBrowser, String url) throws InterruptedException {
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

  @AfterClass
	public void afterClass() throws IOException, InterruptedException {
	 ScreenshotsAfter();
	  // Calling SS to take SS after all tests. Haven't deleted @AfterClass like we did for @Before class because this way, if need
	  // two SS, can call it again, or if need to take SS elsewhere in the middle or between Tests
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
		for(int a=0; a<50; a++) {
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
  
}
