package upSkill.Utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {
	
	
	//@After
	public void afterActins(Scenario Scenario) throws Exception {
		
		SetUpDrivers.tearDownDriver();
		System.out.println("------Test complete,Browse closed");
	}

}
