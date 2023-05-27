package testNG;

import org.testng.annotations.Test;

public class TimeOutPractice {

	@Test(timeOut = 2000)
	public void timeOut() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("TimeOut Practice");
	}

}
