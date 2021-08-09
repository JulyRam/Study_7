package com.epic.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		//1. Server접속
		Socket sc=null;
		Scanner scanner = new Scanner(System.in);
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is=null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			sc = new Socket("127.0.0.1", 8282);
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			boolean check= true;
			
			while(check) {
				System.out.println("1. 점심 메뉴");
				System.out.println("2. 저녁 메뉴");
				System.out.println("3. 종    료");
				
				int select = scanner.nextInt();
				
				bw.write(select+"\r\n");
				bw.flush();
				
				
				if(select > 2) {
					break;
				}
				
				String str = br.readLine();
				
				System.out.println("메뉴 : "+str);
				
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
				scanner.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//2. 1.점심메뉴
		//   2.저녁메뉴
		//   3.종   료

	}

}