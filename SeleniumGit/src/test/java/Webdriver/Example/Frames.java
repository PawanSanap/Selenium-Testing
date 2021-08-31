package Webdriver.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {

	
	 @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver d7=new ChromeDriver();
		  
		  d7=new ChromeDriver();
		  
		  d7.get("http://www.leafground.com/pages/frame.html");
		  
		  d7.switchTo().frame(0);
		  
		  WebElement bttnl =  d7.findElement(By.id("Click"));
		  
		  bttnl.click();
		  
		  d7.switchTo().defaultContent();
		  
		  d7.switchTo().frame(1);
		  
		  d7.switchTo().frame("frame2");
		  
		  d7.findElement(By.id("Click1"));
		  
		  WebElement bttnl2 =  d7.findElement(By.id("Click1"));
		  
		  bttnl2.click();
		  
		  d7.switchTo().parentFrame();
		  
		  //d7.quit();
}
}
