package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LandingPage;
import pages.Register;
import pages.SignInPage;


import java.time.Clock;

import static org.junit.Assert.assertEquals;
import static pages.Register.getRegistrationSuccessfulMessage;

public class CreateAccount {

    @And("^Click on the \"([^\"]*)\" link$")
    public void clickOnTheLink(String arg0) {
        Register.setRegisterTab();

    }
    @Then("The page displays property status")
    public void thePageDisplaysPropertyStatus() {
        String result = Register.getAboutMe();
        System.out.println(Register.getAboutMe());
        assertEquals(result, Register.getAboutMe());
    }

    @And("Clicks yes on both marketing option links and click the {string}")
    public void clicksYesOnBothMarketingOptionLinksAndClickThe(String arg0) {
        Register.setReceivePropertyNews();
        Register.setReceiveZooplaOffer();
        Register.setRegisterSubmit();
    }

    @Then("The page displays registration successful")
    public void thePageDisplaysRegistrationSuccessful() {
            String header = Register.getRegistrationSuccessfulMessage();
            System.out.println(Register.getRegistrationSuccessfulMessage());
            assertEquals(header, Register.getRegistrationSuccessfulMessage());
        }


    @Then("Clicks no on both marketing option links and click the {string}")
    public void clicksNoOnBothMarketingOptionLinksAndClickThe(String arg0) {
        Register.setDeclinepropertyNews();
        Register.setDeclineZooplaOffer();
        Register.setRegisterSubmit();
    }

    @And("Submit the form with the following details {string}, {string}, {string}")
    public void submitTheFormWithTheFollowingDetails(String RegisterEmail, String RegistrationPassword, String AboutMe) {
        Register.setRegisterEmail(RegisterEmail);
        Register.setRegistrationPassword(RegistrationPassword);
        Register.setAboutMe(AboutMe);
    }

    @And("^Enters \"([^\"]*)\", \"([^\"]*)\" and click on about me drop down$")
    public void entersAndClickOnAboutMeDropDown(String RegisterEmail, String RegistrationPassword) {
        Register.setRegisterEmail(RegisterEmail);
        Register.setRegistrationPassword(RegistrationPassword);
        Register.setAboutMe();
    }



}
