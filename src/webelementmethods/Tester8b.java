package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

         public class Tester8b {
        	 
    	 public static void main(String[] args) throws InterruptedException{
    		 
    	 
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
   
driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

WebElement usernameTextField =driver.findElement(By.id("txtUsername"));
       usernameTextField.clear();
       usernameTextField.sendKeys("Admin");
       
WebElement passwordTextField =driver.findElement(By.id("txtPassword"));
       passwordTextField.clear();
       passwordTextField.sendKeys("admin123");
       
      Thread.sleep(2000);
    
     driver.findElement(By.id("btnLogin")).click();
     
     Thread.sleep(3000);
     
     driver.quit();
       
     }
    	 
     }
     
