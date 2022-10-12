package upSkill.Amazon.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upSkill.Amazon.PageAction.AmazonHomepageAction;

public class AmazonHomePageStep {

	AmazonHomepageAction AmazonHomepageActionObj = new AmazonHomepageAction();

	@Given("^open amazon Homepage$")
	public void open_amazon_home_page() throws Throwable {
		
	}
	
	@When("^search for laptop$")
	public void search_for_laptop() throws Throwable {
		AmazonHomepageActionObj.SearchLaptops();
	}
	
	@Given("^Search For \"([^\"]*)\"$")
	public void search_For(String Items) throws Throwable {
		AmazonHomepageActionObj.SearchItems("Items");
	}
	
	@Given("^Search for shirt$")
	public void search_for_shirt() throws Throwable {
		AmazonHomepageActionObj.searchShirtsDD();
	}
	
	@When("^MouseHover Account & List$")  //mousehover 
	public void mousehover_Account_List() throws Throwable {
		AmazonHomepageActionObj.MousHoverAccoutntList();
		
	}

	@When("^Click On Customer Service$")   //mousehover 
	public void click_On_Customer_Service() throws Throwable {
		AmazonHomepageActionObj.clickonCustomerService();
		
	}
   
	@Then("^Go back to Amazon HomePage$")    //mousehover 
	public void go_back_to_Amazon_HomePage() throws Throwable {
		AmazonHomepageActionObj.ClickOnAmazon();
		
	}
	
	@When("^Click On careers$")		//Amazon career Step
	public void click_On_careers() throws Throwable {
		AmazonHomepageActionObj.clickOnCareer();
	}

	@When("^Click On Help$")		//amazon Help Step
	public void click_On_Help() throws Throwable {
		AmazonHomepageActionObj.clickOnHelp();
	}

}

