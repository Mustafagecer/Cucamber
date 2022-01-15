Feature: US1001 amazon arama




  @amazon @nutella
  Scenario: TC01 amazon nutella arama
    When kullanici amazon sayfasina gider
    And nutella icin arama yapar
    Then sonucun nutella icerdigini test eder
    And sayfayi kapatir

  @amazon @java
  Scenario: TC02 amazon java arama
    When kullanici amazon sayfasina gider
    And java icin arama yapar
    Then sonucun java icerdigini test eder
    And sayfayi kapatir

  @amazon @Ipad
  Scenario: TC03 amazon java arama
    When kullanici amazon sayfasina gider
    And Ipad icin arama yapar
    Then sonucun Ipad icerdigini test eder
    And sayfayi kapatir
