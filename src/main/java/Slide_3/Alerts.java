package Slide_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	// After locating the correct click button, switchto().alert().methods
	// After that either accept() or dismiss(), based on what needs to be done
	// If need to wait time, add thread.sleep
	//No need to switch back everytime
	// If needed to sendkeys, can put sendkeys() method after switchto().alert().sendkeys()
	// Must use driver Glob.var before setting out the code
	// We are directly adding click() method, rather than storing the value and then clicking 

	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 

		driver = new ChromeDriver(); 
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type='button'])[5]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("hello");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	}
}
