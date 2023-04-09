@smoke
Feature:F02_Login |User can login

  Scenario: user could login with valid email and password
    Given I navigate to Login Page
    Then I Enter Input "Email" "moohassan22@gmail.com"
    Then I Enter Input "Password" "mohamedhassan1"
    Then Check Inputt
    Then I  Click Btn Login
    Then check Successful state

  Scenario: User could login with invalid email and password
    Given I navigate to Login Page
    Then  I Enter Input "Email" "mohamedhassan15@gmail.com"
    Then I Enter Input "Password" "mohamedhassan1"
    Then I  Click Btn Login
    Then Check Failure State

