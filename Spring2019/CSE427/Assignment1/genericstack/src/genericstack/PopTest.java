package genericstack;

import static org.junit.Assert.*;

import org.junit.Test;

public class PopTest {

	@Test
	public void testPop() {
		GenericStack<Integer> g=new GenericStack<Integer>();
	
		
		
		Integer varnull=null;
		Integer varnotnull=5555;
		Integer varnotnull2=-10000;
		Integer varnotnull3=0;
		
		
		g.push(varnotnull );
		g.push(-10000);
		
		
		//input space partitioning for positive values
		g.pop();
		Integer result=5555;
		assertEquals(result,g.peek());
		
		
		//input space partitioning for negative values
		g.pop();
		g.push(varnotnull2);
		g.push(varnotnull3);
		g.pop();
		
		Integer result1=-10000;
		assertEquals(result1,g.peek());
		
		
		//input space partitioning for null value
		g.pop();
		g.pop();
		Integer result2=null;
		assertEquals(result2,g.peek());
		
		
		//input space partitioning for  value 0
		g.push(varnotnull3);
		g.push(varnotnull);
		g.pop();
		Integer result3=0;
		assertEquals(result3,g.peek());
	
		
		
	}

}
