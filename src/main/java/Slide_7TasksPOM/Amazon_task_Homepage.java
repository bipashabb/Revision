package Slide_7TasksPOM;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_task_Homepage extends Tasks_Utilities {
	@FindBy(xpath ="//span[text()='Account & Lists']" ) WebElement account_list; 
	@FindBy(linkText = "Sell")WebElement sellbutton; 
	@FindBy(linkText = "Memberships & Subscriptions") WebElement membershipbutton; 
	
	

	
	public void explicitwait() {
		WebDriverWait ob= new WebDriverWait(driver, Duration.ofSeconds(30)); 
		ob.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Account & Lists']"))); 
	}
	public void border_SS() throws InterruptedException, IOException {
		border(account_list, driver);
		Thread.sleep(2000);
		ScreenshotsInside();
	}
	public void Hoover() throws InterruptedException {
		Actions act= new Actions(driver); 
		act.moveToElement(account_list).build().perform(); 
	}
	public void explicitwait2() {
		WebDriverWait ob= new WebDriverWait(driver, Duration.ofSeconds(30)); 
		ob.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Memberships & Subscriptions"))); 
	}
	public void flash_ss() throws IOException {
		flash(membershipbutton, driver);
		ScreenshotsInside();
	}	
	public void sell_click() {
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL).build().perform();
		sellbutton.click();
		act.keyUp(Keys.CONTROL).build().perform();
		
		

	}
	
		
		
		
	
	
	
		
	public Amazon_task_Homepage (WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
		
	}
}
