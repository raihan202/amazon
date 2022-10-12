package upSkill.Amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upSkill.Amazon.PageAction.AmazonCartFunctonAction;

public class AmazonCartFunctionStep {

	AmazonCartFunctonAction AmazonCartFunctonActionObj =new AmazonCartFunctonAction(); 
	
	@When("^Select Size$")
	public void select_Size() throws Throwable {
		AmazonCartFunctonActionObj.selectShirtSizeDD();
	}

	@When("^Select color$")
	public void select_color() throws Throwable {
		AmazonCartFunctonActionObj.SelectColorDD();
	}

	@When("^Select Quantity$")
	public void select_Quantity() throws Throwable {
		AmazonCartFunctonActionObj.SelectQuantityDD();
	}

	@Then("^select Add to cart$")
	public void select_Add_to_cart() throws Throwable {
		AmazonCartFunctonActionObj.AddToCartDD();
	}

}
