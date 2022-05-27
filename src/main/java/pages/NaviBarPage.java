package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NaviBarPage extends PageBase{

    public NaviBarPage (AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Listelerim']/android.widget.FrameLayout/android.widget.ImageView")
    MobileElement listelerimNavBarClick;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='predifined-box Beğendiklerim 2 ürün']/android.widget.Image[1]")
    MobileElement favouriteListClick;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc='123'])[1]")

    MobileElement favouriteProductCheck;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup")
    MobileElement favouriteProductPriceCheck;


    public void  setListelerimNavBarClick(){
        click(listelerimNavBarClick);
    }
    public void setFavouriteListClick(){
        click(favouriteListClick);
    }
    public void setFavouriteProductCheck() throws InterruptedException {
        Thread.sleep(20000);
        displayed(favouriteProductCheck);
    }

        public void setFavouriteProductPriceCheck(String price){
            String favouritePriceCheck = getAttribute(favouriteProductPriceCheck,"text");
            assertEqual(favouritePriceCheck, price);

    }




}
