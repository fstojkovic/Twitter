package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.twitter.Twitter;

public class JUnitTwitter {

	Twitter t;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		t = new Twitter();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVratiSvePoruke() {
		
		
		
	}

	@Test
	public void testUnesi() {
		fail("Not yet implemented");
	}

	@Test
	public void testVratiPoruke() {
		fail("Not yet implemented");
	}

}
