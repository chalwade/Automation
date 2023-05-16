package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","Y://chromedriver_win32 (1)//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://httpbin.org/forms/post");
	driver.findElement(By.xpath("//*[@name=\"custname\"]")).sendKeys("abc");
	driver.findElement(By.xpath("//*[@type=\"tel\"]")).sendKeys("7755555445");
	driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("abc123@gmail.com");
	driver.findElement(By.xpath("//*[@type=\"radio\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();
	driver.findElement(By.xpath("/html/body/form/p[4]/label/input")).sendKeys("13:15");
	driver.findElement(By.xpath("//*[@name= 'comments']")).sendKeys("welcome");
	 
	
	
    
	
	
	
	
	
	
	
	
	
}
}
