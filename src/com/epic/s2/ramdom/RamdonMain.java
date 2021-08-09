package com.epic.s2.ramdom;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RamdonMain {

	public static void main(String[] args) {
		
		Lotto lotto = new Lotto();
		Random random = new Random();
		HashSet<Integer> hashSet = lotto.makeLotto();
		
		Iterator<Integer> it = hashSet.iterator();
		
		while (it.hasNext()) {
			System.out.print(it.next());
		}
		
		//int num = random.nextInt(10);
		//System.out.println(num);
		
		
		
	}

}
