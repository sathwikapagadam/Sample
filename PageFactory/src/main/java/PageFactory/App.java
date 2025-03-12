package PageFactory;

import Browser.Browser;
import Pages.Page1;
import Pages.Page2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	 Browser.openBrowser();
         Browser.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         
         
         Page1.enterusername("Admin");
         Page1.enterpassword("admin123");
         Page1.click();
         
         if(Page1.Title().equals("OrangeHRM"))
         {
         	System.out.println("Title matched with expected.");
         }
         else
         {
         	System.out.println("Title is not matched with expected.");
         }
         if(Page2.Username().equals("manda user"))
         {
         	System.out.println("User matched with expected");
         }
         else
         {
         	System.out.println("user is not matched with expected");
         }
         Page2.optionclick("Time");
         Browser.closeBrowser();
         
    }
}
