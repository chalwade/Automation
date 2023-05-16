package Automation.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class login {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C://vitthal//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://practice.automationtesting.in/");
driver.findElement(By.xpath("//*[@id=\"menu-item-251\"]/a")).click();
driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("sagar");
driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("more");
driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("sakina");
driver.findElement(By.xpath("//*[@type='email']")).sendKeys("rahul@gmail.com");
driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8888566533");
Thread.sleep(3000);
WebElement ele = driver.findElement(By.xpath("//input[@type='radio']"));
ele.isSelected();
ele.click();
 WebElement check= driver.findElement(By.xpath("//input[@type='checkbox']"));
 check.isSelected();
check.click(); 
driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a"));
driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
 WebElement drope = driver.findElement(By.xpath("//*[@id='Skills']"));
  Select drope1 = new Select(drope);
   drope1.selectByIndex(3);
   driver.findElement(By.xpath("//*[@id='countries']")).click();
  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
  WebElement subdropdown = driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[2]"));
  subdropdown.click();
  WebElement ss=driver.findElement(By.xpath("//*[@placeholder=\"Year\"]"));
  Select se = new Select(ss);
  se.selectByIndex(1);
  WebElement month = driver.findElement(By.xpath("//*[@placeholder=\"Month\"]"));
  Select mm= new Select(month);
  mm.selectByIndex(3);
  WebElement day = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
  Select date = new Select (day);
  date.selectByIndex(5);
  driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("abc123");
  driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("abc123");
  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
 
  


}}

