package genericstack;

import static org.junit.Assert.*;

import org.junit.Test;


public class PushTest {

	@Test
	public void testPush() {
		GenericStack<Integer> g=new GenericStack<Integer>();
		Integer varnull=null;
		Integer varnotnull=5555;
		Integer varnotnull2=-10000;
		Integer varnotnull3=0;
		
		g.push(-10000);
		g.push(varnotnull );
		
		//input space partitioning for positive values
		Integer result=5555;
		assertEquals(result,g.peek());
		
		
		//input space partitioning for negative values
		g.pop();
		Integer result1=-10000;
		assertEquals(result1,g.peek());
		
		
		//input space partitioning for null value
		g.pop();
		g.push(varnull);
		Integer result2=null;
		assertEquals(result2,g.peek());
		
		
		//input space partitioning for  value 0
		g.push(varnotnull3);
		Integer result3=0;
		assertEquals(result3,g.peek());
	
	
	
	
	}


}
