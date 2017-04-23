package WebDr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uspslocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Step1 open Web Browser
		WebDriver browser = new FirefoxDriver();
		//Step2 Enter https://www.usps.com and click on and enter button
		browser.get("https://www.usps.com");
		browser.manage().window().maximize();
		Thread.sleep(5000);
		// Step3 click on quick tools
		browser.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
		//Click on Find Locations
		browser.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a/span")).click();
		//driver.findElement(By.xpath; and then search using zip code
		browser.findElement(By.xpath(".//*[@id='tCityStateZip']")).sendKeys("20906");
		//wait for five seconds for search buttons to enable
		Thread.sleep(5000);
		//click the search button to apply
		browser.findElement(By.xpath(".//*[@id='bSearch']")).click();
		
		
		
		
				
				
		
		

	}

}
