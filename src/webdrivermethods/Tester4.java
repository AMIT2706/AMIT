package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String title= driver.getTitle();
		System.out.println("The Webapage Title is " + title);
		String url=driver.getCurrentUrl();
		System.out.println("The Webpage Url is " + url);
		driver.close();

 
}
}
