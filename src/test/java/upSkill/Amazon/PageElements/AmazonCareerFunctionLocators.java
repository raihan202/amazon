package upSkill.Amazon.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import upSkill.Amazon.PageAction.AmazonCarrerAction;

public class AmazonCareerFunctionLocators {
	

	
	@FindBy(xpath="(//input[@placeholder='Search for jobs by title or keyword'])[2]") 
	public WebElement txtFindJobs; //div[@class='col-12 col-md-8']/div
	
	@FindBy(xpath="(//input[@placeholder='Location'])[2]") 
	public WebElement txtFindLocation;
	
	
	
	@FindBy(xpath="(//span[@class='button-icon'])[2]") 
	public WebElement btnClickJob; 
	
	
	@FindBy(xpath="(//div[@class='container'])[1]") 
	public WebElement disJob; 
	//span[@class='navbar-links d-none mb-1 mt-1 d-md-flex align-items-center link-count-1']//a[contains(text(),'Your job application')]
}
