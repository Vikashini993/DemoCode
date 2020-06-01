package org.write;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 extends Base {

	public Page4() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="first_name")
	private WebElement FirstName;
	@FindBy(id="last_name")
	private WebElement LastName;
	@FindBy(id="address")
	private WebElement Address;
	@FindBy(id="cc_num")
	private WebElement CCNo;
	@FindBy(id="cc_type")
	private WebElement CCType;
	@FindBy(id="cc_exp_month")
	private WebElement ExpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ExpYear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement BookNow;
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCCNo() {
		return CCNo;
	}
	public WebElement getCCType() {
		return CCType;
	}
	public WebElement getExpMonth() {
		return ExpMonth;
	}
	public WebElement getExpYear() {
		return ExpYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookNow() {
		return BookNow;
	}

	
	
	
}
