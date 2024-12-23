Feature: Product

  Scenario: Verify product link is clikable or Not
    Given Launch Chrome Browser
    And Open Flipkart site
    When Search the product
    And Click on the searched product
    Then Verify the product has been open or not through title
