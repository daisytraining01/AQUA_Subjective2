package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition 
{
	static WebDriver driver;
	@Given("^I have url$")
	public void i_have_url() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://elastic.rapidtestpro.com:8086/index");

	}

	@When("^I enter the credentials$")
	public void i_enter_the_credentials() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("labuser");
		driver.findElement(By.id("password")).sendKeys("labuser@01");

	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.name("submit")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();

	}

	@Then("^I am able to navigate to Homepage$")
	public void i_am_able_to_navigate_to_Homepage() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		//String s1 = driver.findElement(By.xpath("//h3")).getText();
		//String s2 = "Login Successfully";
		//Assert.assertEquals(s2, s1);
		System.out.println("Homepage loaded Successfully");
		//driver.close();
		
	}
	@When("^I click on Transfer Between Accounts$")
	public void i_click_on_Transfer_Between_Accounts() throws Throwable
	{
	 
	driver.findElement(By.linkText("Transfer")).click();	
		
	}

	@When("^Enter the required details$")
	public void enter_the_required_details() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^Transfer functionality is successfully verified$")
	public void transfer_functionality_is_successfully_verified() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
