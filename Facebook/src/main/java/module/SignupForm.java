package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupForm {
     
	    @FindBy (xpath = "//select[@aria-label='Day']")
	    private WebElement day;
	    
	    @FindBy (xpath = "//select[@name='birthday_month']")
	    private WebElement month ;
	    
	    @FindBy (xpath = "//select[@name='birthday_year']")
	    private WebElement  year;
	    
	    public SignupForm(WebDriver driver) {
	    	PageFactory.initElements(driver, this);
	    	
	    }
	     public void selectDayOfMonth() {
	    	 Select s = new Select(day);
	    	 s.selectByIndex(24);
	     }
	     
	     public void selectMonthOfYear() {
	    	 Select s = new Select(month);
	    	 s.selectByVisibleText("Jan");
	     }
	     
	     public void selectYear() {
	    	 Select s = new Select(year);
	    	 s.selectByValue("1995");
	     }
}
