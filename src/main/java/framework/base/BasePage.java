package framework.base;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static framework.base.DriverContext.driver;

public class BasePage extends Base {


    private static By utility_my_enquiries_navigation_menu = By.cssSelector("a[href='/my-enquiries/']");
    private static By utility_view_my_home_navigation_menu = By.cssSelector("a[href='/property/track']");
    private static By utility_sign_in_navigation_menu = By.cssSelector("a[href='/signin/']");

    private static By utility_rent_to_rent_lnk = By.id("search-tabs-to-rent");
    private static By utility_rent_search_location_txt = By.id("search-input-location");
    private static By utility_rent_min_price_drp = By.id("rent_price_min_per_month");
    private static By utility_rent_max_price_drp = By.id("rent_price_max_per_month");
    private static By utility_rent_property_type_drp = By.xpath("//*[@id=\"property_type\"]");
    private static By utility_rent_bedrooms_drp = By.id("beds_min");
    private static By utility_rent_search_submit_btn = By.id("search-submit");
    private static By utility_rent_properties_for_sale_in_this_area_header = By.xpath("//*[@id=\"content\"]/div[1]/h1");
    private static By utility_search_home_postcode_txt = By.id("postcode");
    private static By utility_search_home_locate_address_btn = By.className("ui-button-primary");
    private static By utility_search_home_select_address_submit_btn = By.xpath("//*[@id=\"lookup\"]/button");
    private static By utility_search_home_select_address_drp = By.id("address-list");
    private static By utility_search_home_relationship_to_this_home_header = By.className("pdp-dialog__content-title");
    private static By utility_search_home_relationship_to_this_home_btn = By.xpath("//*[@id=\"property-relationship\"]/div/label[1]");
    private static By utility_search_home_my_property_details_header = By.xpath("//*[@id=\"main-content\"]/div[1]/div/div[1]/div/p");
    private static By utility_sale_property_for_sale_in_this_area_header = By.xpath("//*[@id=\"content\"]/div[1]/h1");
    private static By utility_sale_min_price_drp = By.id("forsale_price_min");
    private static By utility_sale_max_price_drp = By.id("forsale_price_max");
    //Commercial property variables
    private static By utility_commercial_lnk = By.xpath("//*[@id=\"mn-commercial\"]/a");
    private static By utility_commercial_search_for_properties_header = By.className("h-subheader");
    private static By utility_commercial_uk_commercial_property_for_sale_lnk = By.xpath("//*[@id=\"mn-commercial\"]/div/ul/li[2]/a");
    private static By utility_commercial_property_for_sale_search_location_txt = By.id("search-input-location");
    private static By utility_commercial_property_for_sale_property_type_drp = By.id("property_type");
    //private static By utility_commercial_property_for_sale_units_drp =By.cssSelector("a[href='/floor_area_units/']");
    private static By utility_commercial_property_for_sale_units_drp =By.xpath("//*[@id=\"floor_area_units\"]");

    private static By utility_commercial_property_for_sale_min_unit_size_drp = By.id("floor_area_min_sq_feet");
    private static By utility_commercial_property_for_sale_max_unit_size_drp = By.id("floor_area_max_sq_feet");

    private static By utility_commercial_property_for_sale_min_unit_size_sq_metres_drp =By.id("floor_area_min_sq_metres");
    private static By utility_commercial_property_for_sale_max_unit_size_sq_metres_drp =By.id("floor_area_min_sq_metres");

    private static By utility_commercial_property_for_sale_min_price_drp = By.id("forsale_price_min");
    private static By utility_commercial_property_for_sale_max_price_drp = By.id("forsale_price_max");
    private static By utility_commercial_property_for_sale_search_submit_button = By.id("search-submit");
    private static By utility_commercial_property_for_sale_advance_search_option_lnk = By.cssSelector("a[href=\'#\']");
    private static By utility_commercial_property_for_sale_advance_search_option_header = By.id("search-ol-radius");
    private static By utility_commercial_property_for_sale_distance_from_location_drp = By.id("radius");
    private static By utility_commercial_property_for_sale_added_drp = By.id("added");
    private static By utility_commercial_property_for_sale_sort_by_drp = By.xpath("//*[@id=\"sort_by\"]");
    private static By utility_commercial_property_for_sale_keywords_txt = By.id("keywords");
    private static By utility_commercial_property_for_sale_include_chk = By.xpath("//*[@id=\"landing-page\"]/div[1]/form/div[2]/div[2]/div/fieldset[2]/div/div[1]/span[2]/label");
    private static By utility_commercial_property_for_sale_only_show_prop_chk = By.xpath("//*[@id=\"landing-page\"]/div[1]/form/div[2]/div[2]/div/fieldset[3]/div/div[1]/span[2]/label");
    private static By utility_commercial_property_for_sale_only_show_buz_chk = By.xpath("//*[@id=\"landing-page\"]/div[1]/form/div[2]/div[2]/div/fieldset[3]/div/div[2]/span[2]/label");
    private static By utility_commercial_property_type_for_sale_header = By.xpath("//*[@id=\"content\"]/div[1]/h1");


