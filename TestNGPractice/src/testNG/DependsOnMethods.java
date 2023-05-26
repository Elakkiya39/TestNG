package testNG;

import org.testng.annotations.Test;

public class DependsOnMethods {

	//DependsOnMethods practice
	@Test
	public void highschool() {
		System.out.println("highschool passed");
	}
	@Test(dependsOnMethods = "highschool")
	public void higherSecSchool() {
		System.out.println("higherSecSchool passed");
	}
	@Test(dependsOnMethods = "higherSecSchool")
	public void college() {
		System.out.println("college passed");
	}
}
