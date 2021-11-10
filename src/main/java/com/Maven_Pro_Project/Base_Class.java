package com.Maven_Pro_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");

			driver = new FirefoxDriver();

		}
		return driver;

	}

	public static void getUrl(String Url) {
		driver.get(Url);

	}

	public static void navigateTo(String Url) {
		driver.navigate().to(Url);

	}

	public static void navigateBack() {
		driver.navigate().back();

	}

	public static void navigateForword() {
		driver.navigate().forward();

	}

	public static void refresh() {
		driver.navigate().refresh();

	}

	public static void frameIn(int index) {
		driver.switchTo().frame(index);
	}

	public static void frameOperation(String frameType, String id, String index) {
		driver.switchTo().defaultContent();
	}

	public static void sendKeys(WebElement element, String Value) {
		element.sendKeys(Value);

	}

	public static void clickonElement(WebElement element) {
		element.click();

	}

	public static void clearElement(WebElement element) {
		element.clear();

	}

	public static void dropDown(String type, WebElement element, String value) {
		Select s = new Select(element);

		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);

		}

		else if (type.equalsIgnoreCase("byVisibleText")) {

			s.selectByVisibleText(value);

		}

		else if (type.equalsIgnoreCase("byIndex")) {

			int data = Integer.parseInt(value);

			s.selectByIndex(data);

		}
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void actionClass(String actionName, WebElement Element) {
		try {
			Actions act = new Actions(driver);
			if (actionName.equalsIgnoreCase("moveto")) {
				act.moveToElement(Element).build().perform();
			} else if (actionName.equalsIgnoreCase("clickon")) {
				act.click(Element).build().perform();
			} else if (actionName.equalsIgnoreCase("doubleClick")) {
				act.contextClick(Element).build().perform();
			} else if (actionName.equalsIgnoreCase("click")) {
				act.click(Element).build().perform();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollUpandDown(WebElement element) {

		try {
			JavascriptExecutor jS = (JavascriptExecutor) driver;
			jS.executeScript("arguments[0].scrollIntoView();", element);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void implicitWait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}

	public static void explicitWait(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void fluentWait(int timeoutseconds, int pollingseconds, TimeUnit format) {
		Wait wait = new FluentWait(driver).withTimeout(30, format).pollingEvery(null);
	}

	public static void threadSleep(int a) throws InterruptedException {
		Thread.sleep(a);
	}

	public static void ScreanShot(String path) throws IOException {
		TakesScreenshot tS = (TakesScreenshot) driver;
		File srcFile = tS.getScreenshotAs(OutputType.FILE);
		File destFile = new File(path);
		FileUtils.copyFile(srcFile, destFile);
	}

	public static void closeWindows() {
		driver.close();

	}

	public static void quitWindows() {
		driver.quit();

	}

}
