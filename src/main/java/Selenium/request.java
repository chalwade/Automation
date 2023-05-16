package Selenium;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class request {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","Y://chromedriver_win32 (1)//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://admin-demo.nopcommerce.com/admin/");
driver.findElement(By.xpath("//button[@type= 'submit']")).click();
driver.findElement(By.xpath("//*[@class=\"nav-item\"]")).click();
driver.findElement(By.xpath("//*[@id=\"nopcommerce-common-statistics-card\"]/div[2]/div/div[3]/div/a")).click();
driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("admin123@gmail.com");
driver.findElement(By.xpath("//*[@name=\"SearchFirstName\"]")).sendKeys("admin");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@name=\"SearchLastName\"]")).sendKeys("abc");
 WebElement month =driver.findElement(By.xpath("//*[@id=\"SearchMonthOfBirth\"]"));
Select sel = new Select(month);
sel.selectByIndex(3);
 WebElement date=driver.findElement(By.xpath("//*[@name=\"SearchDayOfBirth\"]"));
 Select dates = new Select(date);
 dates.selectByIndex(5);
driver.findElement(By.xpath("//*[@class=\"k-select\"]")).click();
driver.findElement(By.xpath("//*[@title=\"Tuesday, May 9, 2023\"]")).click();
//driver.findElement(By.xpath("//*[@aria-controls=\"SearchRegistrationDateTo_dateview\"]")).click();
//  driver.findElement(By.xpath("//*[@data-value=\"2023/4/23\"]")).click();
 driver.findElement(By.xpath("//*[@aria-controls=\"SearchLastActivityFrom_dateview\"]")).click();
 driver.findElement(By.xpath("//*[@title=\"Monday, May 1, 2023\"]")).click();
 LocalDate currentDate = LocalDate.now();
 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
 String formattedDate = currentDate.format(formatter);

 // Parsing a date from a string
 String dateString = "13-05-2023";
 LocalDate parsedDate = LocalDate.parse(dateString, formatter);

 
 
 







}
}
