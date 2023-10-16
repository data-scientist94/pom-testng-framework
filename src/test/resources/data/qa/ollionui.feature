Feature: Ollion project


#  Background: Login into application
#    Given Navigate to the Home Page DataShop
#    And Click on last login button
#    And Enter User Name
#    And Enter password
#    And Click on login button
#    And Click on eCQM from top navigation bar
#    And Select a report from eCQM Home Page



   @Regression
  Scenario: Get the edited
    Given user landed on the eCQM Home Page.
    When user click on a report
    Then user should be navigated to the registries page.
