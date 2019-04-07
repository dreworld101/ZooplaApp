package pages;


import framework.base.Base;
import framework.config.Settings;

import static framework.base.DriverContext.driver;

public class LandingPage extends Base {

    public static void lauchBaseUrl(){

       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.get(Settings.LiveBaseUrl);
    }
}
