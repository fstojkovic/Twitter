package com.twitter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {

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

		t.unesi("Filip", "#fonbg");
		t.unesi("Petar", "#Osma");

		assertEquals("Filip", t.vratiSvePoruke().get(0).getKorisnik());
		assertEquals("#fonbg", t.vratiSvePoruke().get(0).getPoruka());
		assertEquals("Petar", t.vratiSvePoruke().get(1).getKorisnik());
		assertEquals("#Osma", t.vratiSvePoruke().get(1).getPoruka());

	}

	@Test
	public void testUnesi() {

		t.unesi("Petar", "#Osma");

		assertEquals("Petar", t.vratiSvePoruke().get(0).getKorisnik());
		assertEquals("#Osma", t.vratiSvePoruke().get(0).getPoruka());

	}

	@Test
	public void testVratiPorukeSveURedu() {
		
		t.unesi("Marko", "#fonbg");
		t.unesi("Petar", "#Osma");
		t.unesi("Petar", "#fonbg");
		t.unesi("Milos", "#fonbg");
		t.unesi("Ana", "#fonbg");
		t.unesi("Marija", "#Osma");

		TwitterPoruka[] tp = new TwitterPoruka[4];

		for (int i = 0; i < tp.length; i++) {
			tp[i] = new TwitterPoruka();
		}
		tp[0].setKorisnik("Marko");
		tp[0].setPoruka("#fonbg");
		tp[1].setKorisnik("Petar");
		tp[1].setPoruka("#fonbg");		
		tp[2].setKorisnik("Milos");
		tp[2].setPoruka("#fonbg");
		tp[3].setKorisnik("Ana");
		tp[3].setPoruka("#fonbg");

		assertArrayEquals(tp, t.vratiPoruke(4, "#fon"));

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagNull() {
		t.vratiPoruke(5, null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagPrazanString() {
		t.vratiPoruke(5, "");
	}

}
