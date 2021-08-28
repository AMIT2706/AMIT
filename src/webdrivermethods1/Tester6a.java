package webdrivermethods1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester6a {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.licindia.in/");
		
		driver.navigate().to("https://licindia.in/Guidelines/Be-a-Corporate-Agent");

        driver.quit();
	}
}
	
	

