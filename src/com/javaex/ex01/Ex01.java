package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	
	public static void main(String[] args) throws IOException {	// 편의상 throw exception 채용(무책임한 style)
		
		// I.OStream => 빨대로 형상화하여 생각하면 편함
		
		InputStream in = new FileInputStream("../../file/img.jpeg");	// "주소값"
		OutputStream out = new FileOutputStream("../../file/byteImg3.jpeg");
		
		System.out.println("복사시작");
		while(true) {
			// 모든 데이터를 프로그램 내부로 흡수
			int data = in.read();
			if(data == -1) {	// -1 : 흡수할 데이터가 끝났을 떄
				System.out.println("복사 끝" + data);
				break;
			}
			// 데이터 흡수 -> 복사 -> 배출 (한모금 빨고 뱉기)
			out.write(data);
		}
		
		out.close();
		in.close();
		
		
	}
	
	
}
