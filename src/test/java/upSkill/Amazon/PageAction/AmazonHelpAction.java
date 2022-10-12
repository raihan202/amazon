package upSkill.Amazon.PageAction;

import org.openqa.selenium.support.PageFactory;

import upSkill.Amazon.PageElements.AmazonHelpLocators;
import upSkill.Utilities.SetUpDrivers;

public class AmazonHelpAction {

	AmazonHelpLocators AmazonHelpLocatorsObj;
	
	
	public AmazonHelpAction () {
		AmazonHelpLocatorsObj = new AmazonHelpLocators();
		PageFactory.initElements(SetUpDrivers.driver, AmazonHelpLocatorsObj); }
	

	
	public void ClickOnTrackPackage() {
		
		AmazonHelpLocatorsObj.ClickONTrackPAckage.click();
	}
	
	public void ClickOnPalyVideos() {
		
		AmazonHelpLocatorsObj.ClickOnPlayVideo.click();
	}
	
	public void closevideos() {
		
		AmazonHelpLocatorsObj.ClickOnCrossBTN.click();
	}
	
	public void vefifyTheHelpPage() {
		
		AmazonHelpLocatorsObj.helpPageDisplay.isDisplayed();
	}
	
}
