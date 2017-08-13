package com.samryzek.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetsImplTest {
	
	JetsImpl j;

	@Before
	public void setUp() throws Exception {
		j = new JetsImpl(null, 0, 0, 0);
	}

	@After
	public void tearDown() throws Exception {
		j = null;
	}

	@Test
	public void test_speed_converts_to_mach() {
		
		double s = 100;
		double m = 767.27;
		
		double expected = .13;
		double result = j.JetsImpl(s, m);
			expected = s/m;
		assertEquals(expected, result, 0.01);
		assertEquals(.1303, j.JetsImpl(100, 767.27), 0.01);
		assertEquals(1, j.JetsImpl(767.27, 767.27), 0.01);
		assertEquals(1.5, j.JetsImpl(1150.90, 767.27), 0.01);
		
	}

}
