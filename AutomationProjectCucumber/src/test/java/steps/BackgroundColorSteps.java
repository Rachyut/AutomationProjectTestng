package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BackgroundColorPage;
import pages.TestBase;

public class BackgroundColorSteps extends TestBase{
	BackgroundColorPage backgroundcolorpage;

	@Before
	public void beforeRun() {
		init();
		backgroundcolorpage = PageFactory.initElements(driver,BackgroundColorPage.class);
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Given("User is on the set SkyBlue Background button")
		public void user_is_on_the_set_SkyBlue_Background_button() {
		
	}
	
	@When("User clicks on the set SkyBlue Background button")
	public void user_clicks_on_the_set_SkyBlue_Background_button() {
		backgroundcolorpage.setBackgroundColorBlue();
	}

	@Then("The background color should change to sky blue")
	public void the_background_color_should_change_to_sky_blue() {
		
		
    // Assert.assertTrue("Background colour not changing to blue",);
	}
	

	@Given("User is on the set SkyWhite Background button")
		public void user_is_on_the_set_SkyWhite_Background_button() {
		
	}
	
	@When("User clicks on the set SkyWhite Background button")
	public void user_clicks_on_the_set_SkyWhite_Background_button() {
		backgroundcolorpage.setBackgroundColorWhite();
	}

	@Then("The background color should change to White")
	public void the_background_color_should_change_to_White() {
		
     // Assert.assertTrue("Background colour not changing to blue",);
	}
	
	
	
}
