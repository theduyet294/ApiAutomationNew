#Author: TheDuyet

@ToolApi
Feature: Tool api test feature
  

  @HappyCase
  Scenario: Check response when send request successfully
  
    Given I have url and method
   | URL | Method|
   |https://simple-tool-rental-api.glitch.me/tools?category=ladders&results=3&available=true|GET|
    When I send request
    Then Response is returned status code
    And Response is returned response data

  
