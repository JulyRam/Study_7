package com.epic.s4.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileReader1 {

	public static void main(String[] args) {
		
		File file = new File("d:\\test", "name.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			ArrayList<FileMember> ar = new ArrayList<FileMember>();
			
			while (true) {
				String str = br.readLine();
				if (str==null) {
					break;
				}
				FileMember fileMember = new FileMember();
				//파싱 작업
				//1. split
				String [] ar2 = str.split(",");
				fileMember.setID(ar2[0]);
				fileMember.setPW(ar2[1]);
				fileMember.setAGE(Integer.parseInt(ar2[2]));
				
				//2. StringTokenzier
				StringTokenizer st = new StringTokenizer(str, ",");
				fileMember.setID(st.nextToken());
				fileMember.setPW(st.nextToken());
				fileMember.setAGE(Integer.parseInt(st.nextToken()));
				
				ar.add(fileMember);
				System.out.println(str);
			}
			
			for (int i=0; i<ar.size(); i++) {
				System.out.println("ID : " + ar.get(i).getID());
				System.out.println("PW : " + ar.get(i).getPW());
				System.out.println("AGE : " + ar.get(i).getAGE());
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}

}
