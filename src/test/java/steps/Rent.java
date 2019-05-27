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

            case "search for commercial properties to let across the uk":
                String header_5 = BasePage.getCPSearchForProHeader();
                System.out.println(BasePage.getCPSearchForProHeader());
                assertEquals(header_5, BasePage.getCPSearchForProHeader());
                break;
            case "commercial property type":
                String header_6 = BasePage.getCPForeSalePropertyType();
                System.out.println(BasePage.getCPForeSalePropertyType());
                assertEquals(header_6, BasePage.getCPForeSalePropertyType());
                break;
            case "commercial units":
                String header_7 = BasePage.getCPForSaleUnits();
                System.out.println(BasePage.getCPForSaleUnits());
                assertEquals(header_7, BasePage.getCPForSaleUnits());
                break;
            case "commercial min unit size":
                String header_8 = BasePage.getCPForSaleMinUnitSize();
                System.out.println(BasePage.getCPForSaleMinUnitSize());
                assertEquals(header_8, BasePage.getCPForSaleMinUnitSize());
                break;
            case "commercial max unit size":
                String header_9 = BasePage.getCPForSaleMaxUnitSize();
                System.out.println(BasePage.getCPForSaleMaxUnitSize());
                assertEquals(header_9, BasePage.getCPForSaleMaxUnitSize());
                break;
            case "commercial min price":
                String header_10 = BasePage.getCPForSaleMinPrice();
                System.out.println(BasePage.getCPForSaleMinPrice());
                assertEquals(header_10, BasePage.getCPForSaleMinPrice());
                break;
            case "commercial max price":
                String header_11 = BasePage.getCPForSaleMaxPrice();
                System.out.println(BasePage.getCPForSaleMaxPrice());
                assertEquals(header_11, BasePage.getCPForSaleMaxPrice());
                break;
            case "commercial advance search option":
                String header_12 = BasePage.getCPForSaleAdvanceOptions();
                System.out.println(BasePage.getCPForSaleAdvanceOptions());
                assertEquals(header_12, BasePage.getCPForSaleAdvanceOptions());
                break;
            case "distance from location":
                String header_13 = BasePage.getCPForSaleDistanceLocation();
                System.out.println(BasePage.getCPForSaleDistanceLocation());
                assertEquals(header_13, BasePage.getCPForSaleDistanceLocation());
                break;
            case "added option":
                String header_14 = BasePage.getCPForSaleAdded();
                System.out.println(BasePage.getCPForSaleAdded());
                assertEquals(header_14, BasePage.getCPForSaleAdded());
                break;
            case "sort by option":
                String header_15 = BasePage.getCPForSaleSortBy();
                System.out.println(BasePage.getCPForSaleSortBy());
                assertEquals(header_15, BasePage.getCPForSaleSortBy());
                break;
            case "property type for sale in the location":
                String header_16 = BasePage.getCPForSalePropertyTypeForSale();
                System.out.println(BasePage.getCPForSalePropertyTypeForSale());
                assertEquals(header_16, BasePage.getCPForSalePropertyTypeForSale());
                break;

        }


}

}
