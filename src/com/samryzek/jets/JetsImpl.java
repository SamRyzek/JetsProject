package com.samryzek.jets;


public class JetsImpl {

	private String model;
	private double speed;
	private double range;
	private int price;
	Pilot pilot;
	double m = 767.27;


	

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public JetsImpl(String model, double speed, double range, int price, Pilot pilot) {
		this.model = model;
		this.speed = Math.round(speed/m*100.00)/100.00d;
		this.range = range;
		this.price = Math.round(price)/1_000_000;
		this.pilot = pilot;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Model: " + model + "\n");
		builder.append("Speed: Mach: " + speed + "\n");
		builder.append("Range: " + (int)range + " Miles\n");
		builder.append("Price: $" + price + " Million\n");
		builder.append(pilot);
		return builder.toString();
	}

	
	
	
	
	

}
