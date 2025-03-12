package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.Browser;

public class Page2Objects extends Browser{
	
	public static By searchmenuelements = By.cssSelector("[class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]");
	public static By searchusername = By.cssSelector("[class=\"oxd-userdropdown-name\"]");
	public static By searchmenuname = By.cssSelector("[class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");
	public Page2Objects()
	{
		PageFactory.initElements(driver,this);
	}
	@FindAll(@FindBy(css="[class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]"))
	public List<WebElement> list;
	
	@FindBy(css="[class=\"oxd-userdropdown-name\"]")
	@CacheLookup
	public WebElement dashboardelement;
	
}
