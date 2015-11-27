package ali.Package;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import day1.examples.FirstClass;
import day1.examples.FirstClass1;

public class Junit_AntTest {
	FirstClass myUnit1 = new FirstClass();
	FirstClass1 myUnit2 = new FirstClass1();
	@Test
	public void testConcatenate() {
		//fail("Not yet implemented");
		//FirstClass myUnit1 = new FirstClass();

        String result = myUnit1.concatenate("one", "two");

        assertEquals("onetwo", result);
	}
	@Test
	public void testConcatenate1() {
		//fail("Not yet implemented");
		//FirstClass myUnit1 = new FirstClass();

        String result = myUnit1.concatenate("one2", "two");

        assertEquals("one2two", result);
	}
	@Test
	public void testConcatenate2() {
		//fail("Not yet implemented");
		//FirstClass1 myUnit2 = new FirstClass1();

        String result = myUnit2.concatenate2("one", "two");

        assertEquals("onetwo", result);
	}
	@Test
	public void testConcatenate3() {
		//fail("Not yet implemented");
		//FirstClass1 myUnit2 = new FirstClass1();

        String result = myUnit2.concatenate3("one2", "two");

        assertEquals("one1two", result);
	}


}
