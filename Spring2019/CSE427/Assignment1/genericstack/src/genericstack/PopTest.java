package genericstack;

import static org.junit.Assert.*;

import org.junit.Test;

public class PopTest {

	@Test
	public void testPop() {
		GenericStack<Integer> g=new GenericStack<Integer>();
		g.push(5);
		g.push(10);
		g.pop();
		Integer result=5;
		assertEquals(result,g.peek());
	}

}
