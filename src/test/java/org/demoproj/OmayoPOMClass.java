package org.demoproj;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;

public class OmayoPOMClass extends OmayoLeft {

	public WebElement getCars() {
		return cars;
	}

	public void setCars(WebElement cars) {
		this.cars = cars;
	}

	public WebElement getNewLetters() {
		return newLetters;
	}

	public void setNewLetters(WebElement newLetters) {
		this.newLetters = newLetters;
	}

	public WebElement getSampleText1() {
		return sampleText1;
	}

	public void setSampleText1(WebElement sampleText1) {
		this.sampleText1 = sampleText1;
	}

	public WebElement getLink1() {
		return link1;
	}

	public void setLink1(WebElement link1) {
		this.link1 = link1;
	}

	public WebElement getLink2() {
		return link2;
	}

	public void setLink2(WebElement link2) {
		this.link2 = link2;
	}

	public WebElement getTextboxPreloadedText() {
		return textboxPreloadedText;
	}

	public void setTextboxPreloadedText(WebElement textboxPreloadedText) {
		this.textboxPreloadedText = textboxPreloadedText;
	}

	public WebElement getNewWindow() {
		return newWindow;
	}

	public void setNewWindow(WebElement newWindow) {
		this.newWindow = newWindow;
	}

	public WebElement getEnabledButton() {
		return enabledButton;
	}

	public void setEnabledButton(WebElement enabledButton) {
		this.enabledButton = enabledButton;
	}

	public WebElement getDisabledButton() {
		return disabledButton;
	}

	public void setDisabledButton(WebElement disabledButton) {
		this.disabledButton = disabledButton;
	}

	public List<WebElement> getSameNameButton() {
		return sameNameButton;
	}

	public void setSameNameButton(List<WebElement> sameNameButton) {
		this.sameNameButton = sameNameButton;
	}

	public WebElement getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(WebElement fileUpload) {
		this.fileUpload = fileUpload;
	}

	public WebElement getCheckthisbtn() {
		return checkthisbtn;
	}

	public void setCheckthisbtn(WebElement checkthisbtn) {
		this.checkthisbtn = checkthisbtn;
	}

	public WebElement getMrOption() {
		return mrOption;
	}

	public void setMrOption(WebElement mrOption) {
		this.mrOption = mrOption;
	}

	public OmayoPOMClass() {
		PageFactory.initElements(driver, this);
	}

	// FindAll - or gate. either one of the locator matches
	// FindBys - and gate. both the locators should match

	@FindBy(id = "multiselect1")
	private WebElement cars;

	@FindBy(id = "drop1")
	private WebElement newLetters;

	@FindBy(xpath = "//div[@id='Text1']")
	private WebElement sampleText1;

	@FindBy(id = "link1")
	private WebElement link1;

	@FindBy(xpath = "(//a[@id='link2'])[1]")
	private WebElement link2;

	@FindBys({ @FindBy(xpath = "//input[@name='fname']"), @FindBy(id = "textbox1") })
	private WebElement textboxPreloadedText;

	@FindAll({ @FindBy(xpath = "//a[@id='link2']"), @FindBy(xpath = "//a[text()='SeleniumTutorial']") })
	private WebElement newWindow;

	@FindBy(id = "but2")
	private WebElement enabledButton;

	@FindBy(id = "but1")
	private WebElement disabledButton;

	@FindBy(xpath = "//button[@name='samename']")
	private List<WebElement> sameNameButton;

	@FindBy(xpath = "//form[@action='demo_form.asp']")
	private WebElement fileUpload;

	@FindBy(xpath = "//button[text()='Check this']")
	private WebElement checkthisbtn;

	@FindBy(xpath = "//input[@id='dte']")
	private WebElement mrOption;

	public WebElement getDoubleClickHere() {
		return doubleClickHere;
	}

	public void setDoubleClickHere(WebElement doubleClickHere) {
		this.doubleClickHere = doubleClickHere;
	}

	@FindBy(xpath = "//button[text()=' Double click Here   ']")
	private WebElement doubleClickHere;

	public WebElement getTextAreaField1() {
		return textAreaField1;
	}

	public void setTextAreaField1(WebElement textAreaField1) {
		this.textAreaField1 = textAreaField1;
	}

	public WebElement getTextAreaField2() {
		return textAreaField2;
	}

	public void setTextAreaField2(WebElement textAreaField2) {
		this.textAreaField2 = textAreaField2;
	}

	public WebElement getTable1() {
		return table1;
	}

	public void setTable1(WebElement table1) {
		this.table1 = table1;
	}

	public WebElement getHtmlUsername1() {
		return htmlUsername1;
	}

	public void setHtmlUsername1(WebElement htmlUsername1) {
		this.htmlUsername1 = htmlUsername1;
	}

	public WebElement getHtmlpassword1() {
		return htmlpassword1;
	}

	public void setHtmlpassword1(WebElement htmlpassword1) {
		this.htmlpassword1 = htmlpassword1;
	}

