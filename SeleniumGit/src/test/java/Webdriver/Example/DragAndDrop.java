package Webdriver.Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	@Test
	  public void f() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver d10;
		  
		  
		  d10=new ChromeDriver();

		  d10.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  
		  d10.get("http://www.leafground.com/pages/Edit.html");
		  

          WebElement element = d10.findElement(By.id("email"));
          
          Actions act=new Actions(d10);

          WebElement element1 = d10.findElement(By.xpath("//input[contains(@value,'Append')]"));
          
          act.sendKeys(element, "Pawan")
             .doubleClick()
             .dragAndDrop(element, element1).build().perform();

 
		  

}
}