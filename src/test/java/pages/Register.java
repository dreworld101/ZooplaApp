package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static framework.base.DriverContext.driver;

public class Register {
    private static By register_sign_up_tab_lnk =By.id("signin_register_tab_register");
    private static By register_email_address_txt = By.id("register_email");
    private static By register_password_txt = By.id("register_password");
    private static By register_about_me_drp = By.id("sender_property_status");
    private static By register_receive_property_news_radio_btn = By.xpath("//*[@id=\"register_form\"]/fieldset/ol/li[4]/fieldset/div[1]/div[1]/label");
    private static By register_receive_zoopla_offer_radio_btn = By.xpath("//*[@id=\"register_form\"]/fieldset/ol/li[4]/fieldset/div[2]/div[1]/label");
    private static By register_submit_btn = By.id("register_submit");
    private static By register_registration_successful_txt_field_hrd = By.xpath("//*[@id=\"fancybox-content\"]/div/div/h1");
    private static By register_decline_property_news_radio_btn = By.xpath("//*[@id=\"register_form\"]/fieldset/ol/li[4]/fieldset/div[1]/div[2]/label");
    private static By register_decline_zoopla_offer_radio_btn = By.xpath("//*[@id=\"register_form\"]/fieldset/ol/li[4]/fieldset/div[2]/div[2]/label");
    public static void setRegisterTab(){

        driver.findElement(register_sign_up_tab_lnk).click();
    }

    public static void setRegisterEmail(String RegisterEmail){

        driver.findElement(register_email_address_txt).sendKeys(RegisterEmail);
    }
    public static void setRegistrationPassword(String RegistrationPassword){

        driver.findElement(register_password_txt).sendKeys(RegistrationPassword);
    }
    public static void setAboutMe(String AboutMe){
        //     new WebDriverWait(driver,300).until(ExpectedConditions.presenceOfElementLocated(register_about_me_drp));
        driver.findElement(register_about_me_drp).sendKeys(AboutMe);
    }
    public static void setReceivePropertyNews(){

            driver.findElement(register_receive_property_news_radio_btn).click();
    }
    public static void setReceiveZooplaOffer(){

        driver.findElement(register_receive_zoopla_offer_radio_btn).click();
    }
    public static void setDeclinepropertyNews(){
        driver.findElement(register_decline_property_news_radio_btn).click();
    }
    public static void setDeclineZooplaOffer()
    {
        driver.findElement(register_decline_zoopla_offer_radio_btn).click();
    }
    public static void setRegisterSubmit(){

        driver.findElement(register_submit_btn).click();
    }
    public static String getRegistrationSuccessfulMessage(){
        WebElement header = driver.findElement(register_registration_successful_txt_field_hrd);
        return header.getText();
    }

    public static String getAboutMe() {
        WebElement options = driver.findElement(register_about_me_drp);
        return options.getText();
    }

    public static void setAboutMe() {
        driver.findElement(register_about_me_drp).click();
    }
}
