package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		String text = driver.getTitle();
		String pageVerify = "TestLeaf - Selenium Playground";
		if(pageVerify.equals(text))
		{
			System.out.println("Home page verified");
		}
		else
		{
			System.out.println("Home page not verified");
		}
		//click button
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		//get Location
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		
		int x = location.getX();
		int y = location.getY();
		System.out.println("locations are X" +x + "Location Y " +y);
		//get colour
		
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(cssValue);
		
		//find size
		
		Dimension size = driver.findElement(By.id("size")).getSize();
		int height = size.height;
		int width = size.width;
		
	System.out.println("Height is " +height);
	System.out.println("Width is " +width);	
	
		
		
		
		

}
}
