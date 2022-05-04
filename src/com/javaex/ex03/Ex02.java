package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		// 리스트 관리 & 출력
		List<Person> pList = new ArrayList<Person>();
		
		Reader fr = new FileReader("../../file/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String name;
		String hp;
		String company;
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			String[] info = str.split(",");
			name = info[0];
			hp = info[1];
			company = info[2];
			
			Person person = new Person(name, hp, company);
			pList.add(person);
		}
		
		for(Person p : pList) {
			p.showInfo();
		}
		
		
		br.close();
	}

}
