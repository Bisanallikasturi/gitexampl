package com.task;

public class Labour {
private String name;
private int experience;
private TheadImpl theadImpl;

public Labour(String name) {
	System.out.println("Created"+this.getClass().getCanonicalName());
}
public void setExperience(int experience) {
	this.experience=experience;
	System.out.println("Created"+experience);
}
public void setThreadImpl(TheadImpl theadImpl) {
	this.theadImpl=theadImpl;
	System.out.println("Created"+theadImpl);
}
public void work() {
	this.theadImpl.start();
	this.theadImpl.run();
}
}

