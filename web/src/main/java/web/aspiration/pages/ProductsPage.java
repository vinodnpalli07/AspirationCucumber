package web.aspiration.pages;

import org.javatuples.Pair;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.aspiration.framework.selenium.SeleniumHelper;

import net.serenitybdd.core.pages.WebElementFacade;

public class ProductsPage {
	
	WebDriver driver;
	
	private By divProduct = By.xpath("//div[@class='plan-content']"); 
	
	@FindBy(xpath = "(//button[contains(.,'Get Aspiration')])[1]")
	private WebElementFacade btnGetAspiration;		
	
	@FindBy(xpath = "//button[contains(.,'Get Aspiration Plus')]")
	private WebElementFacade btnGetAspirationPlus;	
	
	@FindBy(xpath = "//div[@class='inside-form']")
	private WebElementFacade modalPopup;
	
	@FindBy(css = ".plan-a-plus .btn")
	private WebElementFacade btnPlanPlus;
	
	@FindBy(css = ".plan-original .btn")
	private WebElementFacade btnPlanOriginal;
	 
	
	public ProductsPage(WebDriver driver) { 

		this.driver = driver;
		PageFactory.initElements(driver, this);

		System.out.println("Vinod ---------------------------Kumar");
	}

	
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public int getNumberOfProducts(WebDriver driver) {
		return SeleniumHelper.findElements(driver, divProduct).size();
	}
	
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public boolean isModalPopUpDisplayed_Aspiration(WebDriver driver) {
		return SeleniumHelper.isWebElementVisible(driver, By.cssSelector(".plan-a-plus .btn"),3500);
	}
	
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public boolean isModalPopUpDisplayed_AspirationPlus(WebDriver driver) {
		return SeleniumHelper.isWebElementVisible(driver, By.cssSelector(".plan-a-plus .btn"),3500);
	}
	
	/**
	 * Returns the Prices
	 * @param driver
	 * @return
	 */
	public Pair<String,String> getSubscriptionPrice(WebDriver driver)
	{
		SeleniumHelper.click(driver, By.xpath("//div[2]/div"));
		String yearly = SeleniumHelper.getText(driver, By.xpath("//div[2]/div/p")); 

		
		SeleniumHelper.click(driver, By.xpath("//div[2]/div[2]/div"));		
		String monthly = SeleniumHelper.getText(driver, By.xpath("//div[2]/p")); 
		 
		return  new Pair<String,String>(yearly,monthly) ;
		
	}

	/**
	 * 
	 * @param driver
	 */	
	public void clickOnGetAspiration(WebDriver driver) {  
		btnPlanOriginal.waitUntilClickable().click();
	}
	
	/**
	 *
	 * @param driver
	 */
	public void clickOnGetAspirationPlus(WebDriver driver) {
		btnPlanPlus.waitUntilClickable().click();		
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void closePopUp(WebDriver driver) {
		SeleniumHelper.findElement(driver, By.cssSelector(".plan-a-plus .btn")).sendKeys(Keys.ESCAPE);
	}

}
