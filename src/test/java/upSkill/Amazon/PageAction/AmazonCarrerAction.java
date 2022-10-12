package upSkill.Amazon.PageAction;

import org.openqa.selenium.support.PageFactory;

import upSkill.Amazon.PageElements.AmazonCareerFunctionLocators;
import upSkill.Utilities.SetUpDrivers;

public class AmazonCarrerAction {

	AmazonCareerFunctionLocators AmazonCareerFunctionLocatorsObj;
	
	
	public AmazonCarrerAction () {
		AmazonCareerFunctionLocatorsObj = new AmazonCareerFunctionLocators();
		PageFactory.initElements(SetUpDrivers.driver, AmazonCareerFunctionLocatorsObj); }
	
	public void jobSearch() throws Exception {
		
	
		AmazonCareerFunctionLocatorsObj.txtFindJobs.sendKeys("QA");
		Thread.sleep(3000);
	}
	public void jobLocation()throws Exception {	
		
		AmazonCareerFunctionLocatorsObj.txtFindLocation.sendKeys("NYC");
		Thread.sleep(3000);
		
	}
	
	public void clickOnJobSearch() {
		AmazonCareerFunctionLocatorsObj.btnClickJob.click();
		
	}
	
	public void verifyJob() {
		AmazonCareerFunctionLocatorsObj.disJob.isDisplayed();
	}
	
	
}
