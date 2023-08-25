package com.GeneralStore.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GeneralStore.GenericUtility.GestureUtility;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	
	AndroidDriver driver;
	
	@FindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement countryDropdown;
	
	@FindBy(xpath="//android.widget.TextView[@text='India']")
	private WebElement selectCountry;
	
	@FindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameTxtFld;
	
	@FindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement radioBtn;
	
	@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement submitBtn;
	
	public LoginPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getNameTxtFld() {
		return nameTxtFld;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public void loginSetup(GestureUtility gUtil, String value, String name)
	{
		countryDropdown.click();
		gUtil.scrollingGesture(value);
		selectCountry.click();
		nameTxtFld.sendKeys(name);
		radioBtn.click();
		submitBtn.click();
	}
	

}
