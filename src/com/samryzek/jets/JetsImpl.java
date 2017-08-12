package com.samryzek.jets;

import java.util.Arrays;

public class JetsImpl {

	private String model;
	private double speed;
	private double range;
	private int capacity;
	Pilot pilot;
	double m = 767.27;
	
	JetsImpl [] jets = new JetsImpl[5];
		 
	
	public JetsImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public double convertToMach(double s, double m) {
		
		return s / m;
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public JetsImpl(String model, double speed, double range, int capacity, Pilot pilot, double m, JetsImpl[] jets) {
		
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.capacity = capacity;
		this.pilot = pilot;
		this.jets = jets;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JetsImpl [model=");
		builder.append(model);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append(", pilot=");
		builder.append(pilot);
		builder.append(", m=");
		builder.append(m);
		builder.append(", jets=");
		builder.append(Arrays.toString(jets));
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
