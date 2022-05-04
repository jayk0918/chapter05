package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("../../file/img.jpeg");
		BufferedInputStream bin = new BufferedInputStream(in);
		// Ex02에서 설정한 그릇을 만들어진 클래스로 끌어서 씀, 보통 섞어쓰기를 사용하지 않음
		// 비유하자면 총기 파츠같은 느낌(소음기 / 배율과 같은)
		
		OutputStream out = new FileOutputStream("../../file/bufferedImg.jpeg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		while(true) {
			int data = bin.read();
			if(data == -1) {
				System.out.println("복사 완료" + data);
				break;
			}
			bout.write(data);
		}
		
		
		
		bout.close();
		bin.close();
		// in.close(); -> BufferedInputStream을 통해서 컨트롤이 이루어짐, 따라서 InputStream을 막을 이유가 없어지는 것
	}

}
