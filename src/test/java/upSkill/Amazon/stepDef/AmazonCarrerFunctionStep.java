package upSkill.Amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upSkill.Amazon.PageAction.AmazonCarrerAction;

public class AmazonCarrerFunctionStep {
	AmazonCarrerAction AmazonCarrerActionObj =new AmazonCarrerAction(); 
	
	
	@When("^Search for Jobs$")
	public void search_for_Jobs() throws Throwable {
		AmazonCarrerActionObj.jobSearch();
	}
	@When("^Search for location$")
	public void search_for_location() throws Throwable {
		AmazonCarrerActionObj.jobLocation();
	}

	@When("^Click on search$")
	public void click_on_search() throws Throwable {
		AmazonCarrerActionObj.clickOnJobSearch();
	}
	@Then("^Job Search Result should Appear$")
	public void Job_search_Result_should_Appear() throws Throwable {
		AmazonCarrerActionObj.verifyJob();
	}
	
	
}
