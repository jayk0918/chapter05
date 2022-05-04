package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		// 문자 파일 -> 정보 받아 콘솔 출력
		Reader fr = new FileReader("../../file/song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();	// 한 줄 씩 read , 줄바꿈은 제외(newLine)
			
			if(str == null) {
				break;
			}
			
			System.out.println(str);
		}
		
		br.close();
		
	}

}
