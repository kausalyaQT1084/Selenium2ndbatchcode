package testNgframeworkEx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AssertionInTestNG extends BaseClass {

	


	    @Test(priority = 1)
	    public void testPageTitle() {
	        // Verify the page title
	        String expectedTitle = "Home Page";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");
	    }

	    @Test(priority = 2)
	    public void testHeader() {
	        // Verify the presence of a header element
	        WebElement headerElement = driver.findElement(By.xpath("//span[@class='not-logged-in']"));
	        String s=headerElement.getText();
	       String K="Default welcome msg! ";
	       if(s==K) {
	    	   Assert.assertTrue(headerElement.isDisplayed(), "Header element displayed");
	    	   
	       }
	       
	    }

	    @Test(priority = 3)
	    public void testLoginLink() {
	        // Verify the presence and text of the Login link
	        WebElement loginLink = driver.findElement(By.linkText("Log in"));
	        Assert.assertTrue(loginLink.isDisplayed(), "Login link is not displayed");
	        Assert.assertEquals(loginLink.getText(), "Log in", "Incorrect login link text");
	    }

	    @Test(priority = 4)
	    public void testSearchBox() {
	        // Verify the presence of the search box
	        WebElement searchBox = driver.findElement(By.id("search"));
	        Assert.assertTrue(searchBox.isDisplayed(), "Search box is not displayed");
	    }

	  
	}
