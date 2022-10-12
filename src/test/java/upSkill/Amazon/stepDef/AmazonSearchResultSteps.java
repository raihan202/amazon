package upSkill.Amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upSkill.Amazon.PageAction.AmazonSearchresultAction;

public class AmazonSearchResultSteps {

	AmazonSearchresultAction AmazonSearchresultActionObj = new AmazonSearchresultAction();
	
	
	@Then("^items list should be laptop related product$")
	public void items_list_should_be_laptop_related_product() throws Throwable {
		AmazonSearchresultActionObj.VerifyLaptopItems();
	}
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String Brand) throws Throwable {
		AmazonSearchresultActionObj.filterBrand(Brand);
	}

	@Then("^Item list should have product of\"([^\"]*)\"$")
	public void item_list_should_have_product_of(String Brand) throws Throwable {
		AmazonSearchresultActionObj.VarifyBrandVerify(Brand);
	}
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		AmazonSearchresultActionObj.SelectFirstShirtsDD();
	}
}
