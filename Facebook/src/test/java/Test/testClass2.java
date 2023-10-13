package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.SignupForm;
import pages.CreateNewAccountPage;
import pages.LoginOrSignUpPage;

public class testClass2 {
	public static void main(String[] args) throws InterruptedException {
	  	  System.setProperty("webdriver.chrome.driver","D:\\Excel sheet\\chromedriver-win64\\chromedriver.exe");
	  	  WebDriver driver = new ChromeDriver();
	  	  driver.get("https://www.facebook.com/");
	  	  
	  	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	  	LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
	  	loginOrSignUpPage.clickCreateNewAccount();
	  	
	  	Thread.sleep(7000);
	  	CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(driver);
	  	createNewAccountPage.sendFirstName();
	  	createNewAccountPage.sendLastName("Ujawane");
	  	createNewAccountPage.sendMobileNumberOrEmailAddress("shrutimalviya");
	  	createNewAccountPage.sendNewPassword("shruti");
	  	createNewAccountPage.clickFemale();
	  	//createNewAccountPage.clickSignUpButton();
	  	
	  	SignupForm signupForm = new SignupForm(driver);
	  	signupForm.selectDayOfMonth();
	  	signupForm.selectMonthOfYear();
	  	signupForm.selectYear();
	  	
	  
	  	
	  	
	  	
	}
	
}