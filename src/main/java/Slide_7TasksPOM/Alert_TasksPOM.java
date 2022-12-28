package Slide_7TasksPOM;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alert_TasksPOM extends Tasks_Utilities {
	
	@FindBy(xpath = "//button[@id='alertButton']")WebElement alert1; 
	@FindBy(xpath = "//*[@id='timerAlertButton']")WebElement alert2; 
	@FindBy(id = "confirmButton") WebElement alert3; 
	@FindBy(xpath = "(//*[@type='button'])[5]") WebElement alert4; 
	
	public void firstAlert() throws IOException, InterruptedException, NoAlertPresentException {
		border(alert1, driver);
		Thread.sleep(2000);
		alert1.click();
		ScreenshotsInside();
		driver.switchTo().alert().accept();
	
		
	}
	public void secondAlert() throws InterruptedException, IOException {
		Thread.sleep(2000);
		flash(alert2, driver);
		ScreenshotsInside();
		alert2.click();;
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
			
	}
	public void thirdAlert() throws InterruptedException {
		Thread.sleep(3000);
		border(alert3, driver);
		alert3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
	}
	
	public void fourthAlert() throws InterruptedException, IOException {
		Thread.sleep(3000);
		alert4.click(); 
		driver.switchTo().alert().sendKeys("Alert completed");
		ScreenshotsInside();
		driver.switchTo().alert().accept();
		
		
	}
	
	public Alert_TasksPOM(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
		
	}
	

}
