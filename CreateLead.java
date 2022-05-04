package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("aaa");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("aaaFN");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("aaaLN");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement text = driver.findElement(By.id("viewLead_companyName_sp"));
		System.out.println(text.getText());
		
		//driver.findElement(By.xpath("//input[@id='ext-gen234']")).sendKeys("Arun");
		//driver.findElement(By.xpath("//input[@id='ext-gen236']")).sendKeys("Akash");
		//driver.findElement(By.xpath("//button[text()='Create Lead']")).click();
		

	}

}
