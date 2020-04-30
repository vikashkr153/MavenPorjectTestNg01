package TestSuite;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Pages.BaseClass;

public class SwitchTO extends BaseClass{
	
	
	@Test
	public void testLogin() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://atosgit.peoplestrong.com/altLogin.jsf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"loginForm:username12\"]")).sendKeys("50022333");
		driver.findElement(By.xpath("//input[@id=\"loginForm:password\"]")).sendKeys("Dec@2019");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();

		driver.manage().window().maximize();
		
		  ((JavascriptExecutor)driver).executeScript("window.open()");
		  driver.get("https://facebook.com");
 
		  ((JavascriptExecutor)driver).executeScript("window.open()");
		  driver.get("https://youtube.com");
		  Thread.sleep(5000);
 

//	
		 
		ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().window(tabs.get(2));
		
		
	}

}