	public WebElement getLoginpageUsername() {
		return loginpageUsername;
	}

	public void setLoginpageUsername(WebElement loginpageUsername) {
		this.loginpageUsername = loginpageUsername;
	}

	public WebElement getLoginpagePassword() {
		return loginpagePassword;
	}

	public void setLoginpagePassword(WebElement loginpagePassword) {
		this.loginpagePassword = loginpagePassword;
	}

	@FindBy(xpath = "//textarea[@id='ta1']")
	private WebElement textAreaField1;

	@FindBy(xpath = "//textarea[contains(text(),'The cat was')]")
	private WebElement textAreaField2;

	@FindBy(xpath = "//table[@id='table1']")
	private WebElement table1;

	@FindBy(xpath = "//form[@name='form1']//input[@type='text']")
	private WebElement htmlUsername1;

	@FindBy(xpath = "//form[@name='form1']//input[@type='password']")
	private WebElement htmlpassword1;

	@FindBy(xpath = "//form[@name='login']//input[@name='userid']")
	private WebElement loginpageUsername;

	@FindBy(xpath = "//form[@name='login']//input[@name='pswrd']")
	private WebElement loginpagePassword;

	@FindBy(xpath = "//iframe[@id='iframe1']")
	private WebElement iframe1;

	@FindBy(xpath = "//iframe[@id='iframe2']")
	private WebElement iframe2;

	public WebElement getIframe1() {
		return iframe1;
	}

	public void setIframe1(WebElement iframe1) {
		this.iframe1 = iframe1;
	}

	public WebElement getIframe2() {
		return iframe2;
	}

	public void setIframe2(WebElement iframe2) {
		this.iframe2 = iframe2;
	}

	@FindBy(xpath = "//a[text()='What is Selenium?']")
	private WebElement seleniumTxt;

	public WebElement getNextTxt() {
		return nextTxt;
	}

	public void setNextTxt(WebElement nextTxt) {
		this.nextTxt = nextTxt;
	}

	@FindBy(xpath = "//a[text()='Whats Next?']")
	private WebElement nextTxt;

	public WebElement getSeleniumTxt() {
		return seleniumTxt;
	}

	public void setSeleniumTxt(WebElement seleniumTxt) {
		this.seleniumTxt = seleniumTxt;
	}

	@FindBy(xpath = "//button[text()=' LogIn ']")
	private WebElement htmlLogIn;

	public WebElement getHtmlLogIn() {
		return htmlLogIn;
	}

	public void setHtmlLogIn(WebElement htmlLogIn) {
		this.htmlLogIn = htmlLogIn;
	}

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement simpleLogin;

	public WebElement getSimpleLogin() {
		return simpleLogin;
	}

	public void setSimpleLogin(WebElement simpleLogin) {
		this.simpleLogin = simpleLogin;
	}

	@FindBy(xpath = "//link")
	private List<WebElement> pageLinks;

	public List<WebElement> getPageLinks() {
		return pageLinks;
	}

	public void setPageLinks(List<WebElement> pageLinks) {
		this.pageLinks = pageLinks;
	}

	@FindBy(xpath ="//input[@class='gsc-input']")
	private WebElement searchThisBlog;

	public WebElement getSearchThisBlog() {
		return searchThisBlog;
	}

	public void setSearchThisBlog(WebElement searchThisBlog) {
		this.searchThisBlog = searchThisBlog;
	}

	public WebElement getSearchThisBlogBtn() {
		return searchThisBlogBtn;
	}

	public void setSearchThisBlogBtn(WebElement searchThisBlogBtn) {
		this.searchThisBlogBtn = searchThisBlogBtn;
	}

	public WebElement getImageElement() {
		return imageElement;
	}

	public void setImageElement(WebElement imageElement) {
		this.imageElement = imageElement;
	}

	public WebElement getMaleBtn() {
		return MaleBtn;
	}

	public void setMaleBtn(WebElement maleBtn) {
		MaleBtn = maleBtn;
	}

	public WebElement getFeMaleBtn() {
		return FeMaleBtn;
	}

	public void setFeMaleBtn(WebElement feMaleBtn) {
		FeMaleBtn = feMaleBtn;
	}

	public WebElement getAlertDemobtn() {
		return alertDemobtn;
	}

	public void setAlertDemobtn(WebElement alertDemobtn) {
		this.alertDemobtn = alertDemobtn;
	}

	public WebElement getGetPromptAlertbtn() {
		return getPromptAlertbtn;
	}

	public void setGetPromptAlertbtn(WebElement getPromptAlertbtn) {
		this.getPromptAlertbtn = getPromptAlertbtn;
	}

	public WebElement getGetConfirmationbtn() {
		return getConfirmationbtn;
	}

	public void setGetConfirmationbtn(WebElement getConfirmationbtn) {
		this.getConfirmationbtn = getConfirmationbtn;
	}

	public WebElement getOrangeCheckbox() {
		return OrangeCheckbox;
	}

