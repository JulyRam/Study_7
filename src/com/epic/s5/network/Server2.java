package com.epic.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		ArrayList<String> lunch = new ArrayList<String>();
		lunch.add("김치찌개");	//0
		lunch.add("오므라이스");  //1
		lunch.add("샌드위치");
		lunch.add("치즈라면");
		lunch.add("먹다남은 치킨");
		lunch.add("비빔밥");		//5
		
		String [] dinner = {"내장탕", "삽겹살", "선지국", "소고기", "곱창", "다이어트 굶기"};
		
		
		//1. 클라인언트 접속 준비
		ServerSocket ss=null;
		Socket sc=null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is=null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		Random random = null;
		
		try {
			System.out.println("============= SERVER ===========");
			ss = new ServerSocket(8282);
			sc = ss.accept();
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			boolean check=true;
			
			while(check) {
				Calendar calendar = Calendar.getInstance();
				
				random = new Random(calendar.getTimeInMillis());
				
				
				String select = br.readLine();
				System.out.println("CLIENT : "+select);
				int num = Integer.parseInt(select);
				String menu=null;
				if(select.equals("1")) {
					int i = random.nextInt(lunch.size());
					menu = lunch.get(i);
				}else if(select.equals("2")) {
					int i = random.nextInt(dinner.length);
					menu = dinner[i];
				}else {
					break;
				} 
				
				bw.write(menu+"\r\n");
				bw.flush();
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				
				bw.close();
				ow.close();
				os.close();
				sc.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//2. 클라인트 와 접속 성공
		
		//3. 클라이언트로 메세지 수신
		//   1 이면 점심 메뉴 중에서 하나를 전송
		//   2 이면 저녁 메뉴 중에서 하나르 전송
		//   3 이면 프로그램 종료

	}

}