package org.webjet.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.webjet.base.WebjetBase;

public class WebjetPagefactory extends WebjetBase
{

@FindBy(xpath = "//span[@class='wj-icon wj-flight']")
private WebElement flights;

@FindBy(xpath = "(//a[text()='Melbourne'])[2]")
private WebElement selectCountry;




public WebElement getSelectCountry() {
	// TODO Auto-generated method stub
	return selectCountry;
}

	
	
}
