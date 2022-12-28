package Slide_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	// We use Axes for elements that don't have unique attributes
	// such multiple elements are showing even though you using supported attributes
	// Or when element is not having any supported attributes
	// More on Xpath Notepad file
		
		static WebDriver driver; 
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
			
			driver= new ChromeDriver(); 
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			Thread.sleep(3000);
			
			WebElement checkbox1= driver.findElement(By.xpath("//td[text()='Maria Anders']//preceding-sibling ::td/child ::input")); 
			checkbox1.click(); 
			Thread.sleep(3000); 
			
			WebElement checkbox2= driver.findElement(By.xpath("//td[text()='Francisco Chang']//preceding-sibling ::td/child ::input")); 
			checkbox2.click(); 
			Thread.sleep(3000); 
			
			WebElement checkbox3= driver.findElement(By.xpath("//td[text()='Roland Mendel']//preceding-sibling ::td/child ::input")); 
			checkbox3.click(); 
			Thread.sleep(3000); 
			
			WebElement checkbox4= driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling ::td/child ::input")); 
			checkbox4.click(); 
			Thread.sleep(3000); 
			
			WebElement resetbutton= driver.findElement(By.xpath("//div[@class='container']/descendant::button[text()='Reset']")); 
			resetbutton.click(); 
			
			
			// xpath for ancestor or self //div[@class='buttons']/ancestor-or-self::div. Will locate all div ancestor and itself
			
			WebElement password=driver.findElement(By.xpath("//label[text()='Password']/following::input[@type='password'][1]")); 
			password.click();
			Thread.sleep(3000); 
			
			
			

}}
