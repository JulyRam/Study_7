package com.epic.s2.ramdom;

import java.util.HashSet;
import java.util.Random;

public class Lotto {

		public HashSet<Integer> makeLotto () {
			HashSet<Integer> hashSet = new HashSet<Integer>();
			Random random = new Random();
			
			while (hashSet.size() !=6) {
				int num = random.nextInt(45)+1;
				hashSet.add(num);
			}
			return hashSet;
			
			/*boolean check = hashSet.add(1);
			System.out.println(check);
			
			System.out.println(hashSet.size());
			
			check = hashSet.add(1);
			System.out.println(check);
			
			System.out.println(hashSet.size()); */
			
 		}
}
