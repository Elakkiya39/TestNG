package testNG;

import org.testng.annotations.Test;

public class AlwaysRunPractice {
	// DependsOnMethods alwaysRun practice
	@Test(timeOut = 2000)
	public void highschool() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("highschool passed");
	}

	@Test(dependsOnMethods = "highschool", alwaysRun = true)
	public void higherSecSchool() throws InterruptedException {
		System.out.println("higherSecSchool passed");
	}

	@Test(dependsOnMethods = "higherSecSchool", alwaysRun = true)
	public void college() {
		System.out.println("college passed");
	}
}
