@Test=aspiration
Feature: Aspiration Products flows

  Background: Navigate to Aspiration 
    Given The User is on Aspiration Home Page

   @Test=SampleTest1
  Scenario Outline:1234-Verify Sign up from Get Aspiration
    
    When The User clicks on the Spend and Save
    Then There are 2 Products displayed
    When Clicking on Get Aspiration
    Then A modal dialog for sign up is displayed
    When Clicking on Get Aspiration Plus
    Then A modal dialog for sign up is displayed
    
