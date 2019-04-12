package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.base.BasePage;

import static org.junit.Assert.assertEquals;

public class ForSale {
    @When("^User enter post code in the \"([^\"]*)\"$")
    public void userEnterPostCodeInThe(String SearchLocation) {
        BasePage.setSearchLocation(SearchLocation);
    }

    @Then("The page displays properties for sale")
    public void thePageDisplaysPropertiesForSale() {
        String header = BasePage.getPropertyForSaleInTheLocation();
        System.out.println(BasePage.getPropertyForSaleInTheLocation());
        assertEquals(header, BasePage.getPropertyForSaleInTheLocation());

    }

    @When("User click on min price drop down button")
    public void userClickOnMinPriceDropDownButton() {
        BasePage.setForSaleMinPrice();
    }

    @When("User click max price drop down button")
    public void userClickMaxPriceDropDownButton() {
        BasePage.setForSaleMaxPrice();
    }

    @When("User click on property type drop down button")
    public void userClickOnPropertyTypeDropDownButton() {
        BasePage.setPropertyType();
        
    }

    @When("User click on bedrooms drop down button")
    public void userClickOnBedroomsDropDownButton() {
        BasePage.setBedrooms();
    }

    @And("^Enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void enter(String minprice, String maxprice, String propertytype, String bedrooms) {
        BasePage.setForSaleMinPrice(minprice);
        BasePage.setForSaleMaxPrice(maxprice);
        BasePage.setPropertyType(propertytype);
        BasePage.setBedrooms(bedrooms);

    }
}
