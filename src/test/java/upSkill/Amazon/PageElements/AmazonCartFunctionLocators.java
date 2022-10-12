package upSkill.Amazon.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonCartFunctionLocators {

	
	
	@FindBy(xpath="//select[@Id='native_dropdown_selected_size_name']") 
	public WebElement DDcselectSize;
	
	
	@FindBy(xpath="//li[@id='color_name_1']")
	public WebElement DDcselectColor;   
	 
	
	@FindBy(xpath="//select[@name='quantity']")
	public WebElement DDselectQuantity;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	public WebElement SelectAddToCart;
}
