package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// Ex01 대비 속도 개선 version
		
		InputStream in = new FileInputStream("../../file/img.jpeg");
		OutputStream out = new FileOutputStream("../../file/byteBuffImg.jpeg");
		
		byte[] buff = new byte[1024];	// 그릇 제조, Ex01에서는 한모금씩 흡수했다면 이번에는 그릇에 담아 흡수
		System.out.println("복사 시작");
		while(true) {
			int data = in.read(buff);	// 그릇을 제공함(write 할수 있게)
			if(data == -1) {
				System.out.println("복사 끝" + data);
				break;
			}
			out.write(buff);	
		}
		out.close();
		in.close();
		
		
	}

}