    public static void setMyEnquiries(){

        driver.findElement(utility_my_enquiries_navigation_menu).click();
    }
    public static void setViewMyHome(){

        driver.findElement(utility_view_my_home_navigation_menu).click();
    }
    public static void setSignIn(){

        driver.findElement(utility_sign_in_navigation_menu).click();
    }
    public static void setToRent()
    {
        driver.findElement(utility_rent_to_rent_lnk).click();
    }
    public static void setSearchLocation(String SearchLocation){
        driver.findElement(utility_rent_search_location_txt).sendKeys(SearchLocation);
    }
    public static void setMinPrice()
    {
        driver.findElement(utility_rent_min_price_drp).click();
    }
    public static void setMaxPrice(){

        driver.findElement(utility_rent_max_price_drp).click();
    }
    public static void setPropertyType(){
        //new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(utility_rent_property_type_drp)).click();
        driver.findElement(utility_rent_property_type_drp).click();
    }
    public static void setBedrooms(){

        driver.findElement(utility_rent_bedrooms_drp).click();
    }
    public static void setSearchSubmit(){
        driver.findElement(utility_rent_search_submit_btn).click();
    }


    public static String getPropertiesToRentInTheLocation() {
        WebElement header = driver.findElement(utility_rent_properties_for_sale_in_this_area_header);
        return header.getText();
    }

    public static String getMinPricesDropDownList() {
        WebElement header_1 = driver.findElement(utility_rent_min_price_drp);
        return header_1.getText();
    }
    public static String getMaxPricesDropDownList(){
        WebElement header_2 = driver.findElement(utility_rent_max_price_drp);
        return header_2.getText();
    }
    public static String getPropertyTypeDropDownList(){
        WebElement header_3 = driver.findElement(utility_rent_property_type_drp);
        return header_3.getText();
    }
    public static String getBedroomsDropDownList(){
        WebElement header_4 = driver.findElement(utility_rent_bedrooms_drp);
        return header_4.getText();
    }
    public static void setPostcode(String postcode){
        driver.findElement(utility_search_home_postcode_txt).sendKeys(postcode);
    }
    public static void setLocateAddress(){

        driver.findElement(utility_search_home_locate_address_btn).click();
    }
    public static void setSelectAddressDropDown(){
        driver.findElement(utility_search_home_select_address_drp).click();
    }
    public static void setSelectAddressSubmitBtn(){
        driver.findElement(utility_search_home_select_address_submit_btn).click();
    }
    public static String getSelectAddressDropDown(){
        WebElement header = driver.findElement(utility_search_home_select_address_drp);
        return header.getText();
    }
    public static String getRelationshipToThisHomeHeader(){
        WebElement header = driver.findElement(utility_search_home_relationship_to_this_home_header);
        return header.getText();
    }

