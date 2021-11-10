package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Details {
	
	public WebDriver driver;
	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy(id = "continue")
	private WebElement continuBtn;
	
	public Confirm_Details(WebDriver drivers) {
		
		this.driver=drivers;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getRadioBtn() {
		return radioBtn;
	}



	public WebElement getContinuBtn() {
		return continuBtn;
	}

}
