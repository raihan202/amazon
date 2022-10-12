@regression @smoke 
Feature: Amazon Help Functionality

Scenario: Amazon Help Functionality
	Given open amazon Homepage 
	When Click On Help
	And Click On Track Your Package
	And Click on Play vidoes
	And Close The Videos
	Then Help and Customer Services Page  Should Appear