package Slide_6;

import org.testng.annotations.Test;

import Slide_6.Page_object_Model;
import Slide_7.Slide_7Utilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
// These annotation help execute codes in sequence
// The sequence is Before suit/Before Test/Before Class/Before method/Test/After method/After class/After test/ Result of test/ After suit
// Codes inside Test annotation
// You can create another annotation @Test, which will have own Before/After method rught before and after
// It will be between before Class/ After class, each test own Before/After method 
// For every Testng Class, we initiliase browser(driver, Chrome, Url), execute codes, and close browser
// The initilisation browser basic (System.setProperties, driver=new Chromedriver, driver.geturl) is common to all class.
// Most of annotation  are not useful, so we keep @Before class/ @test/ @After class
// Before class with browser initilisation
// Testng class can still have static webdriver driver as global variable, and throws declaration
// @After class will close the driver, driver.close(); 
// After running, we can see in details if test passed/failed, and where it failed. Organised way
// Alerts can have own method too, on POM they belong to. 

// If running multiple @Test, we can control the flow and order of the test, add priority number next to the annotation
// Such as @Test(priority =1) and @Test (priority=2). 
// I can also control the dependency of test, for ex, if Test2 can execute only if Test1 passes, so if Test1 fails, Test2 won't run
// After writing priority, add dependsonmethods=" the name of method which is dependendent") 
// Such as @Test2(priority=2, dependsOnMethods="Test1").
// However, if there is @Test£, no dependent on any other test, even though Test1 failed, and Test2 doesn't run, Test3 will run
public class ClassNg extends Slide_7Utilities {
// No need for glob.var because already inheriting from Utilities
	
  @Test
  public void f() {
	  // Now that we have create a POM for the Amazon homepage, in src/main/test/slide_6
	  // First action, after opening the amazon page, that is done in @before class annotation
	  // Click on sell from the Homepage, which is on POM homepage.. So create object of that blass and call the method created for clicking
	  // If more actions, then call the methods accordingly. 
	  // As it goes on, will need to create objects from the 2nd POM, and call the methods accordingly and so on. 
	  // That's why better to, write down all steps and outcome and then create POM and methods. 
	  // Each POM has specific name such as Amazon Homepage, or Amazon bookpage, Sign in page, and methods are specfic too. 
	  // Try to be specific with variable names too. 
	  Page_object_Model ob= new Page_object_Model(driver); 
	  ob.Sell_click();// The method that will locate and click on the book button. 
	  
  }
  
  // Thos @beforeClass no longer needed, as already initiliased in through extend in utilities and with the parameters in Xmlfile
  //Another way to initiliase browser, in xml file
  @BeforeClass
  public void beforeClass() throws InterruptedException {
  Ibrowser("chrome", "https:www.amazon.com");   
  Thread.sleep(3000);
	 }

  @AfterClass
  public void afterClass() throws IOException, InterruptedException {
	  // To add Screenshot method, we can copy and paste it at the bottom, and call the method @Afterclass, 
	  // So that after code is run, it takes screenshot
	  // If calling screenshot in @afterclass, it will take SS after all test, but if need in the test then call in @test
	  // If need after each test, call in @Aftermethod, as this method gets called after each @test. 
	  Screenshots(); 
	  Thread.sleep(3000); 
	  driver.close();
	   }
  // Because these methods don't have annotation, it won't run in Testng class. Also have made  N/S so that the glob.var isnt static either
  // N/S also, so that when I call this method in @Before class, which is N/S no need to create object either
  //Making Screenshot method N/S too
  
  

 
}
