package testNgframeworkEx;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToApp extends ParallelExecuEx {
	 @Test(retryAnalyzer = RetryExecution.class)
	    public void testLogin() throws InterruptedException {	        
	        //Find sign in function
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//li/a[contains(text(),'Sign In')]")).click();
		 // Find the email input and enter a valid email
	        driver.findElement(By.id("email")).sendKeys("rk2q1c2@gmail.com");
	        // Find the password input and enter a valid password
	        driver.findElement(By.id("pass")).sendKeys("Ilove@2010");
	        // Find the login button and click it
	        driver.findElement(By.id("send2")).click();
	        
	    }
	}