import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestSTUDENT {
	private Plot plot2, plot4, plot5;

	@BeforeEach
	void setUp() throws Exception {
		plot2 = new Plot(1, 1, 1, 1);
		plot4 = new Plot(1, 1, 2, 2);
		plot5 = new Plot(3, 4, 4, 3);
	}

	@AfterEach
	void tearDown() throws Exception {
		plot5 = plot2 = plot4 = null;
	}

	@Test
	void testOverlaps() {
		assertTrue(plot2.overlaps(plot4));
	
	}

	@Test
	void testEncompasses() {
		assertTrue(plot2.encompasses(plot4));
	}

	@Test
	void testToString() {
		assertEquals("3,4,4,3",plot5.toString());
		assertEquals("1,1,1,1",plot2.toString());	
		
	}

}
