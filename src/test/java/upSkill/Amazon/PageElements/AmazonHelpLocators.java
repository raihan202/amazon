package upSkill.Amazon.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHelpLocators {

	@FindBy(xpath="(//div[contains(text(),'Track your package')])[1]")
	public WebElement ClickONTrackPAckage;
	
	@FindBy(xpath="//div[@class='vidContainer']") //a[@id='cs-vid-0']
	public WebElement ClickOnPlayVideo;
	
	@FindBy(xpath="//a[@id='close-btn']")
	public WebElement ClickOnCrossBTN;

	@FindBy(xpath="//a[contains(text(),'Help & Customer Service')]")
	public WebElement helpPageDisplay;
}
