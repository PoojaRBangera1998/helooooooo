package Webshop;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PomRepo.AddToCartPage;
import PomRepo.ComputerPage;
import PomRepo.LoginPage;
import genericLibrary.Base_Class;
import genericLibrary.JavaScriptUtil;

public class Tc_002Test extends Base_Class{
	@Test
	public void shop() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getLoginLink().click();

		String Email= readFromPropertyFile.getValueProperty("username");
		loginPage.getEmailTextField().sendKeys(Email);

		String Password= readFromPropertyFile.getValueProperty("password");
		loginPage.getPasswordTextField().sendKeys(Password);

		loginPage.getLoginButton().click();

		Actions actions=new Actions(driver);
		actions.moveByOffset(330,197).perform();
		
		
		ComputerPage computerPage=new ComputerPage(driver);
		computerPage.getDesktopDropdown().click();
		
		computerPage.getSortByDropDown().click();
		Select select=new Select(computerPage.getSortByDropDown());
		select.selectByIndex(4);
		
		computerPage.getProduct().click();
		
		explicitWait.until(ExpectedConditions.visibilityOf(computerPage.getWait()));
		JavaScriptUtil js=new JavaScriptUtil(driver);
		js.jsScrollBy(0, 400);

		computerPage.getAddToCartButton().click();
		
		
		
		AddToCartPage addToCartPage=new AddToCartPage(driver);
		addToCartPage.getAddTocartLink().click();
		addToCartPage.getAddLogOut().click();
		
	}
}
