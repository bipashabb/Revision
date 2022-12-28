package Slide_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taskscalendar {
static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com");
		Thread.sleep(4000); 

		WebElement SelPra= driver.findElement(By.linkText("Selenium Practice")); 
		//flash(SelPra, driver); 
		//border(SelPra, driver);
		Actions act= new Actions(driver); 
		act.moveToElement(SelPra).build().perform(); 
		Thread.sleep(5000); 
		WebElement calendar= driver.findElement(By.linkText("Calendars Practice")); 
		//border(calendar, driver); 
		act.moveToElement(calendar).build().perform(); 
		calendar.click(); 
		Thread.sleep(4000); 
		WebElement firstdate= driver.findElement(By.xpath("//input[@id='first_date_picker']")); 
		firstdate.click(); 
		String datevalue="14/01/2023";
		date(driver, firstdate, datevalue); 
		Thread.sleep(3000);
		border(firstdate, driver); 
		WebElement seconddate= driver.findElement(By.xpath("//input[@id='second_date_picker']")); 
		seconddate.click(); 
		String datevalue2= "20/01/2023"; 
		date(driver, seconddate, datevalue2); 
		Thread.sleep(3000); 
		
		String sessionID= driver.getWindowHandle(); 
		System.out.println(sessionID);
		String url= driver.getCurrentUrl(); 
		System.out.println(url);
		Thread.sleep(3000);
		driver.close(); 
		
		
				
		
		
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
		for(int a=0; a<50; a++) {
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
	
	public static void date(WebDriver driver, WebElement element, String date) {
		JavascriptExecutor jse= (JavascriptExecutor)driver; 
		jse.executeScript("arguments[0].setAttribute('value','"+date+"')", element); 
		
	}

}
