package Webdriver.Example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Checkbox{
	
	@Test
	  public void testCheckbox() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
	
    WebDriver d4;
	
	d4=new ChromeDriver();
	
	d4.get("http://www.leafground.com/pages/checkbox.html");
	
	d4.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[2]/input")).click();
	
	
	 
	 //d4.quit();

	
	
	
	

	
	  
	

}}
