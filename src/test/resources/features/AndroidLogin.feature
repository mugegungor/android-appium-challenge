Feature: Kullanıcı ana sayfa login girişi

  @login @smoke
  Scenario Outline: Başarılı Login
    Given Android uygulaması başlatılır
    Given HepsiBurada Ana sayfası ekranı gösterilir
    Given "5000" wait milliseconds
    Given Ana sayfada gösterilen kampanya popup kapatılır.
    When Ana sayfada profil iconuna tıklanılır
    Then Giriş yap butonuna tıklanılır
    Given Login ekranı sayfası açılır
    Then "companytestt1@gmail.com" Email bilgisi girilir
    Then Email Login butonuna tıklanılır
    Then "123123Tek*"Password bilgisi girilir
    Then Password Login butonuna tıklanılır
    And Success popup ekranı gösterilir
    And Gosterilen popup mesajı "Hoş geldin Company  test. Keyifli alışverişler dileriz." kontrol edilir
    And Success popup tamam butonuyla kapatılır
    Then Profile ekranından close buton ile çıkış yapılır
    Then Ana sayfaya ekranına döndüğü kontrol edilir
    Then Uygulama kapatılır



@products-search
Scenario Outline: Ana sayfa ürün arama
  Given Android uygulaması başlatılır
  Given HepsiBurada Ana sayfası ekranı gösterilir
  Given "7000" wait milliseconds
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


  @favourite-products
  Scenario Outline: Favori ürün kontrolü
    Given Android uygulaması başlatılır
    Given HepsiBurada Ana sayfası ekranı gösterilir
    Given "<milliseconds>" wait milliseconds
    Given Ana sayfada gösterilen kampanya popup kapatılır.
    When Ana sayfada profil iconuna tıklanılır
    Then Giriş yap butonuna tıklanılır
    Given Login ekranı sayfası açılır
    Then <email> Email bilgisi girilir
    Then Email Login butonuna tıklanılır
    Then <password>Password bilgisi girilir
    Then Password Login butonuna tıklanılır
    And Success popup ekranı gösterilir
    And Gosterilen popup mesajı "Hoş geldin Company  test. Keyifli alışverişler dileriz." kontrol edilir
    And Success popup tamam butonuyla kapatılır
    Then Profile ekranından close buton ile çıkış yapılır
    Then Ana sayfaya ekranına döndüğü kontrol edilir
    Given Ana sayfada search box inputuna tıklanır
    Given Search alanına <products> yazılır
    Then Aramaya uygun ürün seçenekleri listelenir ve seçim yapılır
    Then Ürünler listelenir
    Then Kategoriye uygun ürünler listelenir
    Then Listedeki beşinci ürüne tıklanılır
    Then Ürün detay sayfası açılır
    Then Ürün favoriye eklenir
    Then Close butonuna tıklanılır ve ürün listesine geri dönülür
    Then Listelerim ekranına tıklanılır
    Then Listerimden favorilerim butonuna tıklanılır
    Given "<milliseconds>" wait milliseconds
    Then Favori ürün kontrol edilir
    Then Favori ürün fiyatı<price>kontrol edilir
    Then Uygulama kapatılır
    Examples:
      | milliseconds | email                     | password     | products   | price    |
      | 8000         | "companytestt1@gmail.com" | "123123Tek*" | "deterjan" | "174,90" |








