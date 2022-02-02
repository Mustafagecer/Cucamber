Feature: US1012 Create a Customer with Employee profile

  @GMIBankAsEmployee
  Scenario: TC18 As an employee, I should be able to create a new customer
    Given kullanici GMIBank sayfasina gider
    And User clicks on Manage Customer under My Operation
    And User clicks on Create a new Customer
    And User enters all requires fields and click Save
    Then verify customer is created


