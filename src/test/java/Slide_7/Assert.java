package Slide_7;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Slide_6.Page_object_Model;

public class Assert extends Slide_7Utilities {
	
	// To assert/verify, such as that url is correct
  @Test
  public void f() {
	  Page_object_Model ob= new Page_object_Model(driver); 
	  ob.Sell_click();
	  // Adding the getcurrentUrl() method, which is returning String, so storing in String
	  String currenturl= driver.getCurrentUrl(); 
	  System.out.println(currenturl);// After running is xml file, it will print here
	  org.testng.Assert.assertEquals(currenturl, "https://www.amazon.com/b/?_encoding=UTF8&ld=AZUSSOA-sell&node=12766669011&ref_=nav_cs_sell");
	  // With Assert.assertequal(actual, expected) can be verified. Can be anydata type, expected would be in BRD
	  // If assertion fails, and actual doesn't match expected, whole script stops running
	  // This is solved with SoftAssert class, so let's create object of that class. 
	  
	  SoftAssert ob1= new SoftAssert(); 
	  ob1.assertEquals(currenturl, "https://www.amazon.com/b/?_encoding=UTF8&ld=AZUSSOA-sell&node=12766669011&ref_=nav_cs_sell"); 
	  // Hardassert, no object needed, SoftAssert object needed, but both same methods and same way
	  // This way, codes will still run, but at the end of the method MUST add ob.asserAll(); only once, for all
	  ob1.assertAll(); 
  }
}
