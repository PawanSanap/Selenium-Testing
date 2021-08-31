package Webdriver.Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWait {
	
	 @Test
	  public void f() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver d9;
		  
		  
		  d9=new ChromeDriver();

		  d9.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  
		  d9.get("http://www.leafground.com/pages/Alert.html");
		  
		  WebDriverWait var1=new WebDriverWait(d9,20);
		  
		  var1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='normalAlert()']")));

		  //var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='normalAlert()']")));
		  
		  //var1.until(ExpectedConditions.elementToBeSelected(By.xpath("//button[@onclick='normalAlert()']")));
		  
		  
		  //var1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//button[@onclick='normalAlert()']")));
		  
		  String value2=d9.findElement(By.xpath("//button[@onclick='normalAlert()']")).getText();
		  
		 System.out.println(value2);
		  
		  
		  
		 
		  
		 
		 //d9.quit();
}}
