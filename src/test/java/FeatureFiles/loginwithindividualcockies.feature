Feature: Go to Vodafone website

#  Bypass UI with coockies
#  sms otp yi bypass ettim
#  fakat 1 saatlik accesstoken alabiliyorum

  Scenario: Login as Individual Account
    Given Navigate to Vodafone
    And   User should be Nagivated Vodafone Home Page
    When  Login With individual account
    Then  Verify Cridential user Should Be Login


  #  Hattım yeni olduğu için üyelik bilgilerimle giriş yaptığımda
  #  faturama ek çıkan hiçbir cihaz display olmuyor
  #  O yüzden ayrı senaryolarda testlerimi gerçekleştirdim
