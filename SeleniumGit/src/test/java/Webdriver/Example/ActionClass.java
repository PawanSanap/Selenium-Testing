package Webdriver.Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {

	
	@Test
	  public void f() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver d10;
		  
		  
		  d10=new ChromeDriver();

		  d10.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  
		  d10.get("http://www.leafground.com/pages/Edit.html");
		  
		  WebElement element1=d10.findElement(By.id("email"));
		  
		  Actions act1=new Actions(d10);
		  
		  act1.sendKeys(element1, "Pawan")
	      .doubleClick()
          .contextClick().build().perform();	  
	  
		  
		  
		  
		  
}
}
