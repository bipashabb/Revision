package Slide_7TasksPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Calendar_task_calendarpage extends Tasks_Utilities {
	
	@FindBy(xpath = "//input[@id='first_date_picker']")WebElement firstdate;
	@FindBy(xpath = "//input[@id='second_date_picker']")WebElement secondate; 
	
	public void calendar_borderclick() throws InterruptedException {
		border(firstdate, driver);
		Thread.sleep(2000);
		firstdate.click();
	}
	public void passdate1() {
		String datevalue="14/01/2023";
		date(driver, firstdate, datevalue);
}
	public void passdate2() {
		String datevalue2="20/01/2023"; 
		date(driver, secondate, datevalue2);
	}
	public void border_SS() throws IOException {
		redborder(secondate, driver);
		ScreenshotsInside();
	}
	public void SessionID() {
		String sessionid= driver.getWindowHandle(); 
		System.out.println(sessionid);
		
	}
	
	public Calendar_task_calendarpage(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	

}
