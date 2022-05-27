package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FavouritePage;

public class ProductsListSteps extends TestBase{
    FavouritePage favouritePage;


    @Given("Ana sayfada search box inputuna tıklanır")
    public void anaSayfadaSearchBoxInputunaTıklanır() {
        favouritePage = new FavouritePage(driver);
        favouritePage.setProductSearch2();

    }

    @Given("Search alanına {string} yazılır")
    public void searchAlanınaYazılır(String products) {
        favouritePage.setProductSearch(products);
    }


    @Then("Aramaya uygun ürün seçenekleri listelenir ve seçim yapılır")
    public void aramayaUygunÜrünSeçenekleriListelenirVeSecimYapilir() {
        favouritePage.setProductResults();
    }

    @Then("Ürünler listelenir")
    public void ürünlerListelenir() throws InterruptedException {
        Thread.sleep(10000);
        favouritePage.setProductListScreenClick();
    }

    @Then("Kategoriye uygun ürünler listelenir")
    public void kategoriyeUygunÜrünlerListelenir() {
        favouritePage.setProductSwipe();
    }

    @Then("Listedeki beşinci ürüne tıklanılır")
    public void listedekiBeşinciÜrüneTıklanılır() {
        favouritePage.setProductClick();
    }


    @Then("Ürün detay sayfası açılır")
    public void ürünDetaySayfasıAçılır() throws InterruptedException {
        Thread.sleep(10000);
        favouritePage.setProductDetailScreen();
    }

    @Then("Ürün favoriye eklenir")
    public void ürünFavoriyeEklenir() {
        favouritePage.setProductDetailsFavourite();
    }

    @Then("Close butonuna tıklanılır ve ürün listesine geri dönülür")
    public void closeButonunaTıklanılırVeÜrünListesineGeriDönülür() {
        favouritePage.setProductDetailCloseIcon();
        favouritePage.setProductListBackAgain();
    }



}
