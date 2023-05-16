import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Y://chromedriver_win32 (1)//chromedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.flipkart.com");
	
	}

}
