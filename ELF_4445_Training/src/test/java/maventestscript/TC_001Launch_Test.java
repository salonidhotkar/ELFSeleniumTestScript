package maventestscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001Launch_Test {
	
	@Test	
	public void Browserlaunch01() {
		
		//System.setProperty("webdriver chrome driver","./driver/chromrdriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/india");
		
		
		
		
		
	}

}
