package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
	public ComputerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),'Desktops')]")
	private WebElement DesktopDropdown;
	public WebElement getDesktopDropdown() {
		return DesktopDropdown;
	}
	
	@FindBy(id="products-orderby")
	private WebElement SortByDropDown;
	public WebElement getSortByDropDown() {
		return SortByDropDown;
	}
	
	@FindBy(xpath = "//div[@data-productid='74']/..//input[@value='Add to cart']")
	private WebElement Product;
	public WebElement getProduct() {
		return Product;
	}
	
	

	@FindBy(xpath = "//input[@id=\"add-to-cart-button-74\"]")
	private WebElement AddToCartButton;
	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}
	
	
	//----------------------------------------------------------------------------//
		@FindBy(xpath = "//h1[contains(text(),'Build your own expensive computer')]")
		private WebElement Wait;
		public WebElement getWait() {
			return Wait;
		}

}

