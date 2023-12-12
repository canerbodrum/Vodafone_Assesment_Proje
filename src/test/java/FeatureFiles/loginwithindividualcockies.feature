Feature: Go to Vodafone website

#  Bypass UI with coockies
#  sms otp yi bypass ettim
Background:
  Given Navigate to Vodafone
  And   User should be Nagivated Vodafone Home Page
  When  Login With individual account
  Then  Verify Cridential user Should Be Login
  Scenario: Login as Individual Account
    Given Navigate to HomePage
    When Click on the element in HomePage
      | Alışveriş |
    Then Click on the element in HomePage
      | Telefonlar |


  #  Hattım yeni olduğu için üyelik bilgilerimle giriş yaptığımda
  #  faturama ek çıkan hiçbir cihaz display olmuyor
  #  O yüzden ayrı senaryolarda testlerimi gerçekleştirdim
