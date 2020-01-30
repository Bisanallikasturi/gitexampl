package com.task;

public class TheadImpl extends Thread {
public void start() {
	System.out.println("Thread Started now");
}
public void run() {
	System.out.println("Thread start Running");
}
}
