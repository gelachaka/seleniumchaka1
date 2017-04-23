package WebDr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		//Step2 Enter https://www.google.com and click on and enter button
		
		driver.get("http://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Herendon VA Weather");
		element.submit();
		
		//Thread.sleep(500);
		System.out.println("Page title is : "+ driver.getTitle());
			
	}

}
