package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewAccountPage {

	 // variable - private
    @FindBy (xpath = "//input[@placeholder='First name']")
    private WebElement firstNameField;
    
    @FindBy (xpath = "//input[@name='lastname']")
    private WebElement lastNameField ;
    
    @FindBy (xpath = "//input[@name='reg_email__']")
    private WebElement  mobileNumberOrEmailAddress;
    
    @FindBy (xpath = "(//input[@type=\"password\"])[2]")
    private WebElement  newPassword ;
    
    @FindBy (xpath = "(//input[@type='radio'])[1]")
    private WebElement female;
    
    @FindBy (xpath = "(//input[@type='radio'])[2]")
    private WebElement male ;
    
    @FindBy (xpath = "(//input[@type='radio'])[3]")
    private WebElement  custom;
    
    @FindBy (xpath = "(//button[text() = 'Sign Up'])[1]")
    private WebElement signUpButton;
    
   private WebDriver driver;
    //private Actions action;
    
    // constructor - public
    public CreateNewAccountPage(WebDriver driver) {
    	  // to find Element
    	PageFactory.initElements(driver, this);
    	//this.driver = driver;
    	//action = new Actions(driver);
    }
    
    public void sendFirstName() throws InterruptedException {
    	firstNameField.sendKeys("Shruti");
    }
    
    public void sendLastName(String lName) {
    	lastNameField.sendKeys(lName);
    }
    
    public void sendMobileNumberOrEmailAddress(String email) {
    	mobileNumberOrEmailAddress.sendKeys(email);
    }
    
    public void sendNewPassword(String password) {
    	newPassword.sendKeys(password);
    }
    
    public void clickMale() {
    	male.click();
    }
    
    public void clickFemale() {
    	female.click();
    }
    

    public void clickCustom() {
    	custom.click();
    }
    

    public void clickSignUpButton() {
    	signUpButton.click();
    }
    
    
}
