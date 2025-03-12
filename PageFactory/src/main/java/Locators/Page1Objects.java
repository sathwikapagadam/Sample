package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.Browser;

public class Page1Objects extends Browser{
	
	public Page1Objects()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(css="[type=\"submit\"]")
	public WebElement loginbutton;
	

}
