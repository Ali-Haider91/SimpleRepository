package Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void test() {
		AddFunc af=new AddFunc();
			long x=af.Factorial(10);
			assertEquals(3628800,x);
			//System.out.println(x);
		
	}

}
