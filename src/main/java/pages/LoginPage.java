package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends PageBase {
    public LoginPage(AppiumDriver appiumDriver) {super(appiumDriver);}


    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc='account_menu_button_1']/android.view.ViewGroup/android.widget.Button")
    MobileElement loginButton;


    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView")
    MobileElement tabInput;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='txtUserName']")
    MobileElement emailText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.widget.Button")
    MobileElement emailLoginButton;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView")
    MobileElement tabInput2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")
    MobileElement passwordSend;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.Button\n")
    MobileElement passwordLoginButton;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]")
    MobileElement viewScreen;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/parentPanel")
    MobileElement popupScreen;

    @AndroidFindBy(id = "android:id/message")
    MobileElement successPopupText;

 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    MobileElement iconOk;


    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/ivToolbarBack")
    MobileElement closeIcon;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/account_menu_button")
    MobileElement isDisplayedHomepage;




    public void setViewScreen() {
        click(viewScreen);}

    public void setTabInput() throws InterruptedException {
        Thread.sleep(5000);
        click(tabInput);}



    public void setEmailText(String email) {
        sendText(emailText, email);}

    public void setEmailLoginButton(){
        click(emailLoginButton);
    }
    public void setTabInput2() throws InterruptedException {

        Thread.sleep(5000);
        click(tabInput2);}

    public void setPasswordSend(String password){
        sendText(passwordSend, password);}
    public void setPasswordLoginButton(){
        click(passwordLoginButton);
    }




public void setLoginButton(){
      click(loginButton);
}

public void setPopupScreen(){click(popupScreen);}

public void setSuccessPopupText(String exepText){
        String successPopupAttr = getAttribute(successPopupText,"text");
        assertEqual(successPopupAttr, exepText);

}
public void setIconOk(){
        click(iconOk);
}
public void setCloseIcon(){
        click(closeIcon);
}
public void setIsDisplayedHomepage(){
        displayed(isDisplayedHomepage);
}













}
