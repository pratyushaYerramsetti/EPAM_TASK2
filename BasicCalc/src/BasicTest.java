import static org.junit.Assert.*;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
import BasicCalc.Basic;

public class BasicTest {
	Basic op=new Basic();

	@Test
	public void add_test() {
		assertEquals("Wrong Answer add()",10,op.add(5,5));
		assertEquals("Wrong Answer add()",200,op.add(100,100));
		assertEquals("Wrong Answer add()",100,op.add(85,15));
	}
	public void divide_test(){
		assertEquals("Wrong Answer divide()",100,op.divide(1000,10));
		assertEquals("Wrong Answer divide()",12,op.divide(144,12));
		
	}
	public void multiply_test(){
		assertEquals("Wrong Answer multiply()",100,op.multiply(10,10));
		assertEquals("Wrong Answer multiply()",144,op.multiply(12,12));
		assertEquals("Wrong Answer multiply()",625,op.multiply(25,25));

	}
	

}
