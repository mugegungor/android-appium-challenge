package steps;

import base.TestBase;
import io.cucumber.java.en.Then;
import pages.*;


public class NaviBarSteps extends TestBase {
    FavouritePage favouritePage;
    NaviBarPage naviBarPage;



    @Then("Listelerim ekranına tıklanılır")
    public void listelerimEkranınaTıklanılır() {
        naviBarPage = new NaviBarPage(driver);
        naviBarPage.setListelerimNavBarClick();
    }

    @Then("Listerimden favorilerim butonuna tıklanılır")
    public void listerimdenFavorilerimButonunaTıklanılır() throws InterruptedException {
        Thread.sleep(8000);
        naviBarPage.setFavouriteListClick();
    }

    @Then("Favori ürün kontrol edilir")
    public void favoriÜrünKontrolEdilir() throws InterruptedException {
        Thread.sleep(8000);
        naviBarPage.setFavouriteProductCheck();
    }

    @Then("Favori ürün fiyatı{string}kontrol edilir")
    public void favoriÜrünFiyatıKontrolEdilir(String price) {
        naviBarPage.setFavouriteProductPriceCheck(price);


    }
}
