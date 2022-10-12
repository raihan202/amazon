package upSkill.Amazon.PageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upSkill.Amazon.PageElements.AmazonCartFunctionLocators;
import upSkill.Utilities.ReadExcelSheet;
import upSkill.Utilities.SetUpDrivers;

public class AmazonCartFunctonAction {

	AmazonCartFunctionLocators AmazonCartFunctionLocatorsObj;
	
	
	public AmazonCartFunctonAction () {
		AmazonCartFunctionLocatorsObj = new AmazonCartFunctionLocators();
		PageFactory.initElements(SetUpDrivers.driver, AmazonCartFunctionLocatorsObj);
		
	}
	public void selectShirtSizeDD() throws Exception {
		Select dropDown = new Select(AmazonCartFunctionLocatorsObj.DDcselectSize);
		Thread.sleep(5000);
		dropDown.selectByVisibleText(ReadExcelSheet.getMapData("Ama-crt-size"));
		//dropDown.selectByVisibleText("XX-Large"); //this is for reguler xpath
		//AmazonCartFunctionLocatorsObj.DDcselectSize.clear();
		
	}
	public void SelectColorDD() {
		AmazonCartFunctionLocatorsObj.DDcselectColor.click();
		
	}
	public void SelectQuantityDD() throws Exception {
		Select dropDown = new Select(AmazonCartFunctionLocatorsObj.DDselectQuantity);
		
	Thread.sleep(5000);
	dropDown.selectByVisibleText(ReadExcelSheet.getMapData("Ama-crt-Quantity"));
	//dropDown.selectByVisibleText("5"); //this is for reguler xpath
		
	}
	public void AddToCartDD() throws Exception {
		AmazonCartFunctionLocatorsObj.SelectAddToCart.click();
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
