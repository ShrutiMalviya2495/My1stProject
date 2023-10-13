package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
	     // variable - private
        @FindBy (xpath = "//input[@id='email']")
        private WebElement userName;
        
        @FindBy (xpath = "//input[@id='pass']")
        private WebElement password;
        
        @FindBy (xpath = "//button[text()='Log in']")
        private WebElement loginButton;
        
        @FindBy (xpath = "//a[contains(@href, 'https://www.facebook.com/recover/initiate/?privacy_mut')]")
        private WebElement forgotPasswordLink;
        
        @FindBy (xpath = "//a[text()='Create new account']")
        private WebElement createNewAccountButton;
        
        @FindBy (xpath = "//div[@class='x78zum5 x1n2onr6']")
        private WebElement clickUserAccount;
        
        @FindBy (xpath = "//span[text()='Log out']")
        private WebElement clickLogOut;
        
        @FindBy (xpath = "(//span[text() = 'Delete'])[2]")
        private WebElement deleteFriendRequest;
        
        // constructor - public
        public LoginOrSignUpPage(WebDriver driver) {
        	  // to find Element
        	PageFactory.initElements(driver, this);
        }
         
        //method - public 
        public void sendUserName() {
        	userName.sendKeys("shrutimalviya2495@gmail.com");
        }
        
        public void sendPassword() {
        	password.sendKeys("India@1947");
        }
        
        public void clickLoginButton() {
        	loginButton.click();
        }
        
        public void clickForgotPasswordLink() {
        	forgotPasswordLink.click();
        }
        
        public void clickCreateNewAccount() {
        	createNewAccountButton.click();
        }
        
        public void clickUserAccount() {
        	clickUserAccount.click();
        }
        public void clickLogOutButton() {
        	clickLogOut.click();
        }
        public void clickDeleteFriendRequest() {
        	deleteFriendRequest.click();
        }
        
}
