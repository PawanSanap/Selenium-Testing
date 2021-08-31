package Webdriver.Example;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MulWindows {
	
	 @Test
	  public void f() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver d8=new ChromeDriver();
		  
		  d8.get("http://www.leafground.com/pages/Window.html");
		  
		  d8.navigate().back();
		  
		  d8.navigate().forward();
		  
		  WebElement bttn1 =  d8.findElement(By.id("home"));
		  
		  bttn1.click();
		  
		  Set<String> window_values = d8.getWindowHandles();
		  
		 Iterator<String> itr1 = window_values.iterator();
		 
		 String w1 = itr1.next();
		 
		 System.out.println(w1);
		 
         String w2 = itr1.next();
		 
		 System.out.println(w2);
		 
		 d8.switchTo().window(w2);
		 
		 System.out.println(d8.getTitle());
		 
		 System.out.println(d8.getCurrentUrl());
		 
		 System.out.println(d8.getPageSource());
		 
		 d8.navigate().to("http://google.com");
		 
		 d8.manage().window().maximize();
		 
         Thread.sleep(3000);
		 
		 
		 
		 
		 
		
		 
		 
}
}