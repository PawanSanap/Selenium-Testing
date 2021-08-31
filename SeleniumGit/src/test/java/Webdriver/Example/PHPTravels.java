package Webdriver.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PHPTravels {

	
	  @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver c1;
		  
		  c1=new ChromeDriver();
		  
		  c1.get("https://phptravels.org/register.php");
		  
		  //Personal Info
		  
		  c1.findElement(By.id("inputFirstName")).sendKeys("Pawan");
		  
		  c1.findElement(By.id("inputLastName")).sendKeys("Sanap");
		  
		  c1.findElement(By.id("inputEmail")).sendKeys("pawankishor143@gmail.com");
		  
		  c1.findElement(By.id("inputPhone")).sendKeys("8552843861");
		  
          c1.findElement(By.id("inputCompanyName")).sendKeys("HCL Tech");
          
          //Billing Address
          
           c1.findElement(By.id("inputAddress1")).sendKeys("Survodaya");
		  
		  c1.findElement(By.id("inputAddress2")).sendKeys("Parbhani");
		  
		  c1.findElement(By.id("inputCity")).sendKeys("Selu");
		  
          c1.findElement(By.id("stateinput")).sendKeys("Maharashtra");
		  
		  c1.findElement(By.id("inputPostcode")).sendKeys("431503");
		  
		  Select Dropdown = new Select(c1.findElement(By.id("inputCountry")));
	      
		  Dropdown.selectByValue("IN");
	      
	      c1.findElement(By.name("customfield[2]")).sendKeys("8552843861");
		  
		  c1.findElement(By.id("inputNewPassword1")).sendKeys("Pawan11");
		  
		  c1.findElement(By.id("inputNewPassword2")).sendKeys("Pawan11");
		  
		  Thread.sleep(5000);
		 
		  c1.findElement(By.xpath("//*[@id=\'frmCheckout\']/p/input")).click();
		  
		  c1.findElement(By.className("btn")).click();
		  
	      c1.findElement(By.name("username")).sendKeys("pawankishor143@gmail.com");
	      
	      c1.findElement(By.name("password")).sendKeys("Pawan11");
	      
	      Thread.sleep(4000);
	      
	      c1.findElement(By.id("login")).click();
	      
	      c1.findElement(By.className("dropdown-toggle")).click();
	      
	      c1.findElement(By.xpath("//*[@id=\"Primary_Navbar-Services-Order_New_Services\"]/a")).click();
	      
	      c1.findElement(By.id("pid13")).click();
	      
	      c1.findElement(By.xpath("//*[@id=\"order-boxes\"]/div[3]/form/div[2]/button")).click();
		  
	     
	  }}

