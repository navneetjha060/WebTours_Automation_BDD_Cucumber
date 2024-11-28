package Hooks;

import java.io.IOException;

import BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void setUp() throws IOException {

		System.out.println("======Application is Getting Launched=======");
		launchWebTours();
	}

	@After
	public void tearDown() {
		System.out.println("======Application is Closed=======");
		driver.quit();
	}

}
