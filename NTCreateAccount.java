package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement webElement = driver.findElement(By.id("username"));
		webElement.sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//driver.findElement(By.id("currencyUomId")).sendKeys("INR - Indian Rupee");
		Select drpCurrency = new Select ( driver.findElement(By.id("currencyUomId")));
		drpCurrency.selectByValue("INR");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("KS Site");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10000");
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		
		System.out.println(text);
	}

}
