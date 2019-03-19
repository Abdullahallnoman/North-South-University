package genericstack;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericStackTest {

	@Test
	public void testGenericStack() {
		GenericStack<Integer> g=new GenericStack<Integer>();
		Integer result=null;
		assertEquals(result,g.peek());
	}

}
