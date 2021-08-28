package webdrivermethods2;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester11a {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		       
		     Point targetPoint = new Point(100,50);
		     driver.manage().window().setPosition(targetPoint);
		     
		     driver.quit();
	}
}

		     
		   
