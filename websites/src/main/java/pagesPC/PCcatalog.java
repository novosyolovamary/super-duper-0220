package pagesPC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PCcatalog {
	WebDriver driver;
	// locate those objects first
	@FindBy (xpath="//*[@class='sdm_pass_text']") //@PageFactoryFinder(value=FindByBuilder.class)
	WebElement password;  //global variable WebElement
	@FindBy (xpath="//*[text()='Download Now!']")
	WebElement downloadBtn;
	@FindBy (id="error-page")
	WebElement errorMessage;
	
	public PCcatalog(WebDriver driver) {    //interface
		this.driver=driver;   
		PageFactory.initElements(driver, this); }//PageFactory class makes using Page Objects simple
	//create methods:
	public void PassField (String enterepass) throws InterruptedException {
		password.sendKeys(enterepass);  //-not hardcoded webelement
		Thread.sleep(3000);
	}
	public void Downloading() throws InterruptedException {
		downloadBtn.click();
		Thread.sleep(3000);
	}
	public void GetErrorMessage() {
		String Txt = errorMessage.getText();
		System.out.println(Txt);
		Assert.assertEquals(Txt, "Error! Incorrect password. This download requires a valid password.");
	}
}
