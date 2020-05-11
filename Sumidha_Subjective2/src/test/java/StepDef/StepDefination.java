package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination 
{
	static WebDriver driver;
	@Given("^I have url$")
	public void i_have_url(){
	    
	  System.setProperty("webdriver.chrome.driver", "/Users/sumidhan/Desktop/Workspace/TrainingSumidha/Driver/chromedriver");
	  
	driver = new  ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/newtours/register.php");
	}

	@When("^I enter the credentials$")
	public void i_enter_the_credentials(){
	    
	    driver.findElement(By.name("userName")).sendKeys("sumidhanashier");
	    driver.findElement(By.name("password")).sendKeys("sumidhanashier");
	    
	}

	@When("^I click login button$")
	public void i_click_login_button(){
	    
		driver.findElement(By.name("submit")).click();  
	}

	@Then("^I see the homepage$")
	public void i_see_the_homepage(){
	   String s1 = driver.findElement(By.xpath("//h3")).getText();
	   System.out.println(s1);
	   String s2 = "Login Successfully";
	   Assert.assertEquals(s2,s1);
	   System.out.println("Homepage loaded successfully");
	   
	   driver.quit();
	}

}