package testNG;

import org.testng.annotations.Test;

public class PrintMultipleTimes {

	@Test(invocationCount = 4)
	public void name() {
		System.out.println("My name is : Elakkiya.");
	}

}
