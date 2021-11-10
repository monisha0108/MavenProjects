package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Details {
	
	public WebDriver driver;
	@FindBy(id = "first_name")
	private WebElement firstName;
	
	@FindBy(id = "last_name")
	private WebElement lastName;
	
	@FindBy(id = "address")
	private WebElement Billing;
	
	@FindBy(id = "cc_num")
	private WebElement cardNumber;
	
	@FindBy(id = "cc_type")
	private WebElement cardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement cardExpairy;
	
	@FindBy(id = "cc_exp_year")
	private WebElement cardExYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement book_now;
	
	public Payment_Details(WebDriver drivers) {
		
		this.driver=drivers;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBilling() {
		return Billing;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardExpairy() {
		return cardExpairy;
	}

	public WebElement getCardExYear() {
		return cardExYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}
	
	

}
