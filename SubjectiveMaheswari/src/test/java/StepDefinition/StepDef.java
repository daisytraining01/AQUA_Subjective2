package StepDefinition;

import org.openqa.selenium.WebDriver;

import Code.Maincode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	Maincode abc= new Maincode();
	@Given("^I have url$")
	public void i_have_url()  {
		
		abc.i_have_url();
		
		}

	@When("^I enter the username and password$")
	public void i_enter_the_username_and_password()  {
		
		
		abc.i_enter_the_username_and_password();
	    
	}

	@When("^I enter the fund details$")
	public void i_enter_the_fund_details()  {
	    abc.i_enter_the_fund_details();
	    
	}

	@When("^I click transfer button$")
	public void i_click_transfer_button()  {
	    
	    abc.i_click_transfer_button();
	}

	@Then("^I able to see the reduced balance$")
	public void i_able_to_see_the_reduced_balance()  {
	    abc.i_able_to_see_the_reduced_balance();
	    
	}

	@When("^I fill recipient information$")
	public void i_fill_recipient_information()  {
	    
	    abc.i_fill_recipient_information();
	}

	@When("^I click add button$")
	public void i_click_add_button()  {
	    abc.i_click_add_button();
	    
	}

	@Then("^I able to see the added recipient$")
	public void i_able_to_see_the_added_recipient()  {
	    
	    abc.i_able_to_see_the_added_recipient();
	}


}
