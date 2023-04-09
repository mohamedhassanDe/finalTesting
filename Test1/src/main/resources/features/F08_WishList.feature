@smoke
  Feature: WishList Feature
    Scenario:heartBtn
      Given I Go to homePage Url
      Then I Click heartbtn from Item
      Then Check Success Message


    Scenario: wishList
      When I Click heartbtn from Item
      Then I Click on WishList Btn
      Then Check item list

