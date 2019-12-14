package FinalObject.SpiceJet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValdatingHomePageBar extends Base {

	
	@Test()
	public static  void Homep1() {
		// TODO Auto-generated method stub
		
		driver= CallingChrome();
driver.navigate().to("https://www.spicejet.com/");
		

		
		System.out.println(driver.findElement(By.xpath("//a[text()='Book']")).getText());	
	}

	
	
	
}
