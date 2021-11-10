package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Conformation {
	
		
		public WebDriver driver;
		
		
		@FindBy(id = "my_itinerary")
		private WebElement bookList;
		
		@FindBy(id = "logout")
		private WebElement logout;
		
		
		
		public Booking_Conformation(WebDriver drivers) {
			
			this.driver=drivers;
			PageFactory.initElements(driver, this);
			
		}



		public WebDriver getDriver() {
			return driver;
		}



		public WebElement getBookList() {
			return bookList;
		}



		public WebElement getLogout() {
			return logout;
		}

}
