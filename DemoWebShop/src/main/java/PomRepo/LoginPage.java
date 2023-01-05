package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement LoginLink;
	public WebElement getLoginLink() {
		return LoginLink;
	}

	@FindBy(id="Email")
	private WebElement EmailTextField;
	public WebElement getEmailTextField() {
		return EmailTextField;
	}
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement LoginButton;
	public WebElement getLoginButton() {
		return LoginButton;
	}
}
