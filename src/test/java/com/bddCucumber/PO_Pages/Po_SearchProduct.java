package com.bddCucumber.PO_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Po_SearchProduct {
	
	//String title="Search results";
	WebDriver driver;
	
	@FindBy(id="search_input")
	WebElement searchBox;
	
	@FindBy(className="ty-icon-search")
	WebElement searchbtn;
	
	@FindBy(id="products_search_11")
	WebElement container_search_products;
	
	
	
	public Po_SearchProduct(WebDriver d) {
		driver=d;
	}
	
	public void enter_into_searchBox(String p){
		searchBox.sendKeys(p);
	}
	
	public void click_btn(){
		searchbtn.click();
	}
	
	public String getTitleOfsearch(){
		String title = driver.getTitle();
		return title;
	}
	public boolean displayingProduct(){
		boolean flag = container_search_products.isDisplayed();
		return flag;
	}
	
}
