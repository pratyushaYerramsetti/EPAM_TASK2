package Construction;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

public class ConstructionTest extends TestCase {
	Construction c = new Construction();
	public void testCost() {
		assertEquals("found error in cost()",15600000.0,c.cost(1, 13000));
		assertEquals("found error in cost()",19500000.0,c.cost(2, 13000));
		assertEquals("found error in cost()",23400000.0,c.cost(3, 13000));
		assertEquals("found error in cost()",32500000.0,c.cost(4, 13000));
		assertEquals("found error in cost()",27000000.0,c.cost(2, 18000));

	}

}
