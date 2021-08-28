package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {

	public static void main(String[] args) {
		
   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         
          driver.manage().window().maximize();
    
	    driver.get("https://demo.actitime.com/login.do");
	    
	     String expectedToolTipText="Do not select if this computer is shared";
	     String actualToolTipText=driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
	     
	 	System.out.println("expectedToolTipText="+expectedToolTipText);
	 	System.out.println("actualToolTipText="+actualToolTipText);
	 	
		
		if (actualToolTipText.equals(expectedToolTipText)) {
	     System.out.println("PASS:: Tool Tip Text  is Correct.");
		}
		else {
		  System.out.println("FAIL:: Tool Tip Text is InCorrect.");		
             }
	    }
    }

