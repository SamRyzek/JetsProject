package com.samryzek.jets;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetsImplTest {
	Hangar hangar;
	Barracks barracks;
	JetsImpl j;
	Pilot p;

	@Before
	public void setUp() throws Exception {
		hangar = new Hangar();
		barracks = new Barracks();
		j = new JetsImpl("name", 100, 5000, 500);
		p = new Pilot("name", 35, 500);
	}

	@After
	public void tearDown() throws Exception {
		j = null;
	}

	@Test
	public void test_jet_getters() {
		//tests jet getters 
		double s = 100;
		double m = 767.27;
		
		double expected = .13;
		double price = 500/1000000;

		assertEquals(5000, j.getRange(), 0.01);
		assertEquals(.1303, j.getSpeed(), 0.01);
		assertEquals(price, j.getPrice(), 0.01);
		
	}
	@Test
	public void test_add_pilot_to_jet() {
		//test method for adding a pilot to jet
		
		j.setPilot(p);
		
		assertEquals("name", j.getPilot().getName());
	}
	@Test
	public void test_add_jet_to_hangar() {
		//test method for adding a pilot to jet
	
		hangar.addJet(j);
		
		assertEquals(5, hangar.getJets().length);
		assertEquals("name", hangar.getJets()[hangar.getJets().length-1].getModel());
	}

}
