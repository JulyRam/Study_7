package com.epic.s2.ramdom;

import java.util.HashSet;
import java.util.Iterator;

public class PasswordMain {

	public static void main(String[] args) {
		
		Password password = new Password();
		password.makePassword();
		
		HashSet<Integer> hashSet = password.makePassword();
		Iterator<Integer> it = hashSet.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
