package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester8d {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	        WebDriver driver= new ChromeDriver();

	        driver.manage().window().maximize();
	   
	driver.get("https://www.facebook.com/");

	WebElement emailidTextField =driver.findElement(By.id("email"));
	       emailidTextField.clear();
	      emailidTextField.sendKeys("7007895189");
	       
	WebElement passwordTextField =driver.findElement(By.id("pass"));
	       passwordTextField.clear();
	       passwordTextField.sendKeys("522341");
	 
	      driver.findElement(By.name("login")).click();
	       Thread.sleep(15000);
	       driver.quit();
	       
	     
	     
	     }
	}
