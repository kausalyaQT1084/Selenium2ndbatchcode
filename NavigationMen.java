package testNgframeworkEx;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NavigationMen extends LoginToApp {
	@Test(priority=1,groups= {"smoke Testing"})
	public void testWomenTab() {
		 Actions actions = new Actions(driver);
		 
	        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"))).perform();
	        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]/span[2]"))).perform();
	         driver.findElement(By.xpath("//*[@id=\"ui-id-19\"]/span")).click();
	       String gettilte= driver.findElement(By.xpath("//div[@class='page-title-wrapper']/h1")).getText();
	       System.out.println(gettilte);

}}