	public void setOrangeCheckbox(WebElement orangeCheckbox) {
		OrangeCheckbox = orangeCheckbox;
	}

	public WebElement getBlueCheckbox() {
		return BlueCheckbox;
	}

	public void setBlueCheckbox(WebElement blueCheckbox) {
		BlueCheckbox = blueCheckbox;
	}

	public WebElement getLocateUsingclass() {
		return locateUsingclass;
	}

	public void setLocateUsingclass(WebElement locateUsingclass) {
		this.locateUsingclass = locateUsingclass;
	}

	public WebElement getBicycleRadioBtn() {
		return bicycleRadioBtn;
	}

	public void setBicycleRadioBtn(WebElement bicycleRadioBtn) {
		this.bicycleRadioBtn = bicycleRadioBtn;
	}

	public WebElement getCarRadioBtn() {
		return carRadioBtn;
	}

	public void setCarRadioBtn(WebElement carRadioBtn) {
		this.carRadioBtn = carRadioBtn;
	}

	public WebElement getBikeRadioBtn() {
		return bikeRadioBtn;
	}

	public void setBikeRadioBtn(WebElement bikeRadioBtn) {
		this.bikeRadioBtn = bikeRadioBtn;
	}

	public WebElement getLaptopMultiSelectBtn() {
		return laptopMultiSelectBtn;
	}

	public void setLaptopMultiSelectBtn(WebElement laptopMultiSelectBtn) {
		this.laptopMultiSelectBtn = laptopMultiSelectBtn;
	}

	public WebElement getBookMultiSelectBtn() {
		return bookMultiSelectBtn;
	}

	public void setBookMultiSelectBtn(WebElement bookMultiSelectBtn) {
		this.bookMultiSelectBtn = bookMultiSelectBtn;
	}

	public WebElement getPenMultiSelectBtn() {
		return penMultiSelectBtn;
	}

	public void setPenMultiSelectBtn(WebElement penMultiSelectBtn) {
		this.penMultiSelectBtn = penMultiSelectBtn;
	}

	public WebElement getBagMultiSelectBtn() {
		return bagMultiSelectBtn;
	}

	public void setBagMultiSelectBtn(WebElement bagMultiSelectBtn) {
		this.bagMultiSelectBtn = bagMultiSelectBtn;
	}

	public WebElement getDoubleClickButn() {
		return doubleClickButn;
	}

	public void setDoubleClickButn(WebElement doubleClickButn) {
		this.doubleClickButn = doubleClickButn;
	}

	public WebElement getDelayeddropDownButn() {
		return delayeddropDownButn;
	}

	public void setDelayeddropDownButn(WebElement delayeddropDownButn) {
		this.delayeddropDownButn = delayeddropDownButn;
	}

	

	public List<WebElement> getDelayeddropDown() {
		return delayeddropDown;
	}

	public void setDelayeddropDown(List<WebElement> delayeddropDown) {
		this.delayeddropDown = delayeddropDown;
	}

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchThisBlogBtn;

	@FindBy(xpath = "//img[@height='200px']")
	private WebElement imageElement;

	@FindBy(xpath = "//input[@id='radio1']")
	private WebElement MaleBtn;

	@FindBy(xpath = "//input[@id='radio2']")
	private WebElement FeMaleBtn;

	@FindBy(xpath = "//input[@id='alert1']")
	private WebElement alertDemobtn;

	@FindBy(xpath = "//input[@id='prompt']")
	private WebElement getPromptAlertbtn;

	@FindBy(xpath = "//input[@id='confirm']")
	private WebElement getConfirmationbtn;

	@FindBy(xpath = "//input[@id='checkbox1']")
	private WebElement OrangeCheckbox;

	@FindBy(xpath = " //input[@id='checkbox2']")
	private WebElement BlueCheckbox;

	@FindBy(xpath = "(//input[@class='classone'])[1]")
	private WebElement locateUsingclass;

	@FindBy(xpath = "//input[@value='Bicycle']")
	private WebElement bicycleRadioBtn;

	@FindBy(xpath = "//input[@value='Car']")
	private WebElement carRadioBtn;

	@FindBy(xpath = "//input[@value='Bike']")
	private WebElement bikeRadioBtn;

	@FindBy(xpath = " //input[@value='Laptop']")
	private WebElement laptopMultiSelectBtn;

	@FindBy(xpath = "//input[@value='Book']")
	private WebElement bookMultiSelectBtn;

	@FindBy(xpath = "(//input[@value='Pen'])[2]")
	private WebElement penMultiSelectBtn;

	@FindBy(xpath = "//input[@value='Bag']")
	private WebElement bagMultiSelectBtn;

	@FindBy(id = "testdoubleclick")
	private WebElement doubleClickButn;

	@FindBy(xpath = "//button[@class='dropbtn']")
	private WebElement delayeddropDownButn;

	@FindBy(xpath = "//div[@id='myDropdown']//a")
	private List<WebElement> delayeddropDown;
	
	
	
	
}
