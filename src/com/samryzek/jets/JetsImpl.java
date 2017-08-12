package com.samryzek.jets;

public class JetsImpl {

	private String model;
	private double speed;
	private double range;
	private int capacity;
	Pilot pilot;
	double m = 767.27;


	public JetsImpl(String model, double speed, double range, int capacity, Pilot pilot) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.capacity = capacity;
		this.pilot = pilot;
		
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

	public double setSpeed(double s, double m) {
		this.speed = s/m;
		return speed;
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
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	

}
