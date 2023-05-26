package testNG;

import org.testng.annotations.Test;

public class GroupingPractice {
	
	@Test(groups = {"apple"})
	public void apple1() {
		System.out.println("Apple");
	}
	@Test(groups = {"apple"})
	public void apple2() {
		System.out.println("Apple");
	}
	@Test(groups = {"banana"})
	public void banana1() {
		System.out.println("banana");
	}
	@Test(groups = {"banana"})
	public void banana2() {
		System.out.println("banana");
	}
	@Test(groups = {"orange"})
	public void orang2e1() {
		System.out.println("orange");
	}
	@Test(groups = {"orange"})
	public void orange2() {
		System.out.println("orange");
	}

}
