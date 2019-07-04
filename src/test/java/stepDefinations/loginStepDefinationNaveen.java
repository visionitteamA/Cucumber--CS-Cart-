package stepDefinations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.bddCucumber.PO_Pages.Po_loginPage;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
//import bddcucumber.managers.WebDriverManagerSingleton;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import testBaseManger.TestBaseSinglton;


public class loginStepDefinationNaveen{

	WebDriver driver;
	TestBaseSinglton brwrMngr;
	Scenario scn;
	//Po_loginPage loginPage;

	Po_loginPage loginPage=PageFactory.initElements(driver, Po_loginPage.class);

	@Before
	public void setup(Scenario s){
		//loginPage=PageFactory.initElements(driver, Po_loginPage.class);
		this.scn=s;
	}

	@Given("As a user when I launch application in \"(.*)\"$")
	public void as_a_user_launch_application(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "E:\\Selenium_jar\\chrome 74\\chromedriver.exe");
			//driver = new ChromeDriver();
			//browserManager= WebDriverManagerSingleton.getInstanceOfWebDriverManager();
			//driver = browserManager.getDriver();
			brwrMngr=TestBaseSinglton.getInstanceOfTestBaseSinglton();
			driver=brwrMngr.launchBrwsr();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\_AkashStuff\\Automation\\dependencies\\gecko\\geckodriver.exe");
			driver =  new FirefoxDriver();
		}
	}

	@Given("navigate to \"(.*)\"$")
	public void navigate_to_url(String u){
		driver.get(u);

	}

	@When("^I click on my Account link at the top right$")
	public void i_click_on_my_Account_link_at_the_top_right(){
		loginPage=PageFactory.initElements(driver, Po_loginPage.class);
		loginPage.click_on_MyAccnt();
		//new Po_loginPage().click_on_MyAccnt();

	}

	@When("^clicked on sign in button$")
	public void clicked_on_sign_in_button(){
		loginPage.click_on_signinbtn();
	}

	@Then("^sign in pop up is displayed$")
	public void sign_in_pop_up_is_displayed(){

	}

	@Then("^\"(.*)\" and \"(.*)\" already entered$")
	public void username_and_password_already_entered(String uname,String paswrd){
		loginPage.enter_uname_pass(uname, paswrd);

	}

	@When("^I click on sign in button$")
	public void i_click_on_sign_in_button() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I am logged in to the application$")
	public void i_am_logged_in_to_the_application(){
		loginPage=PageFactory.initElements(driver, Po_loginPage.class);
		String expectedMsg = loginPage.verify_message();
		System.out.println(expectedMsg);
		String actualmsg=" Notice You have been successfully logged in.";
		Assert.assertEquals(expectedMsg,expectedMsg);
	}



	/*@Given("^As a user i will launch {string}$")
	public void as_usr_on_launch_brwsr(String brsr){
		if(brsr.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_jar\\chrome 74\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://classic.crmpro.com/index.html");
		}


	}*/


	/*@When("^title of the page is free crm$")
	public void title_of_the_page_is_free_crm(){
	   String title= driver.getTitle();
	   System.out.println("title is "+title);
	   Assert.assertEquals("Shopping Cart Software & Ecommerce Software Solutions by CS-Cart", title);
	}

	@Then("^user enters uname and password$")
	public void user_enters_uname_and_password(){
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page(){
	    // Write code here that turns the phrase above into concrete actions

	}
	 */

}
