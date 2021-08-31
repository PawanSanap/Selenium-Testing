package Webdriver.Example;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver d1;
	  
	  d1=new ChromeDriver();
	  
	  d1.get("http://www.leafground.com/");
	  
	  d1.findElement(By.linkText("Edit")).click();
	  
	  d1.findElement(By.id("email")).sendKeys("Pawan");
	  
	  d1.findElement(By.cssSelector("input[value='Append ']")).sendKeys("Kishor");
	  
	  d1.findElement(By.name("username")).sendKeys("Sanap");
	  
	  d1.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("Clear");
	  
	  d1.findElement(By.cssSelector("input[style='width:350px;background-color:LightGrey;']")).click();
	  //d1.quit();
  }
}
