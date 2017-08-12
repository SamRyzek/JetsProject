package com.samryzek.jets;

public class Pilot 
{

	private String name;
	private int age;
	private int experience; 
	
	public Pilot(String name, int age, int experience) {
		this.name = name;
		this.age = age;
		this.experience = experience;

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
		return experience;
	}

	public void setExperiance(int experiance) {
		this.experience = experiance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pilot [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", experience=");
		builder.append(experience);
		builder.append("]");
		return builder.toString();
	}
	
}
