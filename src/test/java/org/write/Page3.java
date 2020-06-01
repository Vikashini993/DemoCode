package org.write;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends Base {

	public Page3() {
		
	PageFactory.initElements(driver, this);
	}
@FindBy(id="radiobutton_0")
private WebElement Radiobutton;
@FindBy(id="continue")
private WebElement Continue;
public WebElement getRadiobutton() {
	return Radiobutton;
}
public WebElement getContinue() {
	return Continue;
}
	
	
}
