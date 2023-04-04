package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

public class BackgroundColorPage {
	
	WebDriver driver;
	public BackgroundColorPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how=How.XPATH, using = "//button[text()='Set SkyBlue Background']")WebElement BackgroundColorBlue_Element; 
	@FindBy(how=How.XPATH, using = "//button[text()='Set White Background']")WebElement BackgroundColorWhite_Element; 
	
	public void setBackgroundColorBlue() {
		BackgroundColorBlue_Element.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	}
	
	public void setBackgroundColorWhite() {
		BackgroundColorWhite_Element.click(); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	}
	
	
}
