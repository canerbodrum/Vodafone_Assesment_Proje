Feature: Add to Cart selected phone and Login without Vodafone Account

  Background:
    Given Navigate to Vodafone
    Then  User should be Nagivated Vodafone Home Page

  Scenario:   Test
    Given Click on the element in HomePage
      | Alışveriş |
    When Click on the element in HomePage
      | Telefonlar |
    And Click on the element in HomePage
      | GalaxyA24 |
    And Click on the element in DialogContent
      | siyah |
    And Click on the element in DialogContent
      | sepeteEkle |
    And Navigate to Login Page And Click Without Vodafone Account
    And User sending the keys in Dialog Content
      |number2|443034800|
    Then Accept reqiured data and Click Login

#    Üyelik bilgilerimle giriş yapınca
#    itemler display olmadığı için üyeliksiz girişi denedim
#    testlerimin sonucunda üyeliksiz giriş yapılamıyor
#    sepete ürün eklenemiyor
#    hooks'a bağımlılık ekledim fakat sepete eklemediği için çalışmıyor

