package org.demoproj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeetLoginPageObject extends LeetCodeLogin {

	
	public LeetLoginPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[@class='error-message__27FL']")
	private WebElement errorMsg;
	
	@FindBy(xpath="(//input[@class='input__2o8B '])[1]")
	private WebElement username;
	

	public WebElement getErrorMsg() {
		return errorMsg;
	}


	public void setErrorMsg(WebElement errorMsg) {
		this.errorMsg = errorMsg;
	}


	public WebElement getUsername() {
		return username;
	}


	public void setUsername(WebElement username) {
		this.username = username;
	}


	public WebElement getPassword() {
		return password;
	}


	public void setPassword(WebElement password) {
		this.password = password;
	}


	public WebElement getSignInBtn() {
		return signInBtn;
	}


	public void setSignInBtn(WebElement signInBtn) {
		this.signInBtn = signInBtn;
	}

	@FindBy(xpath="(//input[@class='input__2o8B '])[2]")
	private WebElement password;
	
	
	@FindBy(xpath="//span[@class='btn-content__2V4r']")
	private WebElement signInBtn;
}
