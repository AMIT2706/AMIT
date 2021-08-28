package webdrivermethods2;


import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	              
		     Point currentPoint = driver.manage().window().getPosition();
		     
		     int startX=currentPoint.getX();
		     int startY=currentPoint.getY();
		     
		     System.out.println("startX "+startX);
		     System.out.println("startY "+startY);
		     
		       driver.quit();
	}

}
