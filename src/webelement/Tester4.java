package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 {

	  public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      
	             WebDriver driver=new ChromeDriver();
	             driver.manage().window().maximize();
	           driver.get("https://demo.actitime.com/login.do");
	            
		     WebElement loginCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		  
		              if (!loginCheckBox.isSelected()) {
			  
		                     System.out.println("PASS::Login Checkbox is not selected");
		
		                          Thread.sleep(5000);
                      } else {
            	
		                     System.out.println("FAIL::Login Checkbox is selected");
                              }
		                      loginCheckBox.click();
			                     Thread.sleep(5000);
			 
			          if (loginCheckBox.isSelected()) {
			        	   
				             System.out.println ("PASS::Login Checkbox is selected");
					
			           } else {
			        	   
					         System.out.println("FAIL::Login Checkbox is not  selected");
					          }
			           }
	               }

