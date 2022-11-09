import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTest {
	Property sample;
	ManagementCompany mg;
	

	@BeforeEach
	void setUp() throws Exception {
		mg = new ManagementCompany("DIEGO", "3000",9);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		mg = null;
	}


	@Test
	public void testAddProperty() {
		sample = new Property ("CITY", "Becker", 2613, "Will Smith",1,1,2,2);		 
		assertEquals(mg.addProperty(sample),0,0);	//property has been successfully added to index 0
	}

	@Test
	void testGetPropertiesCount() { 
		sample = new Property ("CITY", "Becker", 2613, "Will Smith",1,1,2,2);
		assertEquals(mg.addProperty(sample),0,0);	
		assertEquals(mg.getPropertiesCount(), 1);
		
	}

	
	@Test
	void testGetHighestRentPropperty() {
		assertEquals(2613,mg.getHighestRentProperty());
	}


	@Test
	void testGetName() {
		assertEquals("DIEGO", mg.getName());
		
	}

	@Test
	void testGetTaxID() {
		assertEquals("3000", mg.getTaxID());
	}


	@Test
	void testGetMgmFee() {
		assertEquals(true, mg.isMangementFeeValid());
		
	}

	
}
