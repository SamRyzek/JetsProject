package com.samryzek.jets;

public class JetsImpl {
	
	//field initiated
	private String model;
	private double speed;
	private double range;
	private int price;
	Pilot pilot;
	double m = 767.27;
	
	//constructor
	public JetsImpl(String model, double speed, double range, int price) {
		this.model = model;
		this.speed = Math.round(speed / m * 100.00) / 100.00d;
		this.range = range;
		this.price = Math.round(price) / 1_000_000;
	}
	
	public JetsImpl(String model, double speed, double range, int price, Pilot pilot) {
		this.model = model;
		this.speed = Math.round(speed / m * 100.00) / 100.00d;
		this.range = range;
		this.price = Math.round(price) / 1_000_000;
		this.pilot = pilot;
	}
	
	public JetsImpl(double m, double s)
	{
		this.speed = Math.round(speed / m * 100.00) / 100.00d;
	}
	
	//no arg constructor
	public JetsImpl()
	{
		
	}
	
	//gets and sets
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;

	}

	public void setSpeed(double speed, double c) {
		this.speed = speed;
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


	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	//toString formatted for ease of reading
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Model: " + model + "\n");
		builder.append("Speed: Mach: " + speed + "\n");
		builder.append("Range: " + (int) range + " Miles\n");
		builder.append("Price: $" + price + " Million\n");
		builder.append(pilot);
		return builder.toString();
	}

	

}
