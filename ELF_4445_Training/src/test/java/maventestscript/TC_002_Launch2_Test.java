package maventestscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002_Launch2_Test {
	
	@Test
	public void Browserlaunch2() {
		
		//System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.foodpanda.com/about-foodpanda/");
		 
	}

}
