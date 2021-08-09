package com.epic.s6.thread;

public class Test3 implements Runnable {
	
	public void run () {
		for (int i='A'; i<'Z'; i++)
			System.out.println((char)i);
	}
	
}
