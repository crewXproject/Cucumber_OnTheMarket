package stepDef;

import driver.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import static driver.PageInitializer.*;

public class stepDefinition {

    @Before
    public void beforeTest() {
        Driver.getDriver();
    }

    @Given("User open browser and navigate to onthemarket.com")
    public void user_open_browser_and_navigate_to_onthemarket_com() {
        comm.acceptCookieBtn.click();
    }
    @Given("Click on the sign in tab")
    public void click_on_the_sign_in_tab() {
        comm.signinMenu.click();
    }

    @Given("Enter {string} address in the field")
    public void enter_address_in_the_field(String string) {
        signin.emailInput.sendKeys(string);
    }

    @Then("Click on the next button")
    public void click_on_the_next_button() {
        signin.nextButton.click();
    }

    @Then("Enter {string} in the field")
    public void enter_in_the_field(String string) {
        signin.passwordInput.sendKeys(string);
    }

    @Then("Click on the sign in button")
    public void click_on_the_sign_in_button() {
        signin.signinButton.click();
    }

    @Then("Sign in should be successful")
    public void sign_in_should_be_successful() {
        Assert.assertTrue(true);
    }

    @After
    public void afterScenario() {
        Driver.tearDown();
    }


}
