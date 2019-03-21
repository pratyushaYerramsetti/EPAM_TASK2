package Interest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Interest.Interest;

import junit.framework.TestCase;

public class InterestTest extends TestCase {
	Interest it = new Interest();
	@Test
	public void testSimpleInterest() {
		assertEquals("found fault in simpleInterest()",10.0,it.simpleInterest(10,10,10));
		assertEquals("found fault in simpleInterest()",7.0,it.simpleInterest(15,12,4));
		
		
	}

	public void testCompoundInterest() {
		assertEquals("found fault in compoundInterest()",180000.0,it.compoundInterest(45000,2,100));
		assertEquals("found fault in compundInterest()",40000.0,it.compoundInterest(10000,2,100));
		
	}

}
