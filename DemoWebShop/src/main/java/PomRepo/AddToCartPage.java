package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement AddTocartLink;
	public WebElement getAddTocartLink() {
		return AddTocartLink;
	}
	
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement AddLogOut;
	public WebElement getAddLogOut() {
		return AddLogOut;
	}
}

