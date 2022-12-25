package com.teknasyon.steps;

import com.teknasyon.base.TestBase;
import com.teknasyon.pages.ProductDetailPage;
import io.cucumber.java.en.And;

public class ProductDetailStepsDefs extends TestBase {

    ProductDetailPage productDetailPage = new ProductDetailPage(driver, context);
    @And("Detayına gidilen ürün favoriye eklenir ve favoriye eklenen ürünün ismi kaydedilir.")
    public void detayınaGidilenÜrünFavoriyeEklenir() {
        productDetailPage.clickFavoriteButton();
        productDetailPage.saveProductNameIntoContext();
        productDetailPage.saveProductPriceIntoContext();
    }

    @And("Geri butonuna tıklanır ve ürün listesi sayfası görülür.")
    public void geriButonunaTıklanırVeÜrünListesiSayfasıGörülür() {
        productDetailPage.clickBackButton();
    }
}
