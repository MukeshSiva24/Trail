package StepDefinition;

import CommonMethod.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	BaseClass base=BaseClass.getInstance();
	
	@Before
	public void browserLaunch() {
		base.browserLaunch();
	}
	
	@After
	public void browserClose() throws InterruptedException {
		Thread.sleep(3000);
//		base.browserClose();
	}

}
