package rapidTest;

import java.sql.ResultSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class RapidStepDef {
	
	public static WebDriver driver;
	
	static double savingsAmount;
	static double depositeAmount;
	static double withdrawAmount;
	static double savaingsAmountBalance;
	
	
	@Given("^user logs in to the application$")
	public void user_logs_in_to_the_application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Softwares\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elastic.rapidtestpro.com:8086/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MICROSECONDS);
		driver.manage().window().maximize();
		WebElement inputLogin = driver.findElement(By.id("username"));  //labuser
		inputLogin.sendKeys("labuser");
		
		WebElement inputPassword = driver.findElement(By.id("password")); //labuser@01
		inputPassword.sendKeys("labuser@01");
		
		WebElement btnSignIn = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		btnSignIn.click();
	}

	@When("^user deposits amount to savings account and verifies the saving amount$")
	public void user_deposits_to_savings_account() throws Throwable {
		ResultSet DepositAmounts = Utils.mySQL();
		while(DepositAmounts.next()){
		String savings = driver.findElement(By.xpath("//div/h2[contains(text(),'Savings Balance: ')]/../following-sibling::div//span")).getText();
		savingsAmount = Double.parseDouble(savings);
		depositeAmount = Double.parseDouble(DepositAmounts.getString(1));
		driver.findElement(By.xpath("//span[contains(text(),'Go to Deposit')]")).click();
		
		WebElement accountType = driver.findElement(By.id("accountType"));
		Select s = new Select(accountType);
		s.selectByVisibleText("Savings");
		
		WebElement inputAmount = driver.findElement(By.id("amount"));
		inputAmount.sendKeys(DepositAmounts.getString(1));
		
		WebElement btnDeposite = driver.findElement(By.xpath("//button[text()='Deposit']"));
		btnDeposite.click();		
	
		
		String savingsDeposite = driver.findElement(By.xpath("//div/h2[contains(text(),'Savings Balance: ')]/../following-sibling::div//span")).getText();
		savaingsAmountBalance = Double.valueOf(savingsDeposite);
		Assert.assertEquals(savingsAmount+depositeAmount, savaingsAmountBalance);
		}
		driver.quit();
	
	}

	@When("^the user withdraws \"([^\"]*)\" from savings account$")
	public void the_user_withdraws_from_savings_account(String withdrawalAmount) throws Throwable {

		String savings = driver.findElement(By.xpath("//div/h2[contains(text(),'Savings Balance: ')]/../following-sibling::div//span")).getText();
		savingsAmount = Double.valueOf(savings);
		withdrawAmount = Double.valueOf(withdrawalAmount);
		driver.findElement(By.xpath("//span[contains(text(),'Go to Withdrawal')]")).click();
		
		WebElement accountType = driver.findElement(By.id("accountType"));
		Select s = new Select(accountType);
		s.selectByVisibleText("Savings");
		
		WebElement inputAmount = driver.findElement(By.id("amount"));
		inputAmount.sendKeys(withdrawalAmount);
		
		WebElement btnDeposite = driver.findElement(By.xpath("//button[text()='Withdraw']"));
		btnDeposite.click();
	
	}

	@Then("^the withdrawn amount should be deducted from savings account$")
	public void the_withdrawn_should_be_deducted_from_savings_account() throws Throwable {
		
		String savingsDeposite = driver.findElement(By.xpath("//div/h2[contains(text(),'Savings Balance: ')]/../following-sibling::div//span")).getText();
		savaingsAmountBalance = Double.valueOf(savingsDeposite);
		Assert.assertEquals(savingsAmount-withdrawAmount, savaingsAmountBalance);
		driver.quit();
		
		
	}

	
	

}
