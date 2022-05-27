package pages;

import com.sun.javafx.scene.traversal.Direction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FavouritePage extends PageBase {
    public FavouritePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

   @AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewSearchBox")
   MobileElement productSearch2;
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/etACBSearchBox")
    MobileElement productSearch;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView[1]")
    MobileElement productResults;

    @AndroidFindBy(id ="com.pozitron.hepsiburada:id/content_wrapper")
    MobileElement productListScreenClick;

   // @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout")
    //MobileElement productClick,productSelectClick;
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup")
    MobileElement productImage1;

    /*@AndroidFindBy(id="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout")
    MobileElement productImage1;
*/
   @AndroidFindBy(id="com.pozitron.hepsiburada:id/fl_toolbar_user_account_menu")
           MobileElement productImage5;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.LinearLayout") // tekrar bak
    MobileElement productClick ;

    @AndroidFindBy(id="com.pozitron.hepsiburada:id/product_detail_favourites")
    MobileElement productDetailsFavourite,productDetailScreen;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/leftIcon")
    MobileElement productDetailCloseIcon;
    @AndroidFindBy(id="com.pozitron.hepsiburada:id/appBarLayout")
    MobileElement productListBackAgain;




       public void setProductSearch2(){click(productSearch2);}

       public void setProductSearch(String product){sendText(productSearch, product);}

       public void setProductResults() {click(productResults);}


       public void setProductListScreenClick() {click(productListScreenClick);}



       public void setProductSwipe() {
         swipeByElements(productImage1,productImage5);

       }

        public void setProductClick(){click(productClick);}

       public void setProductDetailScreen(){
        displayed(productDetailScreen);}

      public void setProductDetailsFavourite()
        {click(productDetailsFavourite);}

      public void setProductDetailCloseIcon(){
        click(productDetailCloseIcon);
    }

      public void setProductListBackAgain(){
        displayed(productListBackAgain);
    }

   /* public void setProductSelectClick(){
           click(productSelectClick);
    }
*/

    }