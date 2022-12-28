package Slide_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel {
	//We can run these test in one xml file, and each has a different link. 
	// Each could be from different browser aswell
	// In SIT, many classes and tests are run with this concept
	WebDriver driver; 
	
  @Test(threadPoolSize = 3, invocationCount = 5)// Meaning that this test will be called from 3 diff execution point, open 3 browser
  // and run the method 5times
  public void parallel_1() throws InterruptedException {
	  System.out.println("Parallel 1 "+ Thread.currentThread().getId());// This gives id of the method
	  driver= new ChromeDriver(); 
	  driver.get("https://www.google.com");
	  Thread.sleep(3000); 
  }
  
  
  @Test(threadPoolSize = 3, invocationCount = 5)
  public void parallel_2() throws InterruptedException {
	  System.out.println("Parallel 2 "+ Thread.currentThread().getId());
	  driver= new EdgeDriver(); 
	  driver.get("https://www.amazon.com");
	  Thread.sleep(3000); 
	  
  }
  
  @Test
  public void parallel_3() {
	  System.out.println("Parallel 3 "+ Thread.currentThread().getId());
	  
  }
}
