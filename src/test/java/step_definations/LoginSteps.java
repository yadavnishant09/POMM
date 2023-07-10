package step_definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	@Given("user is on  login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nisha\\Desktop\\Software\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://saucedemo.com/");
		Thread.sleep(5000);
	   }

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(5000);

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@When("user clicks login buutton")
	public void user_clicks_login_buutton() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	    }

	@Then("user is logged into application")
	public void user_is_logged_into_application() {
		WebElement productsTitle = driver.findElement(By.cssSelector(".title"));
		String text = productsTitle.getText();
		
		Assert.assertEquals(text,"Products");
		driver.close();
	}



}
