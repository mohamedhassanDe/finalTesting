@smoke
  Feature: Search Feature
    Scenario Outline: User can Search Using Product Name

        When I Enter Search Input <x>
        Then I Click Submit Btn
        Then Check Results <y>

      Examples:
        |x          |y|
        |"Book"     |"first"|
        |"SCI_FAITH"|"second"|