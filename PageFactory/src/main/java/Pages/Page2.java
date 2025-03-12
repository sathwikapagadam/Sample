package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;

import Locators.Page2Objects;

public class Page2 extends Browser{
	
	public static Page2Objects obj;	
 public static String Username()
 {
	 obj=new Page2Objects();
	 wait=new WebDriverWait(Browser.driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.elementToBeClickable(obj.dashboardelement));
	 return obj.dashboardelement.getText();
 }
	public static void optionclick(String str)
	{
		try {
			for(WebElement e:obj.list)
			{
				if(e.getText().equalsIgnoreCase(str))
				{
					e.click();
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Click: "+e);
		}
	}

}
