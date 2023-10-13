package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ForgotPasswordPage;
import pages.LoginOrSignUpPage;

public class testClass1 {
	public static void main(String[] args) {
  	  System.setProperty("webdriver.chrome.driver","D:\\Excel sheet\\chromedriver-win64\\chromedriver.exe");
  	  WebDriver driver = new ChromeDriver();
  	  driver.get("https://www.facebook.com/");
  	  
  	LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
  	loginOrSignUpPage.clickForgotPasswordLink();
  	  
  	ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
  	
  	String msg = forgotPasswordPage.getForgotMessage();
  	if (msg.equals("Please enter your email address or mobile number to search for your account."))
  	{
  		System.out.println("Pass");
  	}
  	else {
  		System.out.println("Fail");
  		
  	}
  	
  	forgotPasswordPage.sendPleaseEnterEmailButton();
  	forgotPasswordPage.clickCancelButton();
  	
}
}
