package Webdriver.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromtAlert {
	@Test
	  public void testAlert() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d6;
	
  d6=new ChromeDriver();
	
	d6.get("http://www.leafground.com/pages/Alert.html");
	
	d6.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	
	d6.switchTo().alert().sendKeys("Pawan");
	
	d6.switchTo().alert().accept();
	
	
	
}}


