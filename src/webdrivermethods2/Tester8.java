package webdrivermethods2;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	              
		  Dimension currentWindowSize = driver.manage().window().getSize();
		  
		  int width = currentWindowSize.getWidth();
		  int height = currentWindowSize.getHeight();
		  System.out.println("width "+width);
		  System.out.println("height "+height);
		  
		  driver.quit();
		  
	}
}

