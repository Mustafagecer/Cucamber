@Paralel1
Feature: Feature:US1011 kullanici dogru bilgilerle sayfaya girebilmeli

  @CH1
  Scenario: TC17 positive login testi
    Given kullanici "CHQAUrl" sayfasina gider
    Then CH login linkine tiklar
    And CH username kutusuna "manager" yazar
    And CH password kutusuna "Manager1!" yazar
    And CH login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir