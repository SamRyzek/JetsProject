package com.samryzek.jets;

public class Pilot 
{

	private String name;
	private int age;
	private int experiance; 
	
	Pilot [] p = new Pilot[3];
	
	public Pilot() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}

}
