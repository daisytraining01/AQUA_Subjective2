package Project.SubjectiveTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
	static WebDriver driver;

	 @Given("^i have url$")
	 public void URL()
		{
		    driver=new ChromeDriver();		
	driver.manage().deleteAllCookies();
	
	driver.get("http://elastic.rapidtestpro.com:8086/index");
	driver.manage().window().maximize();
	
	
}
	 @When("^enter username and password$")
	 {
		 driver.findElement(By.id ("username").sendkeys(labuser)
				 driver.findElement(By.id("password")).sendkeys(labuser@01)
	 }
	 
	 
