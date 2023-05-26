package testNG;

import org.testng.annotations.Test;

public class PriorityAttributePractice {

	//Priority attribute practice
	@Test(priority = 0)
	public void first() {
		System.out.println("first");
	}
	@Test(priority = 1)
	public void second() {
		System.out.println("second");
	}
	@Test(priority = 2)
	public void third() {
		System.out.println("third");
	}
	@Test(priority = 3)
	public void four() {
		System.out.println("four");
	}
	@Test(priority = 4)
	public void five() {
		System.out.println("five");
	}
	@Test(priority = 5)
	public void six() {
		System.out.println("six");
	}
}
