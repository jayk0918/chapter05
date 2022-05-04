package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		// 지금 불러들이고자 하는 ms949.txt파일은 ms949형식으로 작성되어 UTF-8로 해석 불가능
		// InputStreamReader를 통한 중간 번역기 사용으로 출력하는 방식 사용
		InputStream in = new FileInputStream("../../file/MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");	// InputStreamReader에 (해석하고자 하는 변수 , 해석 언어 종류)를 설정해주어야 함
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("../../file/MS949copy.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
			bw.write(str);
			bw.newLine();
		}
		
		
		bw.close();
		br.close();
		
	}

}
