package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkHtml {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//Launch the Broser
		ChromeDriver driver = new ChromeDriver();
		//Load the Application url
		driver.get("http://leafground.com/pages/Link.html");
		//maximize the browser
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		Thread.sleep(2000);
		//Verify home page
		 String title = driver.getTitle();
		 String homePageTitle = "TestLeaf - Selenium Playground";
		 if(homePageTitle.equals(title))
		 {
			 System.out.println("Home page verified");
		 }
		 else
		 {
			 System.out.println("Home page not verified");
		 }
		 
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(attribute);
		//Verify Am I broken
		driver.findElement(By.linkText("Verify am I broken?"));
		String title2 = driver.getTitle();
		String errorPage = "404 Not Found";
		if(title2.equals(errorPage))
		{
			System.out.println("Yes am in broken page");
		}
		else
		{
			System.out.println("No am not in broken page");
		}
		
		driver.navigate().back();
		
		//Verify homePageLink
		String goToHomePageLink1 = driver.findElement(By.xpath("//a[text()='Go to Home Page']")).getAttribute("href");
		String goToHomePageLink2 = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).getAttribute("href");
		if(goToHomePageLink1.equals(goToHomePageLink2))
		{
			driver.navigate().to(goToHomePageLink1);
			System.out.println("Both the links are same so clicked the first link");
		}
		else
		{
			System.out.println("Both the links are not same ");
		}
		//How many links are available in this page?
		driver.navigate().back();
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		int size = findElements.size();
		System.out.println("Links" +size);
	}

}
