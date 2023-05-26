package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionPractice {
	String name = "Elakkiya";
	int age = 5;
	String location = "india";

	@Test
	public void checkEqual() {
		Assert.assertEquals(name, "elakkiya");
		Assert.assertEquals(location, "india");
		Assert.assertEquals(age, 5);
	}
}
