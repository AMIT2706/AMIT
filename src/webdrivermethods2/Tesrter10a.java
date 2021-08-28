package webdrivermethods2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tesrter10a {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		       
		     Dimension targetSize = new Dimension(300,700);	
		     driver.manage().window().setSize(targetSize);
		     
		     driver.quit();
		  
		     
	}

}
