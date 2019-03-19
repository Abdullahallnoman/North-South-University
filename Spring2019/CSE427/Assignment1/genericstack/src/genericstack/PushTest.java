package genericstack;

import static org.junit.Assert.*;

import org.junit.Test;


public class PushTest {

	@Test
	public void testPush() {
		GenericStack<Integer> g=new GenericStack<Integer>();
		g.push(1);
		g.push(2);
		Integer result=2;
		assertEquals(result,g.peek());
	
	
	
	
	}


}
