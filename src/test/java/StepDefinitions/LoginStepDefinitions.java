package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

	static WebDriver driver;
	
	LoginPage Login = new LoginPage(driver);

	//@Before and @After are cucumber annotations  these are called hooks
	@Before
	public void setup() {
		driver = new ChromeDriver();
		
	}
	
	@After
	public void tearDown() {
		if (driver != null) {
			driver.close();
		}
	}
	@Given("User is in the login page")
	public void user_is_in_the_login_page() throws InterruptedException {
		//driver = new ChromeDriver(); moved to @Before
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1");
		Thread.sleep(2000);

	}

	// @When("User enters the User name and password")
	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {

		// driver.findElement(By.id("user-name")).sendKeys(string);
		// driver.findElement(By.id("password")).sendKeys(string2);

		Login.enteruserName(string);
		Login.enterPassword(string2);
	}

	@And("clicks the OK Button")
	public void clicks_the_ok_button() {
		// driver.findElement(By.id("login-button")).click();
		Login.clkLabel();

	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		// have an assertion to check the homepage, maybe a title
	}

	@And("Browser is closed")
	public void browser_is_closed() {
		driver.close();
	}

}
