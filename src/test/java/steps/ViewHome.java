package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.base.BasePage;

import static org.junit.Assert.assertEquals;

public class ViewHome {
    @When("^User click on the \"([^\"]*)\" button$")
    public void userClickOnTheButton(String arg0) {
        BasePage.setViewMyHome();
    }

    @And("^Enters \"([^\"]*)\" and click on locate address$")
    public void entersAndClickOnLocateAddress(String postcode) {
        BasePage.setPostcode(postcode);
        BasePage.setLocateAddress();

    }

    @And("click the select drop down button")
    public void clickTheSelectDropDownButton() {
        BasePage.setSelectAddressDropDown();

    }

    @Then("The page displays different addresses")
    public void thePageDisplaysDifferentAddresses() {
        String header = BasePage.getSelectAddressDropDown();
        System.out.println(BasePage.getSelectAddressDropDown());
        assertEquals(header, BasePage.getSelectAddressDropDown());
    }


    @And("^Select \"([^\"]*)\" and click on the select address submit button$")
    public void selectAndClickOnTheSelectAddressSubmitButton(String  address) {
        BasePage.setSelectAddressSubmitBtn(address);
        BasePage.setSelectAddressSubmitBtn();

    }

    @Then("The page displays select relationship to this home")
    public void thePageDisplaysSelectRelationshipToThisHome() {
        String header = BasePage.getRelationshipToThisHomeHeader();
        System.out.println(BasePage.getRelationshipToThisHomeHeader());
        assertEquals(header, BasePage.getRelationshipToThisHomeHeader());

    }

    @And("Select owner as relationship to this home")
    public void selectOwnerAsRelationshipToThisHome() {
        BasePage.setRelationshipHomeStatus();

    }

    @Then("My home property details are displayed")
    public void myHomePropertyDetailsAreDisplayed() {
        String header = BasePage.getMyHomePropertyDetails();
        System.out.println(BasePage.getMyHomePropertyDetails());
        assertEquals(header, BasePage.getMyHomePropertyDetails());
    }
}
