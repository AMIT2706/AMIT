package webdrivermethodss;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester6 {

	public static void main(String[] args) {
	            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
					ChromeDriver driver = new ChromeDriver();
					driver.get("https://demo.actitime.com/");
					
					String expectedText ="Please identify yourself";
					String source =driver.getPageSource();
					
					if (source.contains(expectedText)) {
						System.out.println("PASS:: The Text is Present");
					}
					else {
						System.out.println("FAIL:: The Text is Not present");
					}
				 driver.close();	
		

	}

}
