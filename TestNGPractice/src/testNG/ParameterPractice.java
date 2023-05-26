package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPractice {
 
	@Test
	@Parameters("Name")
	public void enterName(String name) {
		System.out.println("My Name is " + name);
	}
}
