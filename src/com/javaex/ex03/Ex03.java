package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.javaex.ex05.Person;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		// 데이터 추가
		List<Person> pList = new ArrayList<Person>();
		Person addPerson = new Person("유재석", "010-5555-5555", "02-7552-9994");
		
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
		
		pList.add(addPerson);
		
		for(Person person : pList) {
			System.out.println("이름: " + person.getName());
			System.out.println("핸드폰: " + person.getHp());
			System.out.println("회사: " + person.getCompany());
			System.out.println("");
		}
		
		// 파일 재작성 & 저장
		Writer fw = new FileWriter("../../file/PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Person newPerson : pList) {
			String newPeople = newPerson.getName() + "," + newPerson.getHp() + "," + newPerson.getCompany();
			
			bw.write(newPeople);
			bw.newLine();
			
		}
		
		
		bw.close();
		br.close();
	}

}
