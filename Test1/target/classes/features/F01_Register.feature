@smoke
  Feature: F01_Register |User can create new Account
    Scenario: User can register successfully when entering valid data
      Given I navigate to register page
      When I select Gender "Male"
      When I select Gender "Female"
      When I Enter "FirstName" "hassan"
      When I Enter "LastName" "Hassan"
      When I Enter "Email" "moohassan22@gmail.com"
      When I Enter "CompanyName" "Amit"
      When I Enter "Password" "mohamedhassan1"
      When I Enter "ConfirmPassword" "mohamedhassan1"
      Then Check Input
      When select checkbox "Newsletter"
      When I select from dropdown menu"Day" "3"
      When I select from dropdown menu"Month" "December"
      When I select from dropdown menu"Year" "2000"
      Then Check selected Date
      Then I Click Btn "RegesterBtn"
      Then Check the result

