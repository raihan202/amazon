@regression @smoke @SKYW-15 @E2E
Feature: Amazon Career functionality

Scenario: Amazon Career functionality

Given open amazon Homepage
When Click On careers
And Search for Jobs
And Search for location
And Click on search
Then Job Search Result should Appear