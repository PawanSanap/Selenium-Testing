package Webdriver.Example;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotScreenshot {

	@Test
	  public void testAlert() throws IOException, AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver c3;
	
    c3=new ChromeDriver();
    
    c3.get("https://demoqa.com/alerts");
	
	 c3.manage().window().maximize();
	
    c3.findElement(By.id("alertButton")).click();
	
	Robot r1=new Robot();

	Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();


	Rectangle rect1=new Rectangle(sc_size);
	
	BufferedImage source= r1.createScreenCapture(rect1);
	
	File Destination=new File("C:\\Users\\pawankishor.sanap\\OneDrive - HCL Technologies Ltd\\Desktop\\Practice\\Screen3.jpg");
	
	ImageIO.write(source, "jpg", Destination);
	

}
	

	
	}
