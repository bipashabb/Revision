package Slide_6;
// POM for AmazonHomepage

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_object_Model {
	// A page-Object Model, POM, represent a page of the website we are testing
	// A good practice is to manually write down each step and result, so that it can be organised in class.
	// Each POM, (class), represent a page, so all the testing element of page 1 will be in POM 1, etc etc...
	// For instance, if testing Amazon Home page, this contains all the elements of Amazon homepage, and if 
	// another page opens up from here, then it can be in a diff POM. Each Page has its own POM class. 
	// Locating all the elements of Homepage and store them in this class. 
	// In this class, each element and tasks, has its own method. 
	// Finally, create a Page Factory Constructor, which is what makes it a POM.}
	// If performing actions in Amazon: such as Amazon homepage, click on sell, open sell page, etc...
	// Click on sign up, which opens a new page . Each new page, will have own class. 
	// If the last page doesn't have any action, no need to create a class for that page
	// To locate elements in a POM, no need for driver.findElementxxxx, instead @FindBy(locator)WebElement variable name
	// In POM, in single method, cannot interact with multiple elements, one action per method. 
	@FindBy(linkText = "Sell")WebElement sellbutton; 
	// Now creating the method to click on sell buttoon of the Amazon Homepage
	// If had multiple elements on the homepage, would store them all with multiple variable
	// Global variable webdriver driver still in the class
	// Create page factory constructor, outiside any other method, but inside the class
	// Name should be same as class name, input parameters WEbdriver driver
	// Then converting glob.var driver as local variable with this keyword
	// Select PageFactory.org.openqa.initElements(Element locatorFactory factory, Object page)
	// PGC helps initialise all the elements of the Class, without it, elements won't be working
	WebDriver driver; 
	
	public void Sell_click() {
		sellbutton.click(); 
		
	}
	public Page_object_Model(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
}
