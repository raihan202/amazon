package upSkill.Amazon.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultLocators {
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") //serarch laptop validation 
	public WebElement txtLaptop;
	
	@FindBy(xpath="//span[@class='a-color-state a-text-bold']") //serarch shoes validation //div/span[contains(text(),'shoes')]
	public WebElement txtShoes;
	
	@FindBy(xpath="//div/span[contains(text(),'shirts')]") //serarch shirts validation 
	public WebElement txtShirts;

	@FindBy(xpath="//div/span[contains(text(),'Pants')]") //serarch Pants validation 
	public WebElement txtPants;
	
	//@FindBy(xpath="//span[@class='a-size-base a-color-base' and contains(text(),'Nike')]")
	//public WebElement cbxBrandNike;
	@FindBy(xpath="//li[@aria-label='Nike']") //span[@class='a-size-base a-color-base'][contains(text(),'Nike')]
	public WebElement cbxBrandNike;
	@FindBy(xpath="//li[@aria-label='adidas']") //span[@class='a-size-base a-color-base'][contains(text(),'adidas')]
	public WebElement cbxBrandAdidas;
	
	@FindBy(xpath="//li[@aria-label='New Balance']") //span[@class='a-size-base a-color-base'][contains(text(),'New Balance')]
	public WebElement cbxBrandNewBalance;
	
	@FindBy(xpath="//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']") //Select first Shirt from search list
	public WebElement SelectFirstShirtDD;
}
