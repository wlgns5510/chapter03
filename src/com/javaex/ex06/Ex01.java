package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

		String s01 = new String("안녕하세요");
		System.out.println(s01.toString());
		
		String s02 = new String("안녕하세요");
		System.out.println(s02.toString());
		
		System.out.println(s01 == s02); //두개의 메모리를 new를 통해 생성하기 때문에 같을 수 없다. --> false
		
		System.out.println("=====================");
		
		String s03 = "hi";
		String s04 = "hi";
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		System.out.println(s03 == s04); //s03에서 "hi"가 이미 올라갔기 때문에 동일한 장소를 사용 --> true
		
		s03 = "hihi";
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		System.out.println(s03 == s04); //s03이 변경되었기 때문에 각자 다른 두개의 메모리가 생김 --> false
		

	}

}
