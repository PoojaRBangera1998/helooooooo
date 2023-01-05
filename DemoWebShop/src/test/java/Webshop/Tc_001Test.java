package Webshop;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.noneDSA;
import org.hamcrest.DiagnosingMatcher;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PomRepo.AddToCartPage;
import PomRepo.DigitalDownloadsPage;
import PomRepo.LoginPage;
import PomRepo.RegisterPage;
import genericLibrary.Base_Class;
import genericLibrary.JavaScriptUtil;

public class Tc_001Test extends Base_Class{
	@Test
	public void shop() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getLoginLink().click();

		String Email= readFromPropertyFile.getValueProperty("username");
		loginPage.getEmailTextField().sendKeys(Email);

		String Password= readFromPropertyFile.getValueProperty("password");
		loginPage.getPasswordTextField().sendKeys(Password);

		loginPage.getLoginButton().click();


		DigitalDownloadsPage digitalDownloadsPage=new DigitalDownloadsPage(driver);
		digitalDownloadsPage.getDigitalDownloadLink().click();

		digitalDownloadsPage.getSortByDropDown().click();
		Select select=new Select(digitalDownloadsPage.getSortByDropDown());
		select.selectByIndex(4);

	
//		JavaScriptUtil js=new JavaScriptUtil(driver);
//		js.jsScrollBy(0, 200);
//		explicitWait.until(ExpectedConditions.visibilityOf(digitalDownloadsPage.getWait()));
//
		digitalDownloadsPage.getProduct().click();
		
		String Qty= readFromPropertyFile.getValueProperty("qty");
		digitalDownloadsPage.getQty().clear();
		digitalDownloadsPage.getQty().sendKeys(Qty);
		
		digitalDownloadsPage.getAddToCartButton().click();
		
		AddToCartPage  addToCartPage =new AddToCartPage(driver);
		addToCartPage.getAddTocartLink().click();
		addToCartPage.getAddLogOut().click();

	}
}
