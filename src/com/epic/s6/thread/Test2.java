package com.epic.s6.thread;

public class Test2 extends Thread {
	
	public void run() {
		for (int i=0; i<25; i++) {
			System.out.println(i);
		}
	}
	
}
