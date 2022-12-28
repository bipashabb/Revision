package Slide_7TasksPOM;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calendar_task_HomePage {
	WebDriver driver; 
	
	@FindBy(linkText = "Selenium Practice") WebElement selpra; 
	@FindBy(linkText = "Calendars Practice")WebElement calendar; 
	
	public void SellFlash() {
		flash(selpra, driver);
		}
	public void Selborder() throws IOException {
		border(selpra, driver);
		//ScreenshotsInside();
	}
	public void Hoover_border() throws InterruptedException {
		Actions act= new Actions(driver); 
		act.moveToElement(selpra).build().perform(); 
		Thread.sleep(2000);
		border(calendar, driver);
		
	}
	
	public void click_calendar() {
		Actions act= new Actions(driver);
		act.moveToElement(calendar).build().perform(); 
		calendar.click();
		
	}
	
	 public Calendar_task_HomePage (WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	 
	 
	 
	 public static void changecolor (String color, WebElement element, WebDriver driver) {
		JavascriptExecutor jse= (JavascriptExecutor)driver; 
		jse.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void flash(WebElement element, WebDriver driver) {
		String bcolour= element.getCssValue("backgroundColor"); 
		System.out.println(bcolour);
		for(int a=0; a<10; a++) {
			changecolor("#00FFFF", element, driver);
			changecolor(bcolour, element, driver);
		}
	}
	
	public static void border(WebElement element, WebDriver driver) {
		JavascriptExecutor jse= (JavascriptExecutor)driver; 
		jse.executeScript("arguments[0].style.border='5px solid pink'", element);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	  public void ScreenshotsInside() throws IOException {
			String ud=System.getProperty("user.dir"); 
			Date object=new Date(); 
			String converted=object.toString().replace(" ", "_").replace(":", "_"); 
			System.out.println(converted); 
			File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshots, new File(ud+"\\Pictures\\SS inside tasks\\"+converted+"Screenshot.jpg"));
	  }

}
