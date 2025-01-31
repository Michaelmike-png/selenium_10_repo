package bikes;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Mockm {
	@Test
	public void browser() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		TakesScreenshot ts=new(TakesScreenshot) driver;
		  File temp = ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File("");
		 FileHandler.copy(temp, dest);
		 
		 driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
		 
		 WebElement element = driver.findElement(By.linkText("Company"));
	        Action act = new Action(driver);
	        act.moveToElement(element).perform(); 
	        driver.findElement(By.linkText("Contact Us")).click();  	  
	      
	                
	    
	        		 
		 
		 
		 
		 
				  
				  
	

	}
	
	
}
