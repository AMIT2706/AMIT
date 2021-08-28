package webdrivermethods2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester10b {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		 driver.manage().window().setSize(new Dimension(300,700));
		 
		 driver.quit();
	
	}
	
		     
}
