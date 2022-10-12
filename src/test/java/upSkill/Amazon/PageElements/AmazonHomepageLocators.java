package upSkill.Amazon.PageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomepageLocators {

	
	@FindBy(xpath="//input[@type='text']")
	public WebElement txtboxSearch;   //search box 
	

	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	public WebElement btncSearch; //click search box
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") //
	public WebElement lincAccountList; //MouseHover Account&List
	
	@FindBy(xpath="//span[contains(text(),'Customer Service')]")
	public WebElement linCustomerService;    //MouseHover Account&List
    
	@FindBy(xpath="//div[@id='nav-logo']")
	public WebElement clickOnAmazon;  //click on amazon logo
	
	@FindBy(xpath="//a[contains(text(),'Careers')]")
	public WebElement clickCareer;				//footer click on careers
	
	@FindBy(xpath="//li[@class='nav_last ']/a[contains(text(),'Help')]")
	public WebElement ClickOnHelp;


}