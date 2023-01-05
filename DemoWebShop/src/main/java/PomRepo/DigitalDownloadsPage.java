package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsPage {
	public DigitalDownloadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[@class='top-menu']/..//a[contains(text(),'Digital downloads')]")
	private WebElement DigitalDownloadLink;
	public WebElement getDigitalDownloadLink() {
		return DigitalDownloadLink;
	}
	
	@FindBy(id="products-orderby")
	private WebElement SortByDropDown;
	public WebElement getSortByDropDown() {
		return SortByDropDown;
	}
	
	@FindBy(xpath = "//div[@data-productid=\"53\"]/..//a[text()='3rd Album']")
	private WebElement Product;
	public WebElement getProduct() {
		return Product;
	}
	
	@FindBy(xpath = "//input[@id='addtocart_53_EnteredQuantity']")
	private WebElement Qty;
	public WebElement getQty() {
		return Qty;
	}
	
	@FindBy(id="add-to-cart-button-53")
	private WebElement AddToCartButton;
	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}
	
	@FindBy(xpath = "//div[@data-productid=\"53\"]/..//input[@value='Add to cart']")
	private WebElement AddToCart;
	public WebElement getAddToCart() {
		return AddToCart;
	}
	
	//----------------------------------------------------------------------------//
	@FindBy(xpath = "//h1[text()='Digital downloads']")
	private WebElement Wait;
	public WebElement getWait() {
		return Wait;
	}
	
}
