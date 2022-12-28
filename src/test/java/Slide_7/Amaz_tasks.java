package Slide_7;

import java.io.IOException;

import org.testng.annotations.Test;

import Slide_7TasksPOM.Amazon_task_Homepage;

public class Amaz_tasks extends Slide_7Utilities {

  @Test
  public void f() throws IOException, InterruptedException {
	  String currenturl=driver.getCurrentUrl(); 
	  String title= driver.getTitle(); 
	  
	  if (currenturl=="https://www.amazon.com") {
		  if (title=="Amazon") {
		  System.out.println("Current url and title is correct");
		  }
		  else {System.out.println("current url is correct but not title");
	  }}
		  else {
			  System.out.println("None are correct");
		  }
	  
	  Amazon_task_Homepage ob= new Amazon_task_Homepage(driver); 
	  ob.explicitwait(); 
	  ob.border_SS(); 
	  ob.Hoover(); 
	  ob.explicitwait2(); 
	  ob.flash_ss(); 
	  
	  
	  
		  
	  
			  
	  
	  
  }
}
