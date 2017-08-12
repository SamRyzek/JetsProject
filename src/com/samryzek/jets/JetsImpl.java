package com.samryzek.jets;

public class JetsImpl {

	private String model;
	private double speed;
	private double range;
	private int capacity;
	Pilot pilot;
	double m = 767.27;
	
	JetsImpl [] jets;
	
	public JetsImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public double convertToMach(double s, double m) {
		
		return s / m;
		
	}

	

}
