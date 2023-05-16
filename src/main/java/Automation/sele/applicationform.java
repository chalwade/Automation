package Automation.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class applicationform {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C://vitthal//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.jotform.com/build/231232475705452");
	driver.findElement(By.xpath("//*[@name=\"q3_studentName[first]\"]")).sendKeys("raj");
	driver.findElement(By.xpath("//*[@id=\"last_3\"]")).sendKeys("ddd");
    WebElement month =	driver.findElement(By.xpath("//*[@id=\"input_4_month\"]"));
	Select ss = new Select(month);
	ss.selectByIndex(3);
	Thread.sleep(2000);
	WebElement date = driver.findElement(By.xpath("//*[@id=\"input_4_day\"]"));
	Select da = new Select(date);
	da.selectByIndex(7);
	WebElement year = driver.findElement(By.xpath("//*[@id=\"input_4_year\"]"));
	Select ye = new Select(year);
	ye.selectByIndex(7);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@name=\"q5_grade\"]")).sendKeys("A+");
driver.findElement(By.xpath("//*[@id=\"first_6\"]")).sendKeys("dd");
driver.findElement(By.xpath("//*[@id=\"last_6\"]")).sendKeys("sa");
driver.findElement(By.xpath("//*[@id=\"first_7\"]")).sendKeys("fat");
driver.findElement(By.xpath("//*[@id=\"last_7\"]")).sendKeys("fh");
driver.findElement(By.xpath("//*[@name=\"q8_homePhone[area]\"]")).sendKeys("91");
driver.findElement(By.xpath("//*[@id=\"input_8_phone\"]")).sendKeys("8888883333");
driver.findElement(By.xpath("//*[@id=\"input_9_area\"]")).sendKeys("91");
driver.findElement(By.xpath("//*[@id=\"input_9_phone\"]")).sendKeys("88885555533");
driver.findElement(By.xpath("//*[@id=\"input_10_area\"]")).sendKeys("91");
driver.findElement(By.xpath("//*[@id=\"input_10_phone\"]")).sendKeys("8888333355");
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollTo(0,400)");
driver.findElement(By.xpath("//*[@id=\"input_11_addr_line1\"]")).sendKeys("sakinaka");
 driver.findElement(By.xpath("//*[@id=\"input_11_addr_line2\"]")).sendKeys("sakina");
 driver.findElement(By.xpath("//*[@id=\"input_11_city\"]")).sendKeys("mumbai");
 driver.findElement(By.xpath("//*[@id=\"input_11_state\"]")).sendKeys("maharashtra");
 driver.findElement(By.xpath("//*[@id=\"input_11_postal\"]")).sendKeys("411123");
WebElement count= driver.findElement(By.xpath("//*[@class=\"form-dropdown form-address-country\"]"));
 Select dp = new Select(count);
 dp.selectByVisibleText("India");
 driver.findElement(By.xpath("//*[@value=\"Reading\"]"));
 driver.findElement(By.xpath("//*[@name=\"q16_lastYear\"]")).sendKeys("300");
 driver.findElement(By.xpath("//*[@id=\"input_17\"]")).sendKeys("65");
 driver.findElement(By.xpath("//*[@id=\"input_18\"]")).sendKeys("500");
 driver.findElement(By.xpath("//*[@id=\"input_20\"]")).sendKeys("tested ok");
 driver.findElement(By.xpath("//*[@id=\"input_21\"]")).sendKeys("tested done");
 JavascriptExecutor js1 = (JavascriptExecutor)driver;
 js1.executeScript("window.scrollTo(0,600)");
WebElement cal= driver.findElement(By.xpath("//*[@name=\"q25_hearing[month]\"]"));
Select ca = new Select(cal);
ca.selectByIndex(3);
WebElement d = driver.findElement(By.xpath("//*[@id=\"input_25_day\"]"));
Select dates = new Select(d);
dates.selectByIndex(8);
WebElement yy = driver.findElement(By.xpath("//*[@id=\"input_25_year\"]"));
Select years = new Select (yy);
years.selectByIndex(3);
driver.findElement(By.xpath("//*[@name=\"q29_results29\"]")).sendKeys("Pass");
driver.findElement(By.xpath("//*[@class=\"form-radio-item\"]")).click();
driver.findElement(By.xpath("//*[@id=\"input_24\"]")).sendKeys("document");
driver.findElement(By.xpath("//*[@name=\"q32_numberOf\"]")).sendKeys("15");
driver.findElement(By.xpath("//*[@id=\"input_33\"]")).sendKeys("144");
driver.findElement(By.xpath("//*[@id=\"input_34\"]")).sendKeys("175");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"input_35\"]")).sendKeys("185");
driver.findElement(By.xpath("//*[@size=\"3\"]"));
driver.findElement(By.xpath("//input[@id=\"input_36\"]")).sendKeys("2023");
driver.findElement(By.xpath("//input[@id=\"input_40\"]")).sendKeys("A");
driver.findElement(By.xpath("//input[@id=\"input_41\"]")).sendKeys("yes");
driver.findElement(By.xpath("//input[@id=\"input_42\"]")).sendKeys("yes");
driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();











 
 
 


	
	
	
	
}
}
