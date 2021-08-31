package Webdriver.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio {
	
	@Test
	  public void f() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d3;
	
	d3=new ChromeDriver();
	
	d3.get("http://www.leafground.com/pages/radio.html");
	
	d3.findElement(By.id("yes")).click();
	
	d3.findElement(By.cssSelector("input[value='1']")).click();
	 
    d3.findElement(By.cssSelector("input[value='2']")).click();
	
	//d3.quit();
	
}}
