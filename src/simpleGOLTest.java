import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class simpleGOLTest {
	private static simpleGOL a=new simpleGOL();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testlive() {
		System.out.println("TEST LIVE");
		assertEquals(1,a.cellState(10,5));
	}
	@Test
	public void testNO() {
		System.out.println("TEST DIE");
		assertEquals(0,a.cellState(10,7));
	}
	@Test
	public void testNeighbors() {
		System.out.println("TEST NEIGHBORS");
		assertEquals(3,a.getNeighbors(10,5));
	}
	@Test
	public void testNextworld() {
		System.out.println("TEST NEXTWRLD");
		a.nextWorld();
		assertEquals(1,a.cellState(10,5));
		assertEquals(1,a.cellState(10,6));
		assertEquals(4,a.getNeighbors(10,5));	
	}
}
