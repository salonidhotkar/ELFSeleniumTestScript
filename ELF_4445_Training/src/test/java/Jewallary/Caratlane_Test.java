package Jewallary;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Caratlane_Test {
	
	@Test(groups={"regression","integration"})
	public void caratlane()
	{

		//System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.caratlane.com/");
		 
	}

}
