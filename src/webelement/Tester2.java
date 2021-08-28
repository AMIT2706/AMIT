package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
         driver.manage().window().maximize();
   
	    driver.get("https://www.flipkart.com/");
	    
	     String expectedAlternateTextImage="Flipkart";
 String actualAlternateTextImage=driver.findElement(By.cssSelector("img[alt='Flipkart']")).getAttribute("alt");
 
	    		                                                                                                              
	     
	 	System.out.println("expectedAlternateTextImage="+expectedAlternateTextImage);
	 	System.out.println("actualAlternateTextImage="+actualAlternateTextImage);
	 	
		
		if (actualAlternateTextImage.equals(expectedAlternateTextImage)) {
	     System.out.println("PASS:: Image Text is Correct.");
		}
		else {
		  System.out.println("FAIL::Image Text is InCorrect.");		
            }
	    
	}

}
