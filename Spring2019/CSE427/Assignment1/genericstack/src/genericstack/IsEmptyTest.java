package genericstack;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsEmptyTest {

	@Test
	public void testIsEmpty() {
		GenericStack<Integer> g=new GenericStack<Integer>();
		g.push(100);
		g.pop();
		Integer result=null;
		assertEquals(result,g.peek());
	}

}
