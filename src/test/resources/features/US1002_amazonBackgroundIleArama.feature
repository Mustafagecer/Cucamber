@background
Feature: US1002 amazon background ile arama


  Background: amazon sayfasina giris
    When kullanici amazon sayfasina gider

  Scenario: TC04 amazon nutella arama

    And nutella icin arama yapar
    Then sonucun nutella icerdigini test eder
    And sayfayi kapatir


  Scenario: TC05 amazon java arama

    And java icin arama yapar
    Then sonucun java icerdigini test eder
    And sayfayi kapatir


  Scenario: TC06 amazon java arama

    And Ipad icin arama yapar
    Then sonucun Ipad icerdigini test eder
    And sayfayi kapatir
