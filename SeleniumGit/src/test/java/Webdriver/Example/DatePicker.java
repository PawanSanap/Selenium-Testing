package Webdriver.Example;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {

	

	@Test
	  public void testAlert() throws IOException, AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver c3;
	
    c3=new ChromeDriver();
    
    c3.manage().window().maximize();
    
    c3.get("http://demo.automationtesting.in/Datepicker.html");
    
    JavascriptExecutor jse=( JavascriptExecutor) c3;
    
   // jse.executeScript("document.getElementById('datepicker2').value='25/08/2021'");
	
	 jse.executeScript("scroll(0,450)");
	 
   // Scroll within the page
	 
	/* c3.get("http://demo.automationtesting.in/Datepicker.html"); 
	JavascriptExecutor jse=( JavascriptExecutor) c3;
	WebElement ele1=c3.findElement(By.xpath("/html/body/div[2]/section/div[3]/p[9]/textarea"));
	jse.executeScript("argument[0].scrollIntoView(true)",ele1);
	ele1.Sendkeys("Pawan"); */ 
}}
