package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.base.BasePage;
import org.apache.poi.hssf.record.PageBreakRecord;
import pages.LettingPage;

import static junit.framework.TestCase.assertEquals;

public class Rent {

    @When("^User click on the \"([^\"]*)\" link$")
    public void userClickOnTheLink(String arg0) {
        BasePage.setToRent();
    }


    @And("^Enter post code in the \"([^\"]*)\"$")
    public void enterPostCodeInThe(String SearchLocation) {
        BasePage.setSearchLocation(SearchLocation);

    }

    @And("^Enter the following details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void enterTheFollowingDetails(String minprice, String maxprice, String propertytype, String bedrooms) {
        BasePage.setMinPrice(minprice);
        BasePage.setMaxPrice(maxprice);
        BasePage.setPropertyType(propertytype);
        BasePage.setBedrooms(bedrooms);




    }

    @And("^click the \"([^\"]*)\"$")
    public void clickThe(String arg0) {
        BasePage.setSearchSubmit();

    }


    @Then("The page displays properties to rent")
    public void thePageDisplaysPropertiesToRent() {
        String header = BasePage.getPropertiesToRentInTheLocation();
        System.out.println(BasePage.getPropertiesToRentInTheLocation());
        assertEquals(header, BasePage.getPropertiesToRentInTheLocation());
    }


    @And("Click on min price drop down button")
    public void clickOnMinPriceDropDownButton() {
        BasePage.setMinPrice();

    }

    @And("Click on max price drop down button")
    public void clickOnMaxPriceDropDownButton() {
        BasePage.setMaxPrice();

    }

    @And("Click on property type drop down button")
    public void clickOnPropertyTypeDropDownButton() {
        BasePage.setPropertyType();
        String header_3 = BasePage.getPropertyTypeDropDownList();
        System.out.println(BasePage.getPropertyTypeDropDownList());
        assertEquals(header_3,BasePage.getPropertyTypeDropDownList());

    }

    @And("Click on bedrooms drop down button")
    public void clickOnBedroomsDropDownButton() {
        BasePage.setBedrooms();
    }



    @Then("^The page displays \"([^\"]*)\"$")
    public void thePageDisplays(String verification) {

        switch (verification) {
            case "min prices":
                String header_1 = BasePage.getMinPricesDropDownList();
                System.out.println(BasePage.getMinPricesDropDownList());
                assertEquals(header_1, BasePage.getMinPricesDropDownList());
                break;

            case "max prices":
                String header_2 = BasePage.getMaxPricesDropDownList();
                System.out.println(BasePage.getMaxPricesDropDownList());
                assertEquals(header_2, BasePage.getMaxPricesDropDownList());
                break;

            case "bedrooms":
                String header_4 = BasePage.getBedroomsDropDownList();
                System.out.println(BasePage.getBedroomsDropDownList());
                assertEquals(header_4, BasePage.getBedroomsDropDownList());
                break;

        }


}

}
