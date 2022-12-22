Feature: HepsiBurada Ürün Listeleme

@favourite-product @regression
  Scenario Outline: Ana sayfa ürün arama
    Given Android uygulaması başlatılır
    Given HepsiBurada Ana sayfası ekranı gösterilir
    Given Ana sayfada gösterilen kampanya popup kapatılır.
    Given Ana sayfada search box inputuna tıklanır
    Given Search alanına <products> yazılır
    Then Aramaya uygun ürün seçenekleri listelenir ve seçim yapılır
    Then Ürünler listelenir
    Then Kategoriye uygun ürünler listelenir
    Then Listedeki beşinci ürüne tıklanılır
    Then Ürün detay sayfası açılır
    Then Ürün favoriye eklenir
    Then Close butonuna tıklanılır ve ürün listesine geri dönülür
    Then Uygulama kapatılır
    Examples:
      | products   |
      | "deterjan" |


