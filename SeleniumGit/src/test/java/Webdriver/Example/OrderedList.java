package Webdriver.Example;

import java.awt.List;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class OrderedList {
	
	@Test
	  public static void f() throws InterruptedException, IOException {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver c2;
		  
		   c2=new ChromeDriver();
		  
		   c2.get("http://demo.automationtesting.in/AutoComplete.html");
		  
		   c2.findElement(By.id("searchbox")).sendKeys("A");
	        Thread.sleep(10000);
		  
	        java.util.List<WebElement> unordered= c2.findElements(By.xpath("//ul[@id='ui-id-1']//li)"));
		  
		    int leng = unordered.size();
	        System.out.println(leng);
	        Thread.sleep(10000);
	        for (WebElement list : unordered) {
	            if (list.getText().equalsIgnoreCase("Afghanistan")) {
	            	list.click();
	                break;
	                
	            }}
        
          TakesScreenshot t1=(TakesScreenshot) c2;
          File Source=t1.getScreenshotAs(OutputType.FILE);
         File Destination=new File("C:\\Users\\pawankishor.sanap\\OneDrive - HCL Technologies Ltd\\Desktop\\Practice\\Screen1.jpg");
          
          FileHandler.copy(Source, Destination);
          
          
          
          
          
}}

	
