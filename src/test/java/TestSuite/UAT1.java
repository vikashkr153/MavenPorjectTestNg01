package TestSuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.BaseClass;




public class UAT1 extends BaseClass{

	@Test
	public void testLogin() throws InterruptedException {
		driver.get("https://atosgit.peoplestrong.com/altLogin.jsf");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id=\"loginForm:username12\"]")).sendKeys("50022333");
		driver.findElement(By.xpath("//input[@id=\"loginForm:password\"]")).sendKeys("Dec@2019");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();

	}
}