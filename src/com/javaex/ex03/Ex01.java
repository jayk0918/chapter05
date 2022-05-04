package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		// 배열 split
		InputStream in = new FileInputStream("../../file/PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		String[] info = new String[3];
		String name;
		String hp;
		String company;
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			info = str.split(",");
			name = info[0];
			hp = info[1];
			company = info[2];
			
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
			
		}
		
		
		
		
		
		br.close();
		
	}

}
