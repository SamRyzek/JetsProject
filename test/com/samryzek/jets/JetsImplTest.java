package com.samryzek.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetsImplTest {
	
	JetsImpl j;

	@Before
	public void setUp() throws Exception {
		j = new JetsImpl();
	}

	@After
	public void tearDown() throws Exception {
		j = null;
	}

	@Test
	public void test_speed_converts_to_mach() {
		
		double s = 100;
		double c = 767.27;
		
		double expected = .13;
		double result = j.convertToMach(s, c);
			expected = s/c;
		assertEquals(expected, result, 0.01);
		assertEquals(.1303, j.convertToMach(100, 767.27), 0.01);
		
	}

}
