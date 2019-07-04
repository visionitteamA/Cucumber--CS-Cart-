package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bddCucumber.PO_Pages.PO_AddToCart;
import com.bddCucumber.PO_Pages.Po_SearchProduct;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import testBaseManger.TestBaseSinglton;

public class AddtoCart_StepDefination {
	
	/*WebDriverManagerSingleton browserManager = WebDriverManagerSingleton.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	PO_Header PO_Header = PageFactory.initElements(driver, PO_Header.class);
	PO_Search PO_Search = PageFactory.initElements(driver, PO_Search.class);
	*/

	Scenario scn ;
	
	TestBaseSinglton brwsrMngr=TestBaseSinglton.getInstanceOfTestBaseSinglton();
	WebDriver driver=brwsrMngr.launchBrwsr();
	
	Po_SearchProduct searchProduct = PageFactory.initElements(driver, Po_SearchProduct.class);
	PO_AddToCart addToCart=PageFactory.initElements(driver, PO_AddToCart.class);
	
	@Before()
	public void setup(Scenario s){
		this.scn=s;
	}

	@When("^i Enter \"(.*)\" in top search box$")
	public void i_Enter_in_top_search_box(String arg1){
		Po_SearchProduct searchProduct = PageFactory.initElements(driver, Po_SearchProduct.class);
		searchProduct.enter_into_searchBox(arg1);
		scn.write("Product name is entered in search box"+arg1);
	}

	@When("^I click on search button$")
	public void i_click_on_search_button(){
		searchProduct.click_btn();
		scn.write("I clicked on search button ");
	}

	@Then("^Page navigates to product search result$")
	public void page_navigates_to_product_search_result() {
		String expectedTitle = searchProduct.getTitleOfsearch();
		Assert.assertEquals("Search results",expectedTitle );
		scn.write("validation of the title ");
	}
	
	@Then("^Product results are Displayed$")
	public void product_results_are_Displayed(){
		boolean result_display = searchProduct.displayingProduct();
		Assert.assertTrue(result_display);
		scn.write("verified products are displaying");
		
	}

	@When("^i click on list view button$")
	public void i_click_on_list_view_button(){
		addToCart.Click_on_ViewList();
		scn.write("I clicked on list view button");
	}

	@Then("^Products are displayed in list view$")
	public void products_are_displayed_in_list_view(){
		 boolean status = addToCart.is_list_displaying();
		Assert.assertTrue(status);
	}

	@When("^I click add to cart for product code \"(.*)\"$")
	public void i_click_add_to_cart_for_product_code(String cd) throws InterruptedException{
		addToCart.product_to_add(cd);
		scn.write("i clicked on add to cart btn where product code is "+cd);
	}

	@Then("^my cart is updated with product quantity as (\\d+) and correct total price$")
	public void my_cart_is_updated_with_product_quantity_as_and_correct_total_price(int arg1){
		 String Actualquantity = addToCart.click_my_cart();
		Assert.assertEquals("1 item(s) for $610.99", Actualquantity);
		
	}

	
	@Then("^Product results are (\\d+)$")
	public void product_results_are(int arg1){


	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
	}
	
}