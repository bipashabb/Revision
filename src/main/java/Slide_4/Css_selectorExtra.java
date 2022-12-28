package Slide_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Css_selectorExtra {
	static WebDriver driver; 
	//To select child element with help of Parent, we do ParentCssslector>childtag
	//Side note, we can locate elements inside #Shadow-root
	public static void main(String[] args) throws InterruptedException {
	Ibrowser("chrome", "https://www.facebook.com");
	
	driver.findElement(By.linkText("Create New Account")).click();
	
	driver.findElement(By.cssSelector("div._8ien>img")).click(); // ParentCssSelector(tag.Classvalue)>childtag
	
	//CssSelector with other attributes
	// Tagname[attribute='value'] 
	driver.findElement(By.cssSelector("input[type='text']")).click(); 
	
	//CssSelectorMultipleattributes
	//Tagname[attribute1='Value']][attribute2='Value'] Can add more with [][][][]
	// No need for //, @ or and
	driver.findElement(By.cssSelector("input[type='password'][class='inputtext _55r1 _6luy _9npi']")); 
	
	//CessSelector with contains
	//Sometimes the values of attributes can change, then we use contains, and only the partial value that doesn't change
	// Contains in Css is *
	//Tagname[attribute*='partial Value'] 
	// * means contains, and partial value because it should contains some of tha value, not necessary to put full value
	driver.findElement(By.cssSelector("input[class*='inputtext'][data-testid='royal_email']")); 
	
	//Starts_with Css Selector
	// Tagname[attribute^='Start of the value'] 
	//^ means starts-with
	driver.findElement(By.cssSelector("input[aria-label^='Email']")).click(); 
	
	//Endwith CssSelector
	// Opposite of Starts-with
	// Put the ending of the value
	// Tagname[attribute$='End of the value']
	// $ means end with
	driver.findElement(By.cssSelector("input[class$='_9npi']")); 
	
	// First of type Css Selector in Amazon
	// When a parent doesn't have attribute we can use help of Grandparent
	// First of type when getting multiple element, first of, means the first of all the tags found
	//Tagnmae:first-of-type
	// For Trending button on Amazon
	driver.findElement(By.cssSelector("ul.hmenu.hmenu-visible>li:first-of-type>div")).click(); 
	// Here we found the grandparents, because multiple class value, added dot (.) between the values>its child: because it had
	// multiple child, used first of type, parent now located> the child tag
	// With help of 2 generation, located child
	// Used first-of-type
	
	//Last-of-type Css Selector in Amazon
	//Sign in button in the same pop up
	driver.findElement(By.cssSelector("ul.hmenu.hmenu-visible>li:last-of-type>a")).click(); 
	// In the same way.. we located this button
	
	//nth-of-type Css Selector in Amazon
	// As opposed to first and last, this we can choose any element in between
	// Movers button is the 1st child of the 4th parents of the grandparent tag ul
	//Tagname:nth-of-type(nb of the element). This is diff than index, counting starts at 1
	driver.findElement(By.cssSelector("ul.hmenu.hmenu-visible>li:nth-of-type(4)>a")).click(); 
	
	//Handling immediate siblings in CssSelector
	//hyrtutorial website
	// Selenium practice/CssSelectorPractice
	//Gender field
	//To locate following sibling,  (lower element), with help of preceding sibling(upper element) the "+" selects immediate sibling
	// preceding sibling CSSselector+followingsibling CSS OR tag
	driver.findElement(By.cssSelector("input#lastName+input.gender")).click(); 
	
	
	//Select all following elements (all belows)
	// Would select all following sibling or any followsing element
	//PrecedingelementsCSSany~following element's CSS
	// Help us select any elements from below rather than immediate one
	//Locate country, with help of Last name
	
	driver.findElement(By.cssSelector("input#lastName~input[placeholder='Country']")).click(); 
	
	//Located the next element, not sibling, and use first-of-type because two elements were located
	// Instead of using following element'css, used tagname:first-of-type
	driver.findElement(By.cssSelector("input#lastName~a:first-of-type")).click(); 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	public static void Ibrowser (String nameofBrowser, String url) throws InterruptedException {
		if(nameofBrowser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\chromedriver.exe"); 
			driver= new ChromeDriver(); 
			driver.get(url);
			Thread.sleep(3000);
		}
			
			else if (nameofBrowser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "U:\\eclipsework bipasha\\Eclipse work\\Revision\\Drivers\\msedgedriver.exe");
				driver=new EdgeDriver(); 
				driver.get(url); 
				Thread.sleep(3000);; 
			}
			
	}

}
