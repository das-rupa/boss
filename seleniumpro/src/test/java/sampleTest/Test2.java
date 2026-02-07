package sampleTest;

import org.testng.annotations.Test;

public class Test2 {

	@Test(groups = {"RegressionTest"})
	public void test3() {
		System.out.println("execute test3 mtd");
	}
	@Test(groups = {"smokeTest"})
	public void test4() {
		System.out.println("execute test4 mtd");
	}
	@Test
	public void test5() {
		System.out.println("execute test5 mtd");
	}
}
