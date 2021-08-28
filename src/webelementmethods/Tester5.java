package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Tester5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
		
		WebDriver driver= new InternetExplorerDriver();
		 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.className("dismiss")).click();
	}
}