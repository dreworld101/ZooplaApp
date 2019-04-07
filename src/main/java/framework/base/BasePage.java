package framework.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

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
}
