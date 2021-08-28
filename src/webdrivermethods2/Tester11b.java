package webdrivermethods2;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester11b {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().setPosition(new Point(100,50));
		
		driver.quit();
       }

}
