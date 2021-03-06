package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TwitterPorukaTest {

	TwitterPoruka tp;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tp = new TwitterPoruka();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetKorisnikSveOk() {

		tp.setKorisnik("Filip");
		assertEquals("Filip", tp.getKorisnik());

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {

		tp.setKorisnik(null);

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString() {

		tp.setKorisnik("");

	}

	@Test
	public void testSetPorukaSveOk() {

		tp.setPoruka("fonbg");
		assertEquals("fonbg", tp.getPoruka());

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {

		tp.setPoruka(null);

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPorukaPreko140() {

		String poruka="";
		for (int i = 0; i < 50; i++) {
			poruka+="Fon";
			
		}
		tp.setPoruka(poruka);

	}

	@Test
	public void testToString() {
		tp.setKorisnik("Filip");
		tp.setPoruka("Provera");
		assertEquals("KORISNIK:Filip PORUKA:Provera", tp.toString());
	}

}
