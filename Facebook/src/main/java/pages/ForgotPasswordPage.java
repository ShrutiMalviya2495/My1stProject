package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	 @FindBy (xpath = "//div[@class='_9nq2 marginBottom16px']")
     private WebElement textMessage;
     
     @FindBy (xpath = "//input[@placeholder='Email address or mobile number']")
     private WebElement pleaseEnterEmailAddressButton;
     
     @FindBy (xpath = "//button[text()='Log in']")
     private WebElement loginButton;
     
     @FindBy (xpath = "//a[@href='/login.php']")
     private WebElement cancelButton;
     
     @FindBy (xpath = "//button[@type='submit']")
     private WebElement searchButton;
     
     public ForgotPasswordPage (WebDriver driver) {
    	  PageFactory.initElements(driver, this);
     }
     
     public void sendPleaseEnterEmailButton() {
    	 pleaseEnterEmailAddressButton.sendKeys("shrutimalviya2495@gmail.com");
     }
     
     public void clickCancelButton() {
    	 cancelButton.click();
     }
     
     public void clickSearchButton() {
    	 searchButton.click();
     }
     
     public String getForgotMessage() {
    	 String msg = textMessage.getText();
    	 return msg;
     }
}
