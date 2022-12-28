package Slide_7;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Slide_7TasksPOM.Calendar_task_HomePage;
import Slide_7TasksPOM.Calendar_task_calendarpage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Calendar_task extends Slide_7Utilities{
	  
  @Test(priority=1)
  public void Calendar_Homepage() throws IOException, InterruptedException {
	  Calendar_task_HomePage ob= new Calendar_task_HomePage(driver); 
	  ob.SellFlash();
	  ob.Selborder();
	  Thread.sleep(4000);
	  ob.Hoover_border();
	  Thread.sleep(2000);
	  ob.click_calendar(); 
	  
	  Calendar_task_calendarpage ob1= new Calendar_task_calendarpage(driver); 
	  ob1.calendar_borderclick();
	  ob1.passdate1();
	  Thread.sleep(3000);
	  
  }
  
  @Test(priority=2, dependsOnMethods="Calendar_Homepage")
  public void calendar_page() throws InterruptedException, IOException {
	 Calendar_task_calendarpage ob1= new Calendar_task_calendarpage(driver); 
	 ob1.passdate2();
	 Thread.sleep(3000);
	 ob1.border_SS();
	 ob1.SessionID();
	  
	 
	SoftAssert ob2= new SoftAssert(); 
	String url= driver.getCurrentUrl(); 
	ob2.assertEquals(url, "https://hyrtutorials.com");
	ob2.assertAll();
	 
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() throws IOException {
	  ScreenshotsAfter();
  }

  
  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close(); 
  }

	}
