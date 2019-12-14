package FinalObject.SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MainTest {
	
	static WebDriver driver;
	
	@Test(priority=0)
		
	/*public static void CallingDrivers(String BrowserName) {
		if(BrowserName=="InternetExplorer") {
			System.setProperty("webdriver.ie.driver", "E:\\Java\\IEDriverServer_x64_3.14.0 (1)\\IEDriverServer.exe");
			
			 driver=new InternetExplorerDriver();
			
		}*/
   public static void CallingChrome() {
		System.setProperty("webdriver.chrome.driver","E://Java//chromedriver_win32 (1)//chromedriver.exe");
		
		 driver=new ChromeDriver();
		
	}
			
	
   
	
	
	@Test(priority=1)
		public static void OpenWebSite () {
			
		driver.navigate().to("https://www.spicejet.com/");
		
		
	}

}
