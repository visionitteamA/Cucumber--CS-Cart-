package com.bddCucumber.PO_Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBaseManger.TestBaseMain;

public class Po_loginPage{
	
	
	WebDriver driver;
	//or
	@FindBy(xpath="//div[@id='sw_dropdown_4']")
	WebElement myAccnt_link;
	
	@FindBy(xpath="//div[@class='ty-account-info__buttons buttons-container']/a[text()='Sign in']")
	WebElement signInLink;
	
	@FindBy(id="login_popup4")
	WebElement email;
	
	@FindBy(id="psw_popup4")
	WebElement pass;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement singInbtn;
	
	@FindBy(xpath="//div[@class='cm-notification-container notification-container']")
	WebElement notification;
	
	
	
	public Po_loginPage(WebDriver d) {
		
	driver=d;
		//PageFactory.initElements(driver,this);
	}
	
	
	
	public void click_on_MyAccnt(){
		myAccnt_link.click();
	}
	
	public void click_on_signinbtn(){
		signInLink.click();
	}

	public void enter_uname_pass(String u,String p){
		
		email.clear();
		email.sendKeys(u);
		
		pass.clear();
		pass.sendKeys(p);
		
		singInbtn.click();
	}
	
	public String verify_message(){
		String msg = notification.getText();
		
		return msg;
		
	}

}
