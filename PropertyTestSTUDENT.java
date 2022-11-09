import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestSTUDENT {
	Property property1;

	@BeforeEach
	void setUp() throws Exception {
		property1 = new Property("Property Homes", "Rockville", 2500.00, "ME");
	}

	@AfterEach
	void tearDown() throws Exception {
		property1 = null;
	}


	@Test
	void testGetPlot() {
		assertEquals(0, property1.getPlot().getX());
		assertEquals(0, property1.getPlot().getY());
		assertEquals(1, property1.getPlot().getWidth());
		assertEquals(1, property1.getPlot().getDepth());
	}

	
	@Test
	void testGetPropertyName() {
		assertEquals("Property Homes", property1.getPropertyName());
	}


	@Test
	void testGetCity() {
		assertEquals("Rockville", property1.getCity());
	}

	
	@Test
	void testGetRentAmount() {
		assertEquals(2500.00, property1.getRentAmount());
	}

	@Test
	void testGetOwner() {
		assertEquals("ME",property1.getOwner());
		
	}

	@Test
	void testToString() {
		assertEquals("Property Homes,Rockville,ME,2500.0",property1.toString());	
	}

}
