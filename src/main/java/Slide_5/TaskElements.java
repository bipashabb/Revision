package Slide_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskElements {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com");
		Thread.sleep(4000); 
	
		List<WebElement> links=	driver.findElements(By.tagName("a")); 
		System.out.println(links.size());
		
		for(int a=0; a<links.size(); a++) {
			System.out.println("The link is"+links.get(a).getAttribute("href"));
			System.out.println("The text is"+links.get(a).getText());
		}
	}
	

}
