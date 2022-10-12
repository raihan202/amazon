package upSkill.Amazon.PageAction;

import org.openqa.selenium.support.PageFactory;

import upSkill.Amazon.PageElements.AmazonSearchResultLocators;
import upSkill.Utilities.SetUpDrivers;

public class AmazonSearchresultAction {

	
	AmazonSearchResultLocators AmazonSearchResultLocatorsObj;
	
	public AmazonSearchresultAction() {
		
	AmazonSearchResultLocatorsObj =new AmazonSearchResultLocators();
		PageFactory.initElements(SetUpDrivers.driver, AmazonSearchResultLocatorsObj);
			
	}

	public void VerifyLaptopItems() {
	AmazonSearchResultLocatorsObj.txtLaptop.isDisplayed();
}
	public void filterBrand(String Brand) {
		if (Brand.equals("Adidas")) {
			AmazonSearchResultLocatorsObj.cbxBrandAdidas.click();
		}else if(Brand.equals("Nike")) {
			AmazonSearchResultLocatorsObj.cbxBrandNike.click();
		}else if (Brand.equals("NewBalance")) {
			AmazonSearchResultLocatorsObj.cbxBrandNewBalance.click();
		}else {System.out.println("Brand Items is not found --- try agin");
			} 
			
		
		
	}
	
	public void VarifyBrandVerify(String brand) {
		
		if(brand.equals("Adidas")) {
			AmazonSearchResultLocatorsObj.txtShirts.isDisplayed();
		}else if(brand.equals("Nike")) {
			AmazonSearchResultLocatorsObj.txtShoes.isDisplayed();
		}else if (brand.equals("NewBalance")) {
			AmazonSearchResultLocatorsObj.txtPants.isDisplayed();
		}else {
			System.out.println("Brand Items is not found --- try agin");
		}
		
		
		
	}
	
	public void SelectFirstShirtsDD() {
		AmazonSearchResultLocatorsObj.SelectFirstShirtDD.click();
	}



	
	
	
}
