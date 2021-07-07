package web.aspiration.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aspiration.framework.selenium.SeleniumHelper;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObject{

	WebDriver driver;

	@FindBy(xpath = "(//a[contains(.,'Spend & Save')])[1]")
	private WebElementFacade lnkSpendAndSave;

	@FindBy(xpath = "(//a[contains(.,'Credit')])[1]")
	private WebElementFacade lnkCredit;		

	@FindBy(xpath = "(//a[contains(.,'Who We Are')])[1]") private
	WebElementFacade lnkWhoAreWe;

	@FindBy(xpath = "(//a[contains(.,'Giving')])[1]")
	private WebElementFacade lnkGiving;
	
	@FindBy(xpath = "(//input[@type='email'])[1]")
	private WebElementFacade btnGetStarted;
	
	@FindBy(xpath = "(//input[@type='email'])[1]")
	private WebElementFacade txtEmail;
	
	By bytxtEmail = By.xpath("(//input[@type='email'])[1]");

	public static enum Links {
		SpendAndSave, Credit, WhoAreWe, Giving;

	}

	public HomePage(WebDriver driver) { 

		this.driver = driver;
		PageFactory.initElements(driver, this);

		System.out.println("Vinod ---------------------------Kumar");
	}

	/**
	 * 
	 * @param link
	 */
	public void clickOnLink(Links link) {
		try {	
			switch(link) {
			case Credit:
				lnkSpendAndSave.waitUntilClickable();
				lnkSpendAndSave.click();
				break;				
			case Giving:
				lnkCredit.waitUntilClickable();
				lnkCredit.click();
				break;
			case SpendAndSave:
				lnkSpendAndSave.waitUntilClickable();
				lnkSpendAndSave.click();
				break;
			case WhoAreWe:
				lnkGiving.waitUntilClickable();
				lnkGiving.click();
				break;
			default:
				break; 
			}

		} catch (Exception e) {
			throw new RuntimeException("Unable to click on link");
		}
	}	

	public void enterEmailAndClickGetStarted(String emailId)
	{ 
		txtEmail.sendKeys(emailId);
		btnGetStarted.waitUntilClickable().click();
	}

}
