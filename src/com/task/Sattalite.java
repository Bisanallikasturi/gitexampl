package com.task;

public class Sattalite {
	private int lanched;
public String location;

public Sattalite() {
	System.out.println("Created"+this.getClass().getCanonicalName());
}
public void setLanched(int lanched) {
	this.lanched=lanched;
}
public void setLocation(String location) {
	this.location=location;
}
public void setLaunch(int time) {
	System.out.println("invoked"+time);
}
}
