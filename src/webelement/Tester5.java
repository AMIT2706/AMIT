package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester5 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      
               WebDriver driver=new ChromeDriver();
               driver.manage().window().maximize();
               driver.get("https://en-gb.facebook.com/");
       
               if(driver.findElement(By.id("email")).isEnabled()) {
               
        	            System.out.println("PASS::Email Address Textfiled is Enabled");
        	                  
                     }else {
                	  
                        System.out.println("FAIL::Email Address Textfiled is Disabled");
                           }
               	    }
                  }
        	   
         
      
String actualRGBAcolor= driver.findElement(By.linkText("Username or Password is invalid. Please try again")).getCssValue("color");