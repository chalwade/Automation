import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Y://chromedriver_win32 (1)//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/elements");
driver.findElement(By.xpath("//*[@class=\"header-text\"]"));
driver.findElement(By.xpath("//*[@class=\"text\"]")).click();
driver.findElement(By.xpath("//*[@placeholder=\"Full Name\"]")).sendKeys("sam kore");
driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("sam123@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("marul naka mumbai");
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollTo(0,400)");
driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("marulnaka");
driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
driver.findElement(By.xpath("//*[@class=\"rct-checkbox\"]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"item-2\"]/span")).click();
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]")).click();
driver.findElement(By.xpath("//*[@id=\"item-3\"]")).click();
driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("tom");
driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("lee");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("tom123@gmail.com");
driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("24");
driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("65000");
driver.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("finance");
driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();
driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
Actions act = new Actions (driver);
act.doubleClick().perform();
JavascriptExecutor scroll = (JavascriptExecutor)driver;
scroll.executeScript("window.scrollTo(0,200)");
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-md-3')]/div[contains(@class,'left-pannel')]/div[contains(@class,'accordion')]/div[3]/span[1]/div[1]/div[1]"));
driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']")).click();
driver.close();




	}

}
