package Webdriver.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DDLlist {

	
	@Test
	  public void testButton() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d5;
	
	d5=new ChromeDriver();
	
	d5.get("http://www.leafground.com/pages/Dropdown.html");
	
	Select select1=new Select(d5.findElement(By.name("dropdown2")));
	
	select1.selectByVisibleText("UFT/QTP");
	
	Boolean msg=select1.isMultiple();
	
	System.out.println(msg);
	
    Select select2=new Select(d5.findElement(By.id("dropdown1")));
	
	select2.selectByIndex(2);
	
	Select select3=new Select(d5.findElement(By.id("dropdown3")));
	
	select3.selectByValue("3");
	
	//d5.quit();
	
	
	
	
}}
