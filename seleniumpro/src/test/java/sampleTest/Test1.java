package sampleTest;

import org.testng.annotations.Test;

public class Test1 {

	@Test(groups = {"smokeTestt","RegressionTest"})
	public void test() {
		System.out.println("execute THE test method");
	}
	@Test
	public void test1() {
		System.out.println("execute t test1 mtd");
	}
	
}
