package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

  public class Tester3 {
	 
	 public static void main(String[]args){

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	   
       driver.manage().window().maximize();

    driver.get("https://demo.actitime.com/login.do");
    
	 driver.findElement(By.id("username")).sendKeys("amit");
	 driver.findElement(By.name("pwd")).sendKeys("Testing@123");
	 driver.findElement(By.linkText("Login")).click();
	 
	 String expectedHexaCode="#ce0100";
	 
	 driver.findElement(By.linkText("Username or Password is invalid. Please try again")).getCssValue("color");
	
	 
             (actualRGBcolor.isEmpty()){
            	 
        	  
                	   
 	    	 String actualHexaCode=Color.fromString(actualRGBcolor).asHex();
 	    	 
 	    	 
 	    	System.out.println("expectedHexaCode="+expectedHexaCode);
 	    	System.out.println("actualHexaCode="+actualHexaCode);
 	    	 
	              if (actualHexaCode.equals(expectedHexaCode)) {
	            	  
                           System.out.println("PASS:: Color is Correct.");
                           
                          
	              }else{
                           		
	                       System.out.println("FAIL::  Color is InCorrect.");	
                           	
 	                     }else {
 	               
	            	  System.out.println("FAIL:: Css Property is InCorrect.");	
	            	  
                 	       }
 	                     }
                          }
  
                             
                          
                              
                              
                           
	 
    