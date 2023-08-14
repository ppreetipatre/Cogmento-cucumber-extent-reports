Feature: Test cogmento application

  Scenario: Test login functionality
    Given user is on login page
    When user enter valid username and password

  Scenario: Test home page functionality
    Given user is on homepage
    Then user validate Hpmepage and url
    And click on contact button

  #Scenario Outline: Test contact page functionality
    #Then click on create button
    #And user enter "<Firstname>" and "<lastname>" and "<Email>" and "<status>"
    #And click on save button
    #And Takescreenshot
#
    #Examples: 
      #| Firstname | lastname   | Email          | status  |
      #| aa        |  bb        | cc@gmail.com   | Active  |
      #| bb        |  cc        | pp@gmail.com   | New     |
      #| dd        |  ee        | oo@gmail.com   | On Hold |
      #| ee        |  ff        | lc@gmail.com   | Active  |
#
  #Scenario: Test delete user functionality
    #Then user click on delete button
