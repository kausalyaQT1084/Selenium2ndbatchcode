package testNgframeworkEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
public class NavigationWo extends LoginToApp{

	@Test
		    public void testMenTab() {
			 Actions actions = new Actions(driver);
			 
		        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"))).perform();
		        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]/span[2]"))).perform();
		         driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]/span")).click();
		       String gettilte= driver.findElement(By.xpath("//div[@class='page-title-wrapper']/h1")).getText();
		       System.out.println(gettilte);
	}
		 
	
	
	

}
