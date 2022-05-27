package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.annotations.Test;

public class Homepage extends PageBase {
    public Homepage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    @AndroidFindBy(id="com.pozitron.hepsiburada:id/image_message_of_day")
    MobileElement iconHepsiburada,homepagePopupClose;

    @AndroidFindBy(id="com.pozitron.hepsiburada:id/account_menu_button")
    MobileElement iconProfile;

    public void setIconHepsiburada(){
        displayed(iconHepsiburada);
    }
    public void setHomepagePopupClose(){click(homepagePopupClose);}
    public void setIconProfile() {
        click(iconProfile);
    }


}
