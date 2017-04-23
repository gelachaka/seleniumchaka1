package WebDr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercurytoursReg {

	public static void main(String[] args) {
		//Author :Assefa
		// TODO Auto-generated me
		// open Firefox web browser
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	
		WebElement element = driver.findElement(By.linkText("REGISTER"));
		element.click();
		
		WebElement element1 = driver.findElement(By.name("firstName"));
		element1.sendKeys("Assefa");
		
		WebElement element2 = driver.findElement(By.name("lastName"));
		element2.sendKeys("Chaka");
		
		WebElement element3 = driver.findElement(By.name("Phone"));
		element3.sendKeys("1234567890");
		
		WebElement element4 = driver.findElement(By.name("address1"));
		element4.sendKeys("525 Theyayer Ave");
		
		WebElement element5 = driver.findElement(By.name("city"));
		element5.sendKeys("Silver Spring");
		
		WebElement element6 = driver.findElement(By.name("state"));
		element6.sendKeys("MD");
		
		WebElement element7 = driver.findElement(By.name("postalCode"));
		element7.sendKeys("20910");
		
		WebElement element8 = driver.findElement(By.name("emaile"));
		element8.sendKeys("gelachaka@netzero.com");
		
		WebElement element9 = driver.findElement(By.name("password"));
		element9.sendKeys("Mercury");
		
		WebElement element10 = driver.findElement(By.name("confirmPassword"));
		element10.sendKeys("Mercury");
		
		WebElement element11 = driver.findElement(By.name("register"));
		element11.click();		
		driver.getPageSource().contains("Thank you for registering. you	may now sign-in using the user name and password you have just entered");
			}
	}

			

