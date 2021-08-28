package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester5 {

		public static void main(String[] args) {
			//write a Script to verify the login page Url and Title of actitime application.
		     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://demo.actitime.com/");
				String expectedTitle ="actiTIME - Login";
				String actualTitle= driver.getTitle();
				
				System.out.println("expected title" +expectedTitle);
				System.out.println("actual title" +actualTitle);
				
				if (actualTitle.equals(expectedTitle)) {
			     System.out.println("PASS:: Login Page Title is Correct.");
				}
				else {
				  System.out.println("FAIL:: Login Page Title is InCorrect.");
					}
				
				String expectedUrl = "https://demo.actitime.com/login.do";
				String actualUrl= driver.getCurrentUrl();
					
				System.out.println("expected url " +expectedUrl);
				System.out.println("actual url " +actualUrl);
				
				if (actualUrl.equals(expectedUrl)){
				System.out.println("PASS:: Login Page Url is Correct.");
				}
				
				else {
				  System.out.println("FAIL:: Login Page Url is InCorrect.");
				}
		
	}

}
