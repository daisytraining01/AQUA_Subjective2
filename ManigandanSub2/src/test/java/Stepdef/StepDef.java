package Stepdef;

import Code.Code;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef 
{
	Code c = new Code();
	
	@Given("^I have url$")
	public void i_have_url()  
	{
	    c.url();    
	}

	@When("^I enter the username and password$")
	public void i_enter_the_username_and_password()  
	{
	    c.login();
	    
	}

	@When("^I enter the fund details$")
	public void i_enter_the_fund_details()
	{
		c.fundDetails();
	    
	    
	}

	@When("^I click transfer button$")
	public void i_click_transfer_button()  
	{
	    c.transferButton();
	    
	}

	@Then("^I able to see the reduced balance$")
	public void i_able_to_see_the_reduced_balance()  
	{
	    
		c.balCheck();
	}

	@When("^I fill recipient information$")
	public void i_fill_recipient_information()  
	{
	    c.fillRecipient();
	    
	}

	@When("^I click add button$")
	public void i_click_add_button() 
	{
	    
	    c.addRecipient();
	}

	@Then("^I able to see the added recipient$")
	public void i_able_to_see_the_added_recipient() 
	{
	    c.checkRecipient();
	    
	}

}
