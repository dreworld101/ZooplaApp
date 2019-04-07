package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.base.BasePage;
import org.junit.Assert;
import pages.LandingPage;
import pages.SignInPage;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static pages.SignInPage.getWeHaveSentAnEmailTextField;

public class Account {
    @Given("^User is on the home page of \"([^\"]*)\"$")
    public void userIsOnTheHomePageOf(String arg0)  {
        LandingPage.lauchBaseUrl();

    }
    @When("^User click on the \"([^\"]*)\"$")
    public void userClickOnThe(String arg0) {
        BasePage.setSignIn();
        //SignInPage.setSignIn();
    }

    @And("^Enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void entersAnd(String Email, String Password) {
        SignInPage.setEmail(Email);
        SignInPage.setPassword(Password);
    }
    @And("^click on the \"([^\"]*)\"$")
    public void clickOnThe(String arg0) {

        SignInPage.setSubmit();
    }


    @Then("My zoopla account page is displayed")
    public void myZooplaAccountPageIsDisplayed() {
    }

    @And("Click on the {string} check box")
    public void clickOnTheCheckBox(String arg0) {
        SignInPage.setRememberMe();
    }
    @And("^Click on \"([^\"]*)\" link$")
    public void clickOnLink(String arg0) {
        SignInPage.setForgotPassword();
    }
    @And("^Enters \"([^\"]*)\"$")
    public void enters(String ForgotEmail) {
        SignInPage.setForgotEmail(ForgotEmail);
    }




    @And("Click on submit forgot password button")
    public void clickOnSubmitForgotPasswordButton() {
        SignInPage.setSubmitForgotPassword();
    }

    @Then("The page displayes we have sent an email to the address specified")
    public void thePageDisplayesWeHaveSentAnEmailToTheAddressSpecified() {
        String result = getWeHaveSentAnEmailTextField();
        System.out.println("The page displays " + getWeHaveSentAnEmailTextField ());
       assertEquals(result, getWeHaveSentAnEmailTextField());
    }


}
