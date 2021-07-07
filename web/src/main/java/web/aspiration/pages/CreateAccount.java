package web.aspiration.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateAccount extends PageObject {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"ap_customer_name\"]")
	private WebElementFacade txtCustomerName;
	
	@FindBy(xpath = "")
	private WebElementFacade txtEmail;
	
	@FindBy(xpath = "")
	private WebElementFacade txtPassword;
	
	
	@FindBy(xpath = "")
	private WebElementFacade txtConfirmPassword;

	@FindBy(xpath = "")
	private WebElementFacade btnCreateAmazonAccount;
	
	public CreateAccount(WebDriver driver) { 

		this.driver = driver;
		PageFactory.initElements(driver, this);

		System.out.println("Vinod ---------------------------Kumar");
	}

	
	public void createAccount(String custName, String emailId, String password)
	{
		txtCustomerName.sendKeys(custName);
		txtEmail.sendKeys(emailId);
		txtPassword.sendKeys(password);
		txtConfirmPassword.sendKeys(password);
		
		btnCreateAmazonAccount.click(); 
	}
}
