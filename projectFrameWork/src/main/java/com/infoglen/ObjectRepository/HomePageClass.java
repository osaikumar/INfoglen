package com.infoglen.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageClass {

	@FindBy(id="searchboxinput")
	private WebElement SearchBox;

	@FindBy(id="searchbox-searchbutton")
	private WebElement searchBtn;
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSearchBox() {
		return SearchBox;
	}
	
}
