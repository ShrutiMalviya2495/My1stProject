package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.ForgotPasswordPage;
import pages.LoginOrSignUpPage;

public class TestClass {
      public static void main(String[] args) throws InterruptedException {
    	  ChromeOptions option = new ChromeOptions();
    	  option.addArguments("--disable-notifications");
    	  System.setProperty("webdriver.chrome.driver","D:\\Excel sheet\\chromedriver-win64\\chromedriver.exe");
    	  WebDriver driver = new ChromeDriver(option);
    	  driver.get("https://www.facebook.com/");
    	  
    	  LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
    	  loginOrSignUpPage.sendUserName();
    	  loginOrSignUpPage.sendPassword();
    	  loginOrSignUpPage.clickLoginButton();
    	  loginOrSignUpPage.clickUserAccount();
    	  Thread.sleep(3000);
    	  loginOrSignUpPage.clickLogOutButton();
    	 // loginOrSignUpPage.clickDeleteFriendRequest();
    	  
    	  //ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
    	  
    	  
	}
}
