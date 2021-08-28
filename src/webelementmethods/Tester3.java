package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		driver.findElement(By.name("q")).sendKeys("Javascript");

	}

}
