package testNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExpectedExceptionAttribute {

	@Test(timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
	public void timeOut() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("expectedExceptions Practice");
	}
}
