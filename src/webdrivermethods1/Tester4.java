package webdrivermethods1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.quit();
	}

}
