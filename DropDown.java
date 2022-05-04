package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.name("username")).sendKeys("SA");
		driver.findElement(By.id("input-firstname")).sendKeys("FN");
		driver.findElement(By.id("input-lastname")).sendKeys("LN");
		driver.findElement(By.id("input-email")).sendKeys("FN@email.com");
		driver.findElement(By.id("input-country")).sendKeys("Anguilla");
		
		
		
		
	}

}
