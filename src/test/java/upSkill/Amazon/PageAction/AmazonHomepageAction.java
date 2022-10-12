package upSkill.Amazon.PageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import upSkill.Amazon.PageElements.AmazonHomepageLocators;
import upSkill.Utilities.SetUpDrivers;

public class AmazonHomepageAction {

	AmazonHomepageLocators AmazonHomepageLocatorsObj;
	
public AmazonHomepageAction() {
		
	AmazonHomepageLocatorsObj =new AmazonHomepageLocators();
		PageFactory.initElements(SetUpDrivers.driver, AmazonHomepageLocatorsObj);
			
	}
	public void SearchLaptops() throws Exception {
		Thread.sleep(5000);
		
		AmazonHomepageLocatorsObj.txtboxSearch.sendKeys("laptop");
		Thread.sleep(5000);
		AmazonHomepageLocatorsObj.btncSearch.click();
		
	}
	public void SearchItems(String Items) {
		AmazonHomepageLocatorsObj.btncSearch.sendKeys("Items");
		AmazonHomepageLocatorsObj.btncSearch.click();
		
	}
	public void searchShirtsDD (){
		AmazonHomepageLocatorsObj.txtboxSearch.sendKeys("shirt");
		AmazonHomepageLocatorsObj.btncSearch.click();
	}
	
	public void MousHoverAccoutntList() throws Exception{
		
		Actions action = new Actions(SetUpDrivers.driver); 
		action.moveToElement(AmazonHomepageLocatorsObj.lincAccountList);
		action.perform();
		Thread.sleep(3000);
			
	}
	
	
	public void clickonCustomerService() throws Exception {
		AmazonHomepageLocatorsObj.linCustomerService.isEnabled();
		AmazonHomepageLocatorsObj.linCustomerService.click();
		Thread.sleep(3000);
	}
	
	
	public void ClickOnAmazon() {
		AmazonHomepageLocatorsObj.clickOnAmazon.click();
	}

	public void clickOnCareer() {
		AmazonHomepageLocatorsObj.clickCareer.click();
		
		
	}
	public void clickOnHelp() {
		AmazonHomepageLocatorsObj.ClickOnHelp.click();
		
	}
	
}
	
	
	
	
	
	
	
	
	
	

