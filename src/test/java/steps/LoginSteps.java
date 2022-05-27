package steps;

import base.TestBase;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Homepage;
import pages.LoginPage;
import pages.PageBase;

import java.net.MalformedURLException;

public class LoginSteps extends TestBase {
    Homepage homepage;
    LoginPage loginPage;
    PageBase pageBase;


    @Given("Android uygulaması başlatılır")
    public void androidUygulamasıBaşlatılır() throws MalformedURLException{
        androidSetUp();

    }

    @Given("HepsiBurada Ana sayfası ekranı gösterilir")
    public void anaSayfaEkranıGösterilir() throws InterruptedException {
        Thread.sleep(20000);
        homepage = new Homepage(driver);
        homepage.setIconHepsiburada();



    }
    @Given("^\"([^\"]*)\" wait milliseconds")
    public void waitMilliseconds(long milliseconds) {
        pageBase = new PageBase(driver);
        pageBase.waitByMilliSeconds(milliseconds);
    }

    @Given("Ana sayfada gösterilen kampanya popup kapatılır.")
    public void anaSayfadaGösterilenKampanyaPopupKapatılır() throws InterruptedException {
        Thread.sleep(10000);
        homepage.setHomepagePopupClose();
    }
    @Given("Ana sayfada profil iconuna tıklanılır")
    public void anaSayfadaProfilIconunaTıklanılır() throws InterruptedException {
        homepage.setIconProfile();

    }



    @Then("Giriş yap butonuna tıklanılır")
    public void girişYapButonunaTıklanılır() {
        loginPage = new LoginPage(driver);
        loginPage.setLoginButton();
    }



    @Given("Login ekranı sayfası açılır")
    public void loginEkranıSayfasıAçılır() throws InterruptedException {
        loginPage.setTabInput();
    }

    @Then("{string} Email bilgisi girilir")
    public void bilgisiGirilir(String email)
    {
        loginPage.setEmailText(email);
    }

    @Then("Email Login butonuna tıklanılır")
    public void emailLoginButonunaTıklanılır() {
        loginPage.setEmailLoginButton();
    }

    @Then("{string}Password bilgisi girilir")
    public void passwordBilgisiGirilir(String password)throws InterruptedException {
        loginPage.setTabInput2();
        loginPage.setPasswordSend(password);
    }

    @Then("Password Login butonuna tıklanılır")
    public void passwordLoginButonunaTıklanılır() {
        loginPage.setPasswordLoginButton();
    }

    @Then("Success popup ekranı gösterilir")
    public void successPopupEkranıGösterilir() {
        loginPage.setPopupScreen();
    }


    @Then("Gosterilen popup mesajı {string} kontrol edilir")
    public void gelenPopupMesajınıKontrolEt(String popupText) {
        loginPage.setSuccessPopupText(popupText);
    }


    @And("Success popup tamam butonuyla kapatılır")
    public void successPopupTamamButonuylaKapatılır() {
        loginPage.setIconOk();
    }

    @Then("Profile ekranından close buton ile çıkış yapılır")
    public void profileEkranındanCloseButonIleÇıkışYapılır() {
        loginPage.setCloseIcon();
    }
    @Then("Ana sayfaya ekranına döndüğü kontrol edilir")
    public void anaSayfayaEkranınaDöndüğüKontrolEdilir() {
        loginPage.setIsDisplayedHomepage();
    }
    @Then("Uygulama kapatılır")
    public void uygulamaKapatılır() {
        tearDown();
    }



}
