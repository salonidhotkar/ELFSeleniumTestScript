package parameter;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Understandingparameter_Test {
	
	public class Roadster {
		@Test
		
		public void roadster() {
			WebDriver web=null;
			 String url = System.getProperty("url");
			String Browser = System.getProperty("bname");
		if(Browser.equalsIgnoreCase("chrome")) {   
//			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		    web=new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("edge")) {
//			System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		    web=new EdgeDriver();
		}else {
			Reporter.log("Browser",true);
		}
		
		web.manage().window().maximize();
		web.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		web.get(url);
			
			
		}

	}


}
