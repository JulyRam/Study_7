package com.epic.s6.thread;

public class Test1 extends Thread {
	
	//
	public void run () {
		//동시에 진행할 코드 작성
		for (int i='a'; i<'z'; i++) {
			System.out.println((char)i);
		}
	}
}
