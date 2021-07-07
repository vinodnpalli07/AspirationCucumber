package web.aspiration.steps; 

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.aspiration.framework.selenium.BaseTestHelper;
import com.aspiration.framework.selenium.SeleniumHelper;
import com.aspiration.framework.utils.ConfigProperties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;
import web.aspiration.pages.HomePage;
import web.aspiration.pages.HomePage.Links;
import web.aspiration.pages.ProductsPage;

@RunWith(Cucumber.class)
public class ProductsStepDefinitions extends BaseTestHelper {
	
	WebDriver driver;
	HomePage home ;
	ProductsPage prodPage;
	
	@ManagedPages
	private Pages pages;
	
    @Given("^The User is on Aspiration Home Page$")
    public void the_user_is_on_aspiration_home_page() throws Throwable {
    	System.out.println("the_user_is_on_aspiration_home_page");
    	driver = openBrowser(); 
    	SeleniumHelper.loadPage(driver, ConfigProperties.getHostUrl("aspiration"));
    }

    @When("^The User clicks on the Spend and Save$")
    public void the_user_clicks_on_the_spend_and_save() throws Throwable {
    	System.out.println("the_user_clicks_on_the_spend_and_save");
    	home = new HomePage(driver);
    	home.clickOnLink(Links.SpendAndSave);
    }

    @When("^Clicking on Get Aspiration$")
    public void clicking_on_get_aspiration() throws Throwable {
    	System.out.println("clicking_on_get_aspiration");
    }

    @When("^Clicking on Get Aspiration Plus$")
    public void clicking_on_get_aspiration_plus() throws Throwable {
    	System.out.println("clicking_on_get_aspiration_plus");
    }

    @Then("^There are 2 Products displayed$")
    public void there_are_2_products_displayed() throws Throwable {
    	System.out.println("there_are_2_products_displayed");
    }

    @Then("^A modal dialog for sign up is displayed$")
    public void a_modal_dialog_for_sign_up_is_displayed() throws Throwable {
    	System.out.println("a_modal_dialog_for_sign_up_is_displayed");
    }

    @Then("Get Aspiration Plus displays (.*) and (.*)")
    public void get_aspiration_plus_displays_and(String producttype, String price) throws Throwable {
    	System.out.println("get_aspiration_plus_displays_and");
    }

}