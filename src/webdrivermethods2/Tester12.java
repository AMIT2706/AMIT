package webdrivermethods2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.skillrary.com/");
		
		
		   Dimension targetSize = new Dimension(1211,800);	
		    driver.manage().window().setSize(targetSize);
		    
		   System.out.println("The size of window where search bar not found" +targetSize);
		    Thread.sleep(10000);
		    
	        driver.quit();
		   	}
	}