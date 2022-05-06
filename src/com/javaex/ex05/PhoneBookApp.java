package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException {
		
		List<Person>personList = new ArrayList<Person>();
		
		Reader fr = new FileReader("../../file/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
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
		
		
		
		br.close();
		
	}

}
