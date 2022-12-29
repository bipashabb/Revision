package Slide_8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Data_providerPOM {
	public WebDriver driver ;
		// The annotation @Data provider in Testng classes is to input the test data given by the developers. 
		// It is the pretend data needed when testing functionalities that require input. 
		// Taking this class as POM for the Class testng Data provider. 
		// Taking the example of Facebook sign in functionality. We will add test data given into fields and test
	// Setting String email as input parameter, so it can be changed everytime call the method, rather than putting one constant
	// variable to sendkeys. Now can be changed. Same with password field 
	
	
	//Dev has given test data 1) abc1@gmail.com/abc123  2)abc2@gmail.com/abc234 3)abc3@gmail.com/abc345

	@FindBy(name = "email") WebElement email_field; 
	@FindBy(name="pass") WebElement pass_field; 
	@FindBy(name="login") WebElement login_button; 
		
	public void email_click(String email) throws InterruptedException {
		
			email_field.click();
			email_field.clear();
			email_field.sendKeys(email);
			Thread.sleep(3000);
	
	}
		
	public void pass_field (String password) {
			pass_field.click();
			pass_field.sendKeys(password);
		}
		
	public void login_click() {
			login_button.click();
			
		}
	 public Data_providerPOM(WebDriver driver) {
		 this.driver=driver; 
			 PageFactory.initElements(driver, this);
		
		}

}
