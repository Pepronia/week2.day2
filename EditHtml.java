package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("abc@wmail.com");
		WebElement text = driver.findElement(By.xpath("//input[contains(@value,'Append')]"));
		text.clear();
		
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).getText();
		boolean enabled = driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).isEnabled();
		System.out.println(enabled);
	}

}
