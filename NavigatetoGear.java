package testNgframeworkEx;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NavigatetoGear extends LoginToApp {
	 @Test (groups= {"Regression Testing"})
	    public void testGearTab() {
		 Actions actions = new Actions(driver);
		 
	        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]/span[2]"))).perform();
	       
	       driver.findElement(By.xpath("//*[@id=\"ui-id-25\"]/span")).click();
	       String gettilte= driver.findElement(By.xpath("//div[@class='page-title-wrapper']/h1")).getText();
	       System.out.println(gettilte);

}}
