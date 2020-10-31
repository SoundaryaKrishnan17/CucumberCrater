package com.crater.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class AddcustomerPage {
	static WebDriver driver;
	@Given("User launch crater site")
	public void user_launch_crater_site() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\Cucumbercrater\\src\\dri\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://demo.craterapp.com/");
	}
	@Given("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("admin@craterapp.com");
		driver.findElement(By.id("password")).sendKeys("crater@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	    
	}

}
