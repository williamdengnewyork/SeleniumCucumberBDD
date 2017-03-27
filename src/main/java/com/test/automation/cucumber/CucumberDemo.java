package com.test.automation.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

/**
 * Hello world!
 *
 */
public class CucumberDemo {

	WebDriver driver = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "c:\\temp\\IEDriverServer.exe");
		System.setProperty("webdriver.gecko.driver", "c:\\temp\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\temp\\chromedriver.exe");
		
//		WebDriver driver = new FirefoxDriver();  //geckodriver
		WebDriver driver = new InternetExplorerDriver();
		
		CucumberDemo app = new CucumberDemo();
		System.out.println("1");
		app.goToFacebook();
		System.out.println("2");
		app.I_enter_Username_as_and_Password_as("williamdeng@yahoo.com", "12345678");
		System.out.println("3");
		app.validateRelogin();
		System.out.println("end");
	}


	public void goToFacebook() {
		// driver.navigate().to("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
	}

	@When(value = "^user logs in using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
		//driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
		driver.findElement(By.id("u_0_v")).click();
	}

	@Then(value = "^login should be unsuccessful$")
	public void validateRelogin() {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
