package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class selenium4 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","/Users/beigkaustubhs/Downloads/jdk-14.0.1.jdk/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://elastic.rapidtestpro.com:8086/index");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("labuser");
		driver.findElement(By.name("password")).sendKeys("labuser@01");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		
		driver.findElement(By.linkText("Transfer")).click();
		driver.findElement(By.linkText("Between Accounts")).click();
		driver.findElement(By.id("transferFrom")).sendKeys("Primary");
		driver.findElement(By.id("transferTo")).sendKeys("Savings");
		driver.findElement(By.id("amount")).sendKeys("25000");
		driver.findElement(By.xpath("//button[text()='Transfer']")).click();
		
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Go to Withdrawal")).click();
		driver.findElement(By.id("accountType")).sendKeys("Savings");
		driver.findElement(By.id("amount")).sendKeys("10000");
		driver.findElement(By.xpath("//button[text()='Withdraw']")).click();
		
		
		
		

	
         }
}