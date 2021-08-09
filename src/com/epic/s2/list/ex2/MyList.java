package com.epic.s2.list.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class MyList implements DataIO {
	
	//DataIO 구현
	
	@Override
	public void add(ArrayList<Integer> ar, int num) {
		ar.add(0, num);
	} //add num을 list에 맨 앞에 추가 - 데이터를 입력
	@Override
	public void remove(ArrayList<Integer> ar) {
		ar.remove(ar.size()-1);
	} //remove list에서 무조건 마지막 요소를 삭제

}
