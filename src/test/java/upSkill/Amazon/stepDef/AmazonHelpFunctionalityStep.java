package upSkill.Amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upSkill.Amazon.PageAction.AmazonHelpAction;

public class AmazonHelpFunctionalityStep {

	AmazonHelpAction AmazonHelpActionObj = new AmazonHelpAction();
	
	@When("^Click On Track Your Package$")
	public void click_On_Track_Your_Package() throws Throwable {
		AmazonHelpActionObj.ClickOnTrackPackage();
	}
	
	@When("^Click on Play vidoes$")
	public void click_on_Play_vidoes() throws Throwable {
		AmazonHelpActionObj.ClickOnPalyVideos();
	}

	@When("^Close The Videos$")
	public void close_The_Videos() throws Throwable {
		AmazonHelpActionObj.closevideos();
	}

	@Then("^Help and Customer Services Page  Should Appear$")
	public void help_and_Customer_Services_Page_Should_Appear() throws Throwable {
		AmazonHelpActionObj.vefifyTheHelpPage();
	}

}
