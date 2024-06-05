package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement userName;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passWord;

	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement loginButton;

	@FindBy(xpath = "//div[@class='app-logo']")
	public WebElement lbl_logo;

	//Factory class to make using Page Objects simpler and easier.
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enteruserName(String loginName) {
		this.userName.sendKeys(loginName);
	}

	public void enterPassword(String loginPassword) {
		this.passWord.sendKeys(loginPassword);
	}

	public void clkLabel() {
		loginButton.click();
	}
	
}
