package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register']") 
	private WebElement  RegisterLink;
	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	@FindBy(id = "gender-female") 
	private WebElement GenderRadioButton;
	public WebElement getGenderRadioButton() {
		return GenderRadioButton;
	}

	@FindBy(id = "FirstName")
	private WebElement FirstNameTextField;
	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	@FindBy(id = "LastName")
	private WebElement LastNameTextField;
	public WebElement getLastNameTextField() {
		return LastNameTextField;
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
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextfield;
	public WebElement getConfirmPasswordTextfield() {
		return ConfirmPasswordTextfield;
	}
	
	@FindBy(id="register-button")
	private WebElement RegisterButton;
	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	


}
