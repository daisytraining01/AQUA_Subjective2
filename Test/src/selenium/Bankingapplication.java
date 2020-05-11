package selenium;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bankingapplication {
	
public static void main (String[] args) {
	
	List<UserCreds> users= new ArrayList<UserCreds>();
System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://elastic.rapidtestpro.com:8086/userFront");
WebElement username=driver.findElement(By.id("username"));
WebElement password_field=driver.findElement(By.id("password"));
WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));


username.sendKeys("labuser");
password_field.sendKeys("labuser@01");
login.click();
System.out.println("Login Done with Click");


}
}
