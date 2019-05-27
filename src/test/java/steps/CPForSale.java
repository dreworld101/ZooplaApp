package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import framework.base.BasePage;

import static org.junit.Assert.assertEquals;

public class CPForSale {

    @When("User hover mouseover commercial and click {string} on the drop down list")
    public void userHoverMouseoverCommercialAndClickOnTheDropDownList(String arg0) {
        BasePage.setCPForsaleCommLnk();
        BasePage.setCPForsaleCommPropertyForSale();
    }

    //@When("^User hover mouseover the \"([^\"]*)\"$")
    //public void userHoverMouseOnThe(String arg0) {
       // BasePage.setCPForsaleCommLnk();
    //}

   // @And("Select uk {string}")
    //public void selectUk(String arg0) {
       // BasePage.setCPForsaleCommPropertyForSale();
    //}

    @And("click on the property types drop down button")
    public void clickOnThePropertyTypesDropDownButton() {
        BasePage.setCPForeSalePropertyType();
    }

    @And("click on the units drop down button")
    public void clickOnTheUnitsDropDownButton() {
        BasePage.setCPForSaleUnits();
    }

    @And("click on the min unit size drop down button")
    public void clickOnTheMinUnitSizeDropDownButton() {
        BasePage.setCPForSaleMinUnitSize();
    }

    @And("click on the max unit size drop down button")
    public void clickOnTheMaxUnitSizeDropDownButton() {
        BasePage.setCPForSaleMaxUnitSize();
    }

    @And("click on the min price drop down button")
    public void clickOnTheMinPriceDropDownButton() {
        BasePage.setCPForSaleMinPrice();
    }

    @And("click on the max price drop down button")
    public void clickOnTheMaxPriceDropDownButton() {
        BasePage.setCPForSaleMaxPrice();
    }

    @And("click on the advance search option drop down button")
    public void clickOnTheAdvanceSearchOptionDropDownButton() {
        BasePage.setCPForSaleAdvanceOptions();
    }
    @And("click on the distance from location drop down button")
    public void clickOnTheDistanceFromLocationDropDownButton() {
        BasePage.setCPForSaleDistanceLocation();

    }

    @And("click on the added drop down button")
    public void clickOnTheAddedDropDownButton() {
        BasePage.setCPForSaleAdded();
    }

    @And("click on the sort by drop down button")
    public void clickOnTheSortByDropDownButton() {
        BasePage.setCPForSaleSortBy();
    }

    @And("Enters {string}, {string}, {string}, {string}, {string}, {string}")
    public void enters(String propertytype, String units, String minunitsize, String maxunitsize, String minprice, String maxprice) {
        BasePage.setCPForeSalePropertyType(propertytype);
        BasePage.setCPForSaleUnits(units);
        BasePage.setCPForSaleMinUnitSize(minunitsize);
        BasePage.setCPForSaleMaxUnitSize(maxunitsize);
        //BasePage.setCPForSaleMinUnitSizeSqMetre(minunitsizesqm);
        //BasePage.setCPForSaleMaxUnitSizeSqMetre(maxunitsizesqm);
        BasePage.setCPForSaleMinPrice(minprice);
        BasePage.setCPForSaleMaxPrice(maxprice);
    }
    @And("Enters {string}, {string}, {string}, {string}, {string}, {string} in square metres")
    public void entersInSquareMetres(String propertytype, String units, String minunitsizesqm, String maxunitsizesqm, String minprice, String maxprice) {
        BasePage.setCPForeSalePropertyType(propertytype);
        BasePage.setCPForSaleUnits(units);
        BasePage.setCPForSaleMinUnitSizeSqMetre(minunitsizesqm);
        BasePage.setCPForSaleMaxUnitSizeSqMetre(maxunitsizesqm);
        BasePage.setCPForSaleMinPrice(minprice);
        BasePage.setCPForSaleMaxPrice(maxprice);
    }

    @And("Enters {string}, {string}, {string}, {string}")
    public void enters(String distancelocation, String added, String sortby, String keywords) {
        BasePage.setCPForSaleDistanceLocation(distancelocation);
        BasePage.setCPForSaleAdded(added);
        BasePage.setCPForSaleSortBy(sortby);
        BasePage.setCPForSaleKeywords(keywords);
    }

    @And("Select check boxes to only show property for sale")
    public void selectCheckBoxesToOnlyShowPropertyForSale() {
        BasePage.setCPForSaleInclude();
        BasePage.setCPForSaleOnlyPro();
    }

    @And("Select check boxes to only show business for sale")
    public void selectCheckBoxesToOnlyShowBusinessForSale() {
        BasePage.setCPForSaleInclude();
        BasePage.setCPForSaleOnlyBuz();
    }

}
