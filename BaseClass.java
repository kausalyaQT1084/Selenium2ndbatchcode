package testNgframeworkEx;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	 //private static final Logger LOGGER = Logger.getLogger(BaseClass.class.getName());
	
	
//Launching the Browser
	@BeforeMethod(groups= {"Regression Testing","smoke Testing"})
	public void preCondition() {
		
	    	String driverPath = System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	          ChromeOptions options = new ChromeOptions();	    
	    	options.addArguments("--remote-allow-origins=*");
	    	DesiredCapabilities capabilities = new DesiredCapabilities();
	    	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    	options.merge(capabilities);
	    	
	    	driver = new ChromeDriver(options);
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
	
	
	@AfterClass
		public void closedriver() {
			driver.close();
		}


	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return true;
	}
	}
	
	
	
	
