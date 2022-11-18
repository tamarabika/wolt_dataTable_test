Feature: WorkContact page

  @WorkContact
  Scenario: Valid Registration Form Information with Header
    Given I am on Work contact page
    When I fill out a valid registration form header

      | testDT@yahoo.com | testDT | 0-1 | Germany |

    And I click on Contact us button
    Then I see Work contact form page
      """
      How to Wolt at Work
      """

  @WorkContactFaker
  Scenario: Valid Registration Form Information (Faker)
    Given I am on Work contact page
    When I fill out a registration form header
    And I click on Contact us button
    Then I see Work contact form page
      """
      How to Wolt at Work
      """

  @WorkContactWithFaker
  Scenario: Valid Registration Form Information with Faker
    Given I am on Work contact page
    When I fill out a registration form header with Faker
    And I click on Contact us button
    Then I see Work contact form page
      """
      How to Wolt at Work
      """
