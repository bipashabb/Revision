package Slide_5;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskAmazon {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(4000); 
		String currenturl= driver.getCurrentUrl(); 
		System.out.println(currenturl);
		
		String title= driver.getTitle();
		System.out.println(title);
		
		if(currenturl=="https://www.amazon.com/") {
		
			if(title=="amazon") {
				System.out.println("both URL and title are correct");
			}
			else {
				System.out.println("Url correct but not title");
			}
		}
		else {
			System.out.println("Both URL and Title are incorrect");
		}
		
	
		WebDriverWait ob= new WebDriverWait(driver, Duration.ofSeconds(30)); 
		ob.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Account & Lists']"))); 
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		driver.navigate().back(); 
		Thread.sleep(3000); 
		
		WebElement sell= driver.findElement(By.linkText("Sell")); 
		ob.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sell"))); 
		border(sell, driver); 
		Thread.sleep(3000); 
		Actions act= new Actions(driver); 
		act.keyDown(Keys.SHIFT).build().perform(); 
		sell.click(); 
		act.keyUp(Keys.CONTROL).build().perform(); 
		Set<String> sessionIDs= driver.getWindowHandles(); 
		Iterator<String> it1 =sessionIDs.iterator(); 
		String parentid=it1.next();
		String childid=it1.next(); 
		
		driver.switchTo().window(childid); 
		String currenturlchild= driver.getCurrentUrl(); 
		System.out.println(currenturlchild);
		String childtitle= driver.getTitle(); 
		System.out.println(childtitle);
		if(currenturlchild=="https:www.amazon.com/sell") {
			if(childtitle=="Sell page") {
				System.out.println("Both url and title are correct");
			}
			else {
				System.out.println("URL correct but not title");
			}
			
		}
		else {
			System.out.println("Both url and title are incorrect");
		}
		
		int button= driver.findElements(By.tagName("button")).size(); 
		System.out.println(button);
		Thread.sleep(3000); 
		 
		driver.switchTo().window(parentid); 
		driver.manage().window().maximize();
		
		WebElement searchfield= driver.findElement(By.xpath("//div[@class='nav-fill']/descendant::input[@type='text']")); 
		searchfield.click(); 
		searchfield.sendKeys("phones"); 
		Thread.sleep(3000); 
		WebElement searchclick=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")); 
		searchclick.click(); 
		Thread.sleep(3000); 
		String text= driver.findElement(By.xpath("//*[contains(text(),'1-16')]")).getText(); 
		
		System.out.println(text);
		if(text.equalsIgnoreCase("1-16 of over 100,000 results for")) {
			System.out.println("Text is correct");
		}
		else {
			System.out.println("Text incorrect");
		}
		WebElement article=driver.findElement(By.linkText("Read full article")); 
		scrollIntoViews(driver, article); 
		article.click(); 
		Thread.sleep(3000); 
		
		
		
	}
	
	public static void border(WebElement element, WebDriver driver) {
		JavascriptExecutor jse= (JavascriptExecutor)driver; 
		jse.executeScript("arguments[0].style.border='5px solid red'", element);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void scrollIntoViews(WebDriver driver, WebElement element) {
		JavascriptExecutor JSE=(JavascriptExecutor)driver; 
		JSE.executeScript("arguments[0].scrollIntoView(true)", element); 
		
	}

}