import static org.junit.Assert.*;

import org.junit.Test;

public class ctest {

	Client client = new Client("suresh","passpass","panaji","21-06-1995");
	
	
	@Test
	public void testGetUserName() {
		//fail("Not yet implemented");
		assertEquals("suresh", client.getUserName());
	}

	@Test
	public void testGetPassword() {
		//fail("Not yet implemented");
		assertEquals("passpass", client.getPassword());
	}
	
	@Test
	public void testHall_Bill() {
		//fail("Not yet implemented");
		client.BookHall("large Hall",300,"music","light");
		assertEquals(32700, client.Hall_Bill());
	}

	@Test
	public void testCatering_Bill() {
		//fail("Not yet implemented");
		client.Catering("non-Veg",300,"cake","Soup");
		assertEquals(99900, client.Catering_Bill());
	}

	@Test
	public void testTransport_Bill() {
		//fail("Not yet implemented");
		client.transport("Bus",50,"AC",6);
		assertEquals(35400, client.transport_Bill());
	}
	
	@Test
	public void testTotal_Bill() {
		//fail("Not yet implemented");
		client.BookHall("Open Air Hall",300,"music","light");
		client.Catering("non-Veg",300,"cake","Soup");
		client.transport("Bus",50,"AC",6);
		
		assertEquals(161280, client.Total_Bill());
	}

	@Test
	public void testGetAddress() {
		//fail("Not yet implemented");
		assertEquals("margao", client.getAddress());
	}

	

}
