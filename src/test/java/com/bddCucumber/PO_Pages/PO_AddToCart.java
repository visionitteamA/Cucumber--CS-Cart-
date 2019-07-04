package com.bddCucumber.PO_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class PO_AddToCart {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='ty-sort-container__views-a cm-ajax ']/i[@class='ty-icon-short-list']")
	WebElement view_list_btn;
	
	@FindBy(xpath="//div[@class='ty-compact-list']")
	WebElement list_Display;
	
	
	
	@FindBy(xpath="//button[@id='button_cart_217']")
	WebElement add_to_cartBtn;
	
	@FindBy(xpath="//div[@id='sw_dropdown_8']//span//span[@class='ty-block']")
	WebElement mycartbtn;
	
	/*@FindBy(xpath="//div[@class='ty-compact-list']")
	WebElement list_Display;*/
	
	public PO_AddToCart(WebDriver d){
		driver=d;
	}
	
	
	public void Click_on_ViewList(){
		view_list_btn.click();
	}
	
	public boolean is_list_displaying(){
		boolean flag = list_Display.isDisplayed();
		return flag;
	}
	
	public void product_to_add(String c) throws InterruptedException{
		//WebElement product_code = driver.findElement(By.xpath("//span[text()='"+c+"']"));
		
		List<WebElement> pro = driver.findElements(By.xpath("//div[@class='ty-compact-list']//div[@class='ty-compact-list__item']"));
		System.out.println(pro.size());
		
		for(int i=0;i<7;i++){
			String code = pro.get(i).getText();
			Thread.sleep(2000);
			if(code.contains(c)){
				driver.findElement(By.xpath("//div[@class='ty-compact-list__content']//button["+i+1+"]")).submit();
				Thread.sleep(2000);
				System.out.println(code);
				break;
			}
		}
		//driver.findElement(By.xpath("//div[@class='ty-compact-list__content']//button[1]")).submit();
		//add_to_cartBtn.click();
	}
	
	public String click_my_cart(){
		String item = mycartbtn.getText();
		System.out.println(item);
	char value = item.charAt(0);
	int v=(int) value;

		return item;
		//Wait wait=new FluentWait<WebDriver>(driver)
				
	}


}
