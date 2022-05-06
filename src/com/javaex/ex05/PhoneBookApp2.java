package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookApp2 {

	public static void main(String[] args) throws IOException {
		
		List<Person>personList = new ArrayList<Person>();
		// 읽기 스트림
		Reader fr = new FileReader("../../file/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		// text파일을 1줄씩 읽어서 리스트에 추가
		while(true) {
			
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] personInfo = str.split(",");
			
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];
			
			Person person = new Person (name, hp, company);
			personList.add(person);
		}
		
		Person p = new Person("황일영", "010-1234-1234", "02-123-1234");
		
		personList.add(p);
		
		for(Person person : personList) {
			System.out.println("이름: " + person.getName());
			System.out.println("핸드폰: " + person.getHp());
			System.out.println("회사: " + person.getCompany());
			System.out.println("");
		}
		
		// 쓰기 스트림 (쓰기를 실행하는 순간 백지화)
		Writer fw = new FileWriter("../../file/PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		// 파일에 저장
		for(Person person : personList) {
			String saveStr = person.getName() + "," + person.getHp() + "," + person.getCompany();
			System.out.println(saveStr);
			
			bw.write(saveStr);
			bw.newLine();
			
		}
		
		
		
		
		
		bw.close();
		br.close();
		
	}

}
