Feature: Login

  Scenario: Verify the fuctionality of login
    Given Launch Browser
    And Open SauceDemo site
    When Login with Your Valid Credentials
    And Verify the URL
    Then Logout
