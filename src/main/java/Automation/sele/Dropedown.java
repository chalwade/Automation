package Automation.sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropedown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://vitthal//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
		driver.findElement(By.xpath("//*[@id='benzcheck']")).click();
        driver.findElement(By.xpath("//*[@id=\"carselect\"]")).click();
        driver.findElement(By.xpath("//*[@value=\"orange\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"autosuggest\"]")).sendKeys("welcome");
        Thread.sleep(2000);
      WebElement enable=  driver.findElement(By.xpath("//*[@id=\"enabled-example-input\"]"));
      if(enable.isEnabled()) {
    	  System.out.println("Webelement is enable");
      }
      else {
    	  System.out.println("Webelement not enable");
      }
      WebElement dis = driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]"));
      if(dis.isDisplayed()) {
    	  System.out.println("hidden element show");
      }
      else {
    	  System.out.println("hidden element hide");
      
      }
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
     Alert alt = driver.switchTo().alert();
     alt.accept();
  WebElement element=   driver.findElement(By.xpath("//button[@id=\"mousehover\"]"));
     Actions actions = new Actions(driver);
     actions.moveToElement(element).perform();
     driver.findElement(By.xpath("//*[@href=\"#top\"]")).click();


}}