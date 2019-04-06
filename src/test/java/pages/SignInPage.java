package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static framework.base.DriverContext.driver;

public class SignInPage {

    private static By signin_page_email_address_txt = By.id("signin_email");

    private static By signin_page_password_txt = By.id("signin_password");

    private static By signin_page_remember_me_chk = By.xpath("//*[@id=\"signin_form\"]/fieldset/ol/li[3]/label");

    private static By signin_page_forgot_password_lnk = By.id("signin_forgotten_password");

    private static By signin_page_submit_button = By.id("signin_submit");

    private static By signin_page_signin_with_facebook_lnk = By.xpath("//*[@id=\"signin_register\"]/div[2]/div[2]/a[1]/span[2]");

    private static By signin_page_signin_with_google_lnk = By.id("google-plus-signin");

    private static By signin_page_submit_forgot_password_btn = By.name("action:forgot_password");
    private static By signin_page_forgot_email_txt = By.id("f_email");
    private static By singin_page_we_have_sent_your_email_text_field_hdr =By.cssSelector("#content > h1");

    public static void setEmail(String Email){

        driver.findElement(signin_page_email_address_txt).sendKeys(Email);
    }

    public static void setPassword (String Password){

        driver.findElement(signin_page_password_txt).sendKeys(Password);
    }

    public static void setRememberMe (){

        driver.findElement(signin_page_remember_me_chk).click();
    }

    public static void setForgotPassword(){

        driver.findElement(signin_page_forgot_password_lnk).click();
    }

    public static void setSubmit(){

        driver.findElement(signin_page_submit_button).click();

    }

    public static void setSigninWithFacebook (){

        driver.findElement(signin_page_signin_with_facebook_lnk).click();
    }

    public static void setSigninWithGoogle (){

        driver.findElement(signin_page_signin_with_google_lnk).click();
    }

    public static void setSubmitForgotPassword (){
        driver.findElement(signin_page_submit_forgot_password_btn).click();
    }
    public static void setForgotEmail(String ForgotEmail){
        driver.findElement(signin_page_forgot_email_txt).sendKeys(ForgotEmail);
    }

    public static String getWeHaveSentAnEmailTextField() {
        WebElement header = driver.findElement(singin_page_we_have_sent_your_email_text_field_hdr);
        return header.getText();

    }
}
