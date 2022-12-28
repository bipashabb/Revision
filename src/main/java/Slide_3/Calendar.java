package Slide_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {static WebDriver driver; 
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
	
	driver= new ChromeDriver(); 
	driver.get("https://www.expedia.com/flights");
	Thread.sleep(5000); 
	
	//Locating departing feature
	driver.findElement(By.id("d1-btn")).click();
	Thread.sleep(3000);
	// Locate the departure date  
	driver.findElement(By.xpath("//*[@aria-label='Nov 23, 2022']")).click();
	Thread.sleep(3000); 
	
	//Locating return date
	driver.findElement(By.xpath("//*[@aria-label='Nov 26, 2022']")).click();
	Thread.sleep(2000);
	
	//Apply button
	driver.findElement(By.xpath("//*[@type='button' and @data-stid='apply-date-picker']")).click();
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}}
