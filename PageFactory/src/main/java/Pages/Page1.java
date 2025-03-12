package Pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;
import Locators.Page1Objects;

public class Page1 extends Browser {

    static Page1Objects obj;
    
    public static String Title()
    {
    	return driver.getTitle();
    }
    public static void enterusername(String str)
    {
    	try {
    		wait=new WebDriverWait(Browser.driver,Duration.ofSeconds(20));
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    		obj=new Page1Objects();
    		obj.userName.sendKeys(str);
    	}
    	catch(Exception e)
    	{
    		System.out.println("Username: "+e);
    	}
    }
    
    public static void enterpassword(String str)
    {
    	try {
    		obj.password.sendKeys(str);
    	}
    	catch(Exception e)
    	{
    		System.out.println("Password: "+e);
    	}
    }
    public static void click()
    {
    	try {
    		obj.loginbutton.click();
    	}
    	catch(Exception e)
    	{
    		System.out.println("Click: "+e);
    	}
    }
    

}


