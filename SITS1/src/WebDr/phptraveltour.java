package WebDr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class phptraveltour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//Step2 Enter http://phptravels.net/ and click on and enter button
		driver.get("http://phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Assefa");
		driver.findElement(By.name("lastname")).sendKeys("Chaka");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		
		driver.findElement(By.name("email")).sendKeys("gelachaka@netzero.com");
		driver.findElement(By.name("password")).sendKeys("Leyatpacg10");
		driver.findElement(By.name("confirmpassword")).sendKeys("Leyatpacg10");
		//driver find element or sign up by xpath
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[9]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout"));
		driver.close();
		
		
		
		
		
			

	}

}
