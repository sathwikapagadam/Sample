package StepDefinition;


import Browser.Browser;
import Pages.Page1;
import Pages.Page2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Sample2Scenario {
	
	@When("User enters {string} the username")
	public void user_enters_the_username(String string)
	{
		Page1.enterusername("Admin");;
	}
	
	@And("User enters {string} the password")
	public void user_enters_the_password(String string)
	{
		Page1.enterpassword("admin123");
	}
	
	@And("User clicks on the Login button")
	public void user_clicks_on_the_login_button()
	{
		Page1.click();
	}
	
	@Then("User verifies the Profile Account")
	public void user_verifies_the_profile_account()
	{
		Assert.assertEquals(Page2.Username(), "mandabenakbabenakba userfakhreddinefakhreddine");
	}
	
	@And("User closes the Browser")
	public void user_close_the_browser() {
	   Browser.closeBrowser();
	}

}
