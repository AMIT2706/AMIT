package XPATH;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testetr1 {

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	 driver.findElement(By.id("email")).sendKeys("7007895189");
	
	 driver.findElement(By.id("pass")).sendKeys("TESTING@123");
	
	 driver.findElement(By.name("login")).click();
	}
}
