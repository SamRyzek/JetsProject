package com.samryzek.jets;

public class Pilot {
	
	//field is initiated
	private String name;
	private double age;
	private double experience;
	
	//constructor
	public Pilot(String name, double age, double experience) 
	{
		this.name = name;
		this.age = age;
		this.experience = experience;

	}
	
	//no arg constructor
	public Pilot()
	{
		
	}
	
	//sets and gets
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getExperiance() {
		return experience;
	}

	public void setExperiance(double experiance) {
		this.experience = experiance;
	}

	//to string formatted for ease of reading
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\tPilot: " + name + "\n");
		builder.append("\tAge: " + (int) age + " Years Old\n");
		builder.append("\tExperience: " + (int) experience + " Years\n");
		return builder.toString();
	}

}
