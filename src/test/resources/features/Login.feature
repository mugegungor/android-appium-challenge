Feature: Android Login

  @Android
  Scenario: Başarılı Login
    Then Anasayfadaki profil iconuna tıklanır
    Then Profil sayfası giriş yap butonuna tıklanır
    And Kullanıcı email "companytestt1@gmail.com" bilgisi girilir
    And Login sayfası kullanıcı ismi için giriş yap butonuna tıklanır
    And Kullanıcı password "123123Tek*" bilgisi girilir
    And Login sayfası şifre için giriş yap butonuna tıklanır
    Then Giriş yaptıktan sonra gelen pop-up textinin "Muge Unal" adına girildiği kontrol edilir

  @Android
  Scenario Outline: Basarisiz Login | Hatali Email Girilmesi
    Then Anasayfadaki profil iconuna tıklanır
    Then Profil sayfası giriş yap butonuna tıklanır
    And Kullanıcı email <email> bilgisi girilir
    And Login sayfası kullanıcı ismi için giriş yap butonuna tıklanır
    Then Başarısız login "E-posta adresi eksik veya hatalı." mesajı kontrol edilir
    Examples:
      | email                 |
      | "denemedeneme@gmail.com" |
      | "denemedeneme@gmail.com" |

  @Android
  Scenario Outline: Basarisiz Login | Hatali Sifre Girilmesi
    Then Anasayfadaki profil iconuna tıklanır
    Then Profil sayfası giriş yap butonuna tıklanır
    And Kullanıcı email "companytestt1@gmail.com" bilgisi girilir
    And Login sayfası kullanıcı ismi için giriş yap butonuna tıklanır
    And Kullanıcı password <password> bilgisi girilir
    And Login sayfası şifre için giriş yap butonuna tıklanır
    Then Başarısız login "Girdiğiniz şifre eksik veya hatalı." mesajı kontrol edilir
    Examples:
      | password   |
      | "123123Tek*" |
      | "123123Tek*" |
