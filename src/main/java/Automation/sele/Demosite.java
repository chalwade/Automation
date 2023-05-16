package Automation.sele;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demosite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://vitthal//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demoqa.com/automation-practice-form");
	    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("charan");
	    driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("dube");
	    driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("charan123@gmail.com");
	    driver.findElement(By.xpath("//*[@ for=\"gender-radio-1\"]")).click();
	    driver.findElement(By.xpath("//*[@placeholder=\"Mobile Number\"]")).sendKeys("9743465432");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[7]")).click();
	 //driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div")).sendKeys("math");
	    JavascriptExecutor java = (JavascriptExecutor)driver;
	    java.executeScript("window.scrollTo(0,300)");
	    
	    driver.findElement(By.xpath("//*[@for=\"hobbies-checkbox-3\"]")).click();
	//    driver.findElement(By.xpath("//*[@type=\"file\"]")).click();
	  driver.findElement(By.xpath("//*[@placeholder=\"Current Address\"]")) .sendKeys("sakinaka");
	  }}
	 