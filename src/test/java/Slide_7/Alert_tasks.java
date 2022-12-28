package Slide_7;

import org.testng.annotations.Test;

import Slide_7TasksPOM.Alert_TasksPOM;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Alert_tasks extends Slide_7Utilities {

  @Test
  public void f() throws InterruptedException, IOException, NoAlertPresentException {
	   Alert_TasksPOM ob= new Alert_TasksPOM(driver); 
	   ob.firstAlert();
	   ob.secondAlert();
	   ob.thirdAlert();
	   ob.fourthAlert();

  }
  @BeforeClass
  public void beforeClass() {
	  
	  
  }
  
  

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }


}
