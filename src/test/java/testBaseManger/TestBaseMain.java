package testBaseManger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseMain {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrwsr(String browser){
	
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_jar\\chrome 74\\chromedriver.exe");
		if (driver==null) {
			driver = new ChromeDriver();
		}else {
			return driver;
		}
		
	}else if (browser.equalsIgnoreCase("firefox")) {
		//yet to be written
	}
	return driver;
	
}

}
