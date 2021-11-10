package com.Maven_Pro_Project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import com.pom_class.Booking_Conformation;
import com.pom_class.Booking_Details;
import com.pom_class.Confirm_Details;
import com.pom_class.Home_Page;
import com.pom_class.Payment_Details;

public class Adactin_Practice_pom extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");

	public static Home_Page Hp = new Home_Page(driver);

	public static Booking_Details Bd = new Booking_Details(driver);

	public static Confirm_Details Cd = new Confirm_Details(driver);

	public static Payment_Details Pd = new Payment_Details(driver);

	public static Booking_Conformation Bc = new Booking_Conformation(driver);

	public static void main(String[] args) throws InterruptedException {

		getUrl("https://adactinhotelapp.com/");

		implicitWait(30, TimeUnit.SECONDS);

		sendKeys(Hp.getUsername(), "Moneesha");

		sendKeys(Hp.getPassword(), "sharwin26");

		clickonElement(Hp.getLogin());

		dropDown("byVisibleText", Bd.getLocation(), "Paris");

		dropDown("byVisibleText", Bd.getHotel(), "Hotel Creek");

		dropDown("byIndex", Bd.getRoomType(), "1");

		dropDown("byIndex", Bd.getNoOfRooms(), "2");

		clearElement(Bd.getCheckIn());

		sendKeys(Bd.getCheckIn(), "02/11/2021");

		clearElement(Bd.getCheckOut());

		sendKeys(Bd.getCheckOut(), "03/11/2021");

		dropDown("byIndex", Bd.getAdultsPerRoom(), "2");

		dropDown("byIndex", Bd.getChildsPerRoom(), "1");

		clickonElement(Bd.getSearchBtn());

		clickonElement(Cd.getRadioBtn());

		clickonElement(Cd.getContinuBtn());

		sendKeys(Pd.getFirstName(), "Moneesha");

		sendKeys(Pd.getLastName(), "Ramesh");

		sendKeys(Pd.getBilling(), "12, Balaji Nagar, chennai‐600099");

		sendKeys(Pd.getCardNumber(), "9876543210225522");

		dropDown("byIndex", Pd.getCardType(), "2");

		dropDown("byVisibleText", Pd.getCardExpairy(), "February");

		dropDown("byVisibleText", Pd.getCardExYear(), "2020");

		sendKeys(Pd.getCvv(), "0000");

		clickonElement(Pd.getBook_now());
		
		threadSleep(5000);
		
		clickonElement(Bc.getBookList());
		
		clickonElement(Bc.getLogout());
		
		quitWindows();



	}

}
