package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester8c {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	        WebDriver driver= new ChromeDriver();

	        driver.manage().window().maximize();
	   
	driver.get("https://skillrary.com/user/login");

	WebElement emailidTextField =driver.findElement(By.id("email"));
	       emailidTextField.clear();
	      emailidTextField.sendKeys("ameetdubey39@gmail.com");
	       
	WebElement passwordTextField =driver.findElement(By.name("password"));
	       passwordTextField.clear();
	       passwordTextField.sendKeys("Amit@39");
	       
	      driver.findElement(By.className("recaptcha-checkbox-border")).click();
	       
	      Thread.sleep(2000);
	    
	     driver.findElement(By.className("btn btn-color animated fadeInLeft")).click();
	     
	     Thread.sleep(3000);
	     
	     driver.quit();
	       
	     }
}

