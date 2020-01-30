package com.task;

public class Rocket {
private Fuel fuel;
private Sattalite sat;
private String countryName;

public Rocket(Fuel fuel) {
	this.fuel=fuel;
	System.out.println("Created"+fuel);
}
@Override
public String toString() {
	return "Rocket [fuel=" + fuel + ", sat=" + sat + ", countryName=" + countryName + "]";
}
public void setSat(Sattalite sat) {
	this.sat=sat;
	System.out.println("Created"+sat);
}
public void setCountryName(String countryname) {
	this.countryName=countryname;
	System.out.println("Created"+countryname);
}
}