    public static void setMinPrice(String minprice) {
        //new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(utility_rent_min_price_drp));
        driver.findElement(utility_rent_min_price_drp).sendKeys(minprice);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void setMaxPrice(String maxprice) {
        driver.findElement(utility_rent_max_price_drp).sendKeys(maxprice);
    }

    public static void setPropertyType(String propertytype) {
        driver.findElement(utility_rent_property_type_drp).sendKeys(propertytype);
    }

    public static void setBedrooms(String bedrooms) {
        driver.findElement(utility_rent_bedrooms_drp).sendKeys(bedrooms);
    }

    public static void setSelectAddressSubmitBtn(String address) {
        driver.findElement(utility_search_home_select_address_drp).sendKeys(address);
    }
    public static void setRelationshipHomeStatus(){
        driver.findElement(utility_search_home_relationship_to_this_home_btn).click();
    }
    public static String getMyHomePropertyDetails(){
        WebElement header = driver.findElement(utility_search_home_my_property_details_header);
        return header.getText();
    }
    public static String getPropertyForSaleInTheLocation(){
        WebElement header = driver.findElement(utility_sale_property_for_sale_in_this_area_header);
        return header.getText();
    }
    public static void setForSaleMinPrice(){

        driver.findElement(utility_sale_min_price_drp).click();
    }
    public static void setForSaleMaxPrice(){

        driver.findElement(utility_sale_max_price_drp).click();
    }
    public static void setForSaleMinPrice(String minprice){
        driver.findElement(utility_sale_min_price_drp).sendKeys(minprice);
    }
    public static void setForSaleMaxPrice(String maxPrice){

        driver.findElement(utility_sale_max_price_drp).sendKeys(maxPrice);
    }
    //commercial property methods
    public static void setCPForsaleCommLnk() {
        //new WebDriverWait(driver, 120).until(ExpectedConditions.presenceOfElementLocated(utility_commercial_lnk));
        Actions action = new Actions(driver);
        WebElement over = driver.findElement(utility_commercial_lnk);
        action.moveToElement(over).perform();
        //action.moveToElement(over).moveToElement(driver.findElement(utility_commercial_uk_commercial_property_for_sale_lnk)).click().build().perform();
    }
    public static void setCPForsaleCommPropertyForSale() {
        new WebDriverWait(driver, 120).until(ExpectedConditions.presenceOfElementLocated(utility_commercial_uk_commercial_property_for_sale_lnk)).click();

        //driver.findElement(utility_commercial_uk_commercial_property_for_sale_lnk).click();
        // String commPropertyForSaleLink="https://www.zoopla.co.uk/for-sale/commercial/";
        // driver.navigate().to(commPropertyForSaleLink);
    }
    public static void setCPForSaleSarchLocation(){
        driver.findElement(utility_commercial_property_for_sale_search_location_txt).sendKeys();
    }
    public static void setCPForeSalePropertyType(){
        driver.findElement(utility_commercial_property_for_sale_property_type_drp).click();
    }
    public static void setCPForSaleUnits(){
        driver.findElement(utility_commercial_property_for_sale_units_drp).click();
    }
    public static void setCPForSaleMinUnitSize(){
        driver.findElement(utility_commercial_property_for_sale_min_unit_size_drp).click();
    }

    public static void setCPForSaleMaxUnitSize(){
        driver.findElement(utility_commercial_property_for_sale_max_unit_size_drp).click();
    }

    public static void setCPForSaleMinPrice(){
        driver.findElement(utility_commercial_property_for_sale_min_price_drp).click();
    }

    public static void setCPForSaleMaxPrice(){
        driver.findElement(utility_commercial_property_for_sale_max_price_drp).click();
    }

    public static void setCPForeSalePropertyType(String propertytype){
        driver.findElement(utility_commercial_property_for_sale_property_type_drp).sendKeys(propertytype);
    }
    public static void setCPForSaleUnits(String units){
        driver.findElement(utility_commercial_property_for_sale_units_drp).sendKeys(units);

        //WebElement option = driver.findElement(utility_commercial_property_for_sale_units_drp);
        //option.sendKeys(units);
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("arguments[0].sendKeys='units';", option);


    }
    public static void setCPForSaleMinUnitSize(String minunitsize){
        driver.findElement(utility_commercial_property_for_sale_min_unit_size_drp).sendKeys(minunitsize);
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("window.scrollBy(0,400)", "");
        //WebElement units = driver.findElement(utility_commercial_property_for_sale_min_unit_size_drp);
        //units.sendKeys(minunitsize);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].sendKeys='minunitsize';", units);

        //new WebDriverWait(driver,120).until(ExpectedConditions.presenceOfElementLocated(utility_commercial_property_for_sale_min_unit_size_drp)).sendKeys(minunitsize);

    }

    public static void setCPForSaleMaxUnitSize(String maxunitsize){
        driver.findElement(utility_commercial_property_for_sale_max_unit_size_drp).sendKeys(maxunitsize);
    }
    public static void setCPForSaleMinUnitSizeSqMetre(String minunitsizesqm){
        driver.findElement(utility_commercial_property_for_sale_min_unit_size_sq_metres_drp).sendKeys(minunitsizesqm);
    }
    public static void setCPForSaleMaxUnitSizeSqMetre(String maxunitsizesqm){
        driver.findElement(utility_commercial_property_for_sale_max_unit_size_sq_metres_drp).sendKeys(maxunitsizesqm);
    }


    public static void setCPForSaleMinPrice(String minprice){
        driver.findElement(utility_commercial_property_for_sale_min_price_drp).sendKeys(minprice);
    }

    public static void setCPForSaleMaxPrice(String maxprice){
        driver.findElement(utility_commercial_property_for_sale_max_price_drp).sendKeys(maxprice);
    }

    public static void setCPForSaleSubmit(){
        driver.findElement(utility_commercial_property_for_sale_search_submit_button).click();
    }

    public static void setCPForSaleAdvanceOptions(){
        driver.findElement(utility_commercial_property_for_sale_advance_search_option_lnk).click();
    }

    public static void setCPForSaleDistanceLocation(){
        driver.findElement(utility_commercial_property_for_sale_distance_from_location_drp).click();
    }

    public static void setCPForSaleAdded(){
        driver.findElement(utility_commercial_property_for_sale_added_drp).click();
    }
    public static void setCPForSaleSortBy(){
        driver.findElement(utility_commercial_property_for_sale_sort_by_drp).click();
    }

    public static void setCPForSaleDistanceLocation(String distancelocation){
        driver.findElement(utility_commercial_property_for_sale_distance_from_location_drp).sendKeys(distancelocation);
    }

    public static void setCPForSaleAdded(String added){
        driver.findElement(utility_commercial_property_for_sale_added_drp).sendKeys(added);
    }
    public static void setCPForSaleSortBy(String sortby){
        driver.findElement(utility_commercial_property_for_sale_sort_by_drp).sendKeys(sortby);
    }
    public static void setCPForSaleKeywords(String keywords){
        driver.findElement(utility_commercial_property_for_sale_keywords_txt).sendKeys(keywords);
    }
    public static void setCPForSaleInclude(){
        driver.findElement(utility_commercial_property_for_sale_include_chk).click();
    }
    public static void setCPForSaleOnlyPro(){
        driver.findElement(utility_commercial_property_for_sale_only_show_prop_chk).click();
    }
    public static void setCPForSaleOnlyBuz(){
        driver.findElement(utility_commercial_property_for_sale_only_show_buz_chk).click();
    }
    public static String getCPSearchForProHeader(){
        WebElement header_5 = driver.findElement(utility_commercial_search_for_properties_header);
        return header_5.getText();

    }
    public static String getCPForeSalePropertyType(){
        WebElement header_6 = driver.findElement(utility_commercial_property_for_sale_property_type_drp);
        return header_6.getText();

    }
    public static String getCPForSaleUnits(){
        WebElement header_7 = driver.findElement(utility_commercial_property_for_sale_units_drp);
        return header_7.getText();
    }
    public static String getCPForSaleMinUnitSize(){
        WebElement header_8 = driver.findElement(utility_commercial_property_for_sale_min_unit_size_drp);
        return header_8.getText();
    }

    public static String getCPForSaleMaxUnitSize(){
        WebElement header_9 = driver.findElement(utility_commercial_property_for_sale_max_unit_size_drp);
        return header_9.getText();
    }

    public static String getCPForSaleMinPrice(){
        WebElement header_10 = driver.findElement(utility_commercial_property_for_sale_min_price_drp);
        return header_10.getText();
    }

    public static String getCPForSaleMaxPrice(){
        WebElement header_11 = driver.findElement(utility_commercial_property_for_sale_max_price_drp);
        return header_11.getText();
    }
    public static String getCPForSaleAdvanceOptions(){
        WebElement header_12 = driver.findElement(utility_commercial_property_for_sale_advance_search_option_header);
        return header_12.getText();
    }

    public static String getCPForSaleDistanceLocation(){
        WebElement header_13 = driver.findElement(utility_commercial_property_for_sale_distance_from_location_drp);
        return header_13.getText();
    }

    public static String getCPForSaleAdded(){
        WebElement header_14 = driver.findElement(utility_commercial_property_for_sale_added_drp);
        return header_14.getText();
    }
    public static String getCPForSaleSortBy(){
        WebElement header_15 = driver.findElement(utility_commercial_property_for_sale_sort_by_drp);
        return header_15.getText();
    }
    public static String getCPForSalePropertyTypeForSale(){
        WebElement header_16 = driver.findElement(utility_commercial_property_type_for_sale_header);
        return header_16.getText();

    }
}
