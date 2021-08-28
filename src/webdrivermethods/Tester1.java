package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		// TODO Auto-generated method stub

	}

}
