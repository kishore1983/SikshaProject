package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pompages.LandingPage;

public class Steps {
	WebDriver driver = Hooks.driver;
	LandingPage lp = PageFactory.initElements(driver, LandingPage.class);
	@Given("^the user visits the application$")
	public void the_user_visits_the_application() {
		lp.loadPage();
	}
		
	@When("^the page loads properly$")
	public void the_page_loads_properly() {
		lp.verifyPage();
//		lp.waitForAngular();
//		System.out.println("Angular are initialized");
	}

	@Then("^user can verify broken links$")
	public void user_can_verify_broken_links() {
		lp.checkBrokenLinks();
	}

}
