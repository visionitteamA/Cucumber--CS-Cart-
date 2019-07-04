package testBaseManger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseSinglton {
	
	private WebDriver driver;
	private static TestBaseSinglton instanceOfSingltonClass=null;
	
	private TestBaseSinglton(){
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_jar\\chrome 74\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	public static TestBaseSinglton getInstanceOfTestBaseSinglton(){
		
		if(instanceOfSingltonClass==null){
			instanceOfSingltonClass=new TestBaseSinglton();
		}
		return instanceOfSingltonClass;
	}
	
	public  WebDriver launchBrwsr() {
		if (driver==null) {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium_jar\\chrome 74\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}

}
