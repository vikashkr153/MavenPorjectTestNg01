package Pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;

	public class BaseClass {

		public static WebDriver driver;

		
		@BeforeTest
		@Parameters ("browser")	
		public void preCondition(String browser)
		{
			try	{
				if(browser.equalsIgnoreCase("Firefox")){
					driver = new FirefoxDriver();
				}
				if(browser.equalsIgnoreCase("Chrome")){
					//Location of the chromedriver.exe file stored in your machine
					System.setProperty("webdriver.chrome.driver","C:\\New folder\\eclipse-workspace\\MavenPorjectTestNg01\\src\\test\\java\\drivers\\chromedriver.exe");
					driver = new ChromeDriver();
				}
				if(browser.equalsIgnoreCase("IE")){
					//Location of the IEDriverServer.exe file stored in your machine        
					System.setProperty("webdriver.ie.driver","C:\\Users\\A635614\\eclipse-workspace\\MavenSelTestNG2\\src\\test\\java\\drivers\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}                
			}
			catch (WebDriverException e){
				System.out.println("Browser not found" +e.getMessage());
			}
		}

		@AfterTest
		public void closeBrowser() {
			if (driver!=null) {
				driver.quit();
			}
		}

	}

	


