Feature: US1008 negatif login testi

  # verilen 3 farkli username ve password ile negatif login testi yapin
@hello
  Scenario Outline: TC15

    Given  kullanici "qdUrl" anasayfaya gider

    Then login linkine tiklar

    And username olarak "<username>" girer

    And  password olarak "<password>" girer

    And  login butonuna basar

    Then giris yapilamadigini test eder

    And Sayfayi kapatir

    Examples:

    |username            |password             |
    |qdGecerliUsername   | qdGecersizUsername  |
    |qdGecerliUsername   | qdGecersizUsername  |
