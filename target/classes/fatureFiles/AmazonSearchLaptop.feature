@regression @smoke @SKYW-15 @E2E
Feature: Amazon Search functionality

Scenario: Search for laptop

Given open amazon Homepage
When search for laptop
Then items list should be laptop related product 
