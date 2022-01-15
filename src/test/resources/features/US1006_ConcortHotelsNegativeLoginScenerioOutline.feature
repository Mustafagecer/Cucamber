@background
Feature: US1006 concort hotels sayfasinda farkli kullanici adlari ile negative test

  @CH @negativeScnerios @list

  Scenario Outline: Farkli kullanici isimleri ile negative test

    Given kullanici "CHQAUrl" sayfasina gider
    Then CH login linkine tiklar
    And CH username kutusuna "<wrongUserName>" yazar
    And CH password kutusuna "<wrongUserPassword>" yazar
    And CH login butonuna basar
    Then giris yapilmadigini test eder
    And sayfayi kapatir


    Examples:
    |wrongUserName|wrongUserPassword|
    |Manager5     |	Manager5!   |
    |Manager6     |	Manager6!   |
    |Manager7     |	Manager7!   |
    |Manager8     |	Manager8!   |
    |manager      |	Manager1!   |
