package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester8a {

	public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	        WebDriver driver= new ChromeDriver();

	        driver.manage().window().maximize();
	   
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	       
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	       
	    driver.findElement(By.id("btnLogin")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.quit();
	       
	     }
	}
