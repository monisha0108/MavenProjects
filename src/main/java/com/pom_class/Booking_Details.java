package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Details {
	
	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id = "datepick_in")
	private WebElement checkIn;
	
	@FindBy(id = "datepick_out")
	private WebElement checkOut;
	
	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id = "child_room")
	private WebElement childsPerRoom;
	
	@FindBy(id = "Submit")
	private WebElement SearchBtn;
	
	public Booking_Details(WebDriver drivers) {
		
		this.driver=drivers;
		PageFactory.initElements(driver, this);
		
	}



	public WebElement getLocation() {
		return location;
	}



	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getHotel() {
		return hotel;
	}



	public WebElement getRoomType() {
		return roomType;
	}



	public WebElement getNoOfRooms() {
		return noOfRooms;
	}



	public WebElement getCheckIn() {
		return checkIn;
	}



	public WebElement getCheckOut() {
		return checkOut;
	}



	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}



	public WebElement getChildsPerRoom() {
		return childsPerRoom;
	}



	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	

}
