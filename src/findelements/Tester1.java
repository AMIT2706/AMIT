package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		   
	       driver.manage().window().maximize();

	    driver.get("https://www.udemy.com/");
	    
		driver.findElement(By.name("q")).sendKeys("Artificial Intelligence");
		
		 Thread.sleep(5000);
		 
		 List<WebElement>autoSuggestionsList=driver.findElements(By.xpath("//a[contains@id,'search-from-autocomplete')]"));
		 
		 String expectedSuggestionText=""
		 
		 
		 
		 
		 
		 