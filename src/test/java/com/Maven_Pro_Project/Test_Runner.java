package com.Maven_Pro_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Runner extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\user\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();

		driver = getBrowser("chrome");

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(5000);

		WebElement username = driver.findElement(By.id("username"));
		sendKeys(username, "Moneesha");

		WebElement password = driver.findElement(By.id("password"));
		sendKeys(password, "sharwin26");
		Thread.sleep(1000);

		WebElement login = driver.findElement(By.className("login_button"));
		clickonElement(login);

		Thread.sleep(3000);

		WebElement location = driver.findElement(By.id("location"));
		clickonElement(location);
		dropDown("byVisibleText", location, "Paris");

		WebElement hotel = driver.findElement(By.id("hotels"));
		dropDown("byVisibleText",hotel, "Hotel Creek");

		WebElement roomType = driver.findElement(By.id("room_type"));
		dropDown("byIndex",roomType, "1");

		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		dropDown("byIndex",noOfRooms, "2");

		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		clearElement(checkIn);
		checkIn.sendKeys("02/11/2021");

		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		clearElement(checkOut);
		checkOut.sendKeys("03/11/2021");

		WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
		dropDown("byIndex",adultsPerRoom, "2");

		WebElement childsPerRoom = driver.findElement(By.id("child_room"));
		dropDown("byIndex",childsPerRoom, "1");

		WebElement SearchBtn = driver.findElement(By.id("Submit"));
		clickonElement(SearchBtn);

		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		clickonElement(radioBtn);

		WebElement continuBtn = driver.findElement(By.id("continue"));
		clickonElement(continuBtn);

		WebElement firstName = driver.findElement(By.id("first_name"));
		sendKeys(firstName, "Moneesha");

		WebElement lastName = driver.findElement(By.id("last_name"));
		sendKeys(lastName, "Ramesh");

		WebElement Billing = driver.findElement(By.id("address"));
		sendKeys(Billing, "12, Balaji Nagar, chennai‐600099");

		WebElement cardNumber = driver.findElement(By.id("cc_num"));
		sendKeys(cardNumber, "9876543210225522");

		WebElement cardType = driver.findElement(By.id("cc_type"));
		dropDown("byIndex",cardType, "2");

		WebElement cardExpairy = driver.findElement(By.id("cc_exp_month"));
		dropDown("byVisibleText",cardExpairy, "February");

		WebElement cardExYear = driver.findElement(By.id("cc_exp_year"));
		dropDown("byVisibleText",cardExYear, "2020");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		sendKeys(cvv, "0000");

		WebElement book_now = driver.findElement(By.id("book_now"));
		clickonElement(book_now);
		Thread.sleep(10000);
		//scrollDown("windows.scrollBy(0, -700)");

		WebElement bookList = driver.findElement(By.id("my_itinerary"));
		clickonElement(bookList);
		Thread.sleep(3000);

		WebElement logout = driver.findElement(By.id("logout"));
		clickonElement(logout);

		driver.close();

	}

}
