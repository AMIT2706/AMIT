package webdrivermethods1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.licindia.in/");
		
		String expectedTitle1 ="Life Insurance Corporation of India - Home";
		String actualTitle1= driver.getTitle();
		
		System.out.println("expected title"+expectedTitle1);
		System.out.println("actual title"+actualTitle1);
		
		if (actualTitle1.equals(expectedTitle1)) {
		     System.out.println("PASS:: Login Page Title is Correct.");
			}
			else {
			  System.out.println("FAIL:: Login Page Title is InCorrect.");
				}
		
		String expectedUrl1 = "https://www.licindia.in/";
		String actualUrl1= driver.getCurrentUrl();
			
		System.out.println("expected url"+expectedUrl1);
		System.out.println("actual url"+actualUrl1);
		
		if (actualUrl1.equals(expectedUrl1)){
		System.out.println("PASS:: Login Page Url is Correct.");
		}
		
		else {
		  System.out.println("FAIL:: Login Page Url is InCorrect.");
		}
	
		driver.navigate().to("https://www.licindia.in/Guidelines/Be-a-Corporate-Agent");
		
		String expectedTitle2 ="Life Insurance Corporation of India - Be a Corporate Agent";
		String actualTitle2= driver.getTitle();
		
		System.out.println("expected title"+expectedTitle2);
		System.out.println("actual title"+actualTitle2);
		
		if (actualTitle2.equals(expectedTitle2)) {
		     System.out.println("PASS:: Login Page Title is Correct.");
			}
			else {
			  System.out.println("FAIL:: Login Page Title is InCorrect.");
				}
		
		String expectedUrl2 = "https://www.licindia.in/Guidelines/Be-a-Corporate-Agent";
		String actualUrl2= driver.getCurrentUrl();
			 
		System.out.println("expected url "+expectedUrl1);
		System.out.println("actual url "+actualUrl1);
		
		if (actualUrl2.equals(expectedUrl2)){
		System.out.println("PASS:: Login Page Url is Correct.");
		}
		
		else {
		  System.out.println("FAIL:: Login Page Url is InCorrect.");
		}
		
	      Navigation navigation= driver.navigate();
	      
	        navigation.back();
	        
	      String expectedUrl3 = "https://www.licindia.in/";
			String actualUrl3= driver.getCurrentUrl();
				
			System.out.println("expected url"+expectedUrl3);
			System.out.println("actual url"+actualUrl3);
			
			if (actualUrl3.equals(expectedUrl3)){
			System.out.println("PASS:: Login Page Url is Correct.");
			}
			
			else {
			  System.out.println("FAIL:: Login Page Url is InCorrect.");
			}
	
			     navigation.forward();
			     
   String expectedUrl4 = "https://www.licindia.in/Guidelines/Be-a-Corporate-Agent";
				 String actualUrl4= driver.getCurrentUrl();
						
					System.out.println("expected url"+expectedUrl4);
					System.out.println("actual url"+actualUrl4);
					
					if (actualUrl4.equals(expectedUrl4)){
					System.out.println("PASS:: Login Page Url is Correct.");
					}
					
					else {
					  System.out.println("FAIL:: Login Page Url is InCorrect.");
					}
					driver.quit();
	     	}
	}


