Feature: US1006 gecersiz bilgilerle sayfaya girilemez

  Scenario: TC 11 gecerli username ve gecersiz password ile giris yapilamaz

    Given kullanici "qdUrl" anasayfaya gider
    Then  login linkine tiklar
    And username olarak "qdGecerliUsername" girer
    And password olarak "qdGecersizPassword" girer
    And  login butonuna basar


  Scenario: TC 12 gecersiz username ve gecerli password ile giris yapilamaz

    Given kullanici "qdUrl" anasayfaya gider
    Then  login linkine tiklar
    And username olarak "qdGecersizUsername" girer
    And password olarak "qdGecersliPassword" girer
    And  login butonuna basar

  Scenario: TC 13 gecersiz username ve gecersiz password ile giris yapilamaz

    Given kullanici "qdUrl" anasayfaya gider
    Then  login linkine tiklar
    And username olarak "qdGecersizUsername" girer
    And password olarak "qdGecerssizPassword" girer
    And  login butonuna basar
