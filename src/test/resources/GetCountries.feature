Feature:
Given I have API headers
When I get countries
Then I verify that list countries is availbale in response

  Scenario: When I get countries , I verify that vietnam exists in the response
    Given I have API headers
      | x-rapidapi-host | restcountries-v1.p.rapidapi.com                    |
      | x-rapidapi-key  | bf96595661mshdcb8f0e0407e3f7p10671djsn30e45bc5d48a |
    When I get countries
    Then I verify Vietnam exists in the response