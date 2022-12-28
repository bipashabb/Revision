package Slide_4;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	static WebDriver driver; 

	public static void main(String[] args) {
		// Creating a picture folder, to store our Screenshots
		// Create Screenshot method, so that when calling screenshot method, it takes SS
		// TakeScreenshot interface, already set in Java
		// Must learn the way by heart, as no logical way, but rather an implemented technique for Screenshots
		
		//Calling Screenshot methods in main method so it takes screenshot

	}

	public static void Screenshots() throws IOException {
		
		Date object=new Date(); 
		System.out.println(object);
		String converted=object.toString().replace(" ", "_").replace(":", "_"); 
		System.out.println(converted); 
		
		
		File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //returning a screenshot, so must be stored in File=java.io Class
		// Taking SS with help of driver
		// Want to save it inside the Picture folder just created
		//Select Filehandler Class from org.openqa.selenium.io
		FileHandler.copy(screenshots, new File("U:\\eclipsework bipasha\\Eclipse work\\Revision\\Pictures\\"+converted+"Screenshot.jpg"));
		//This will save every new file from Screenshots class to a destination inside new File (path of picture folder\\default name
		//of the screenshot.format such as home.jpg
		// To avoid having same screenshot without differentiation in name,we add time/date in format, which we add to the path
		// This happens at the beginning before taking the SS, so that all are saved accordingly
		// Select Date() java.util
		// The default format of date isn't valid so msut convert into String, all spaces and colongs become underscore
		
		
	}
}
