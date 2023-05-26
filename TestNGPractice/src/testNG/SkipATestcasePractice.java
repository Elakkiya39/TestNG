package testNG;

import org.testng.annotations.Test;

public class SkipATestcasePractice {

	//enabled attributr practice
	@Test(priority = 0)
	public void startBike() {
		System.out.println("startBike");
	}

	@Test(priority = 1)
	public void firstGear() {
		System.out.println("firstGear");
	}

	@Test(priority = 2, enabled = false )
	public void secondGear() {
		System.out.println("secondGear");
	}

}
