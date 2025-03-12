package StepDefinition;

import Browser.Browser;
import Pages.Page1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Sample1Scenario {
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
	   
		Browser.openBrowser();
	}
	
	@And("User navigates to the {string} Webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
	    
		Browser.navigateToUrl(string);
	}
	
	@Then("User verifies the title of the Webpage")
	public void user_verifies_the_title_of_the_webpage() {
		
		Assert.assertEquals(Page1.Title(), "OrangeHRM");
	   
	}
	
	@And("User close the Browser")
	public void user_close_the_browser() {
		
		Browser.closeBrowser();
	 
	}
	

}
