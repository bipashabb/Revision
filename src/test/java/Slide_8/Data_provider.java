package Slide_8;

import org.testng.annotations.Test;

import Slide_7.Slide_7Utilities;


import org.testng.annotations.DataProvider;

public class Data_provider extends Slide_7Utilities {
	// Pretend for this page, the page Object model is Data provider class in Slide_8  
	// Could put the test data as input String when calling method, and do it for each test data given but long
	// using the 2 dimension concept array. Multidimension Object[][]= new Object[5][2] example
	// or the other way Object[][]={"0",",0"} etc.. 
	// For instance, given an excel sheet with test data
	// Modifying the input parameters of public void f, so it matched 2 String, as I need to input 2 strings
	// Have put the test data in @Data provider method, as multidimensional array and the annotation next to @test
	// will fetch from the method data_providerdemo
	// Convert to an xml file and run, and modifying parameters so that it matched the data provided and run accordingly
	
 
	
	
	@Test(dataProvider = "Data_providerDemo")
  public void f(String emailfield, String password) throws InterruptedException {
	 Data_providerPOM ob= new Data_providerPOM(driver); 
	 Thread.sleep(3000);
	 ob.email_click(emailfield); 
	 ob.pass_field(password); 
	 ob.login_click();  
	 driver.navigate().back();
	 Thread.sleep(2000); 
	 
	 
  }
// Here it returns the full array
// Here doing single row with 2 column but two values. 
// If needed three column, add another []
  @DataProvider
  public Object[][] Data_providerDemo() {
    return new Object[][] {
      new Object[] { "abc1@gmail.com", "abc123" },
      new Object[] { "abc2@gmail.com", "abc234" },
      new Object[] { "abc3@gmail.com", "abc345"}, 
      
    };
  }
}
