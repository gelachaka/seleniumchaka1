package WebDr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1 open Web Browser
		WebDriver browser = new FirefoxDriver();
		
		//Step2 Enter https://www.google.com and click on and enter button
		browser.get("https://www.google.com/");
		
		//step3 Enter "Herdon VA" and click Search button 
		
		browser.findElement(By.name("q")).sendKeys("Herendon VA");
		//click on search button. and 
		//browser .findElement (By.name("q)). sendkeys("Herendon VA);
		//click on Search Button (By.name("btnG")).click();
		browser.findElement(By.name("btnG")).click();
		
		//
		 
		
		
		

	}

}
