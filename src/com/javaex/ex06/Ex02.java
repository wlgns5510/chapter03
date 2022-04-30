package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//System.out.println(a.concat(b)); //더해서 출력, 원본은 바꾸지 않는다
		//System.out.println(a+b);         //동일
		
		a = a.concat(b);
		System.out.println(a); //뒤의 공백이 없어짐
		
		a = a.trim();
		System.out.println(a.trim()); //모둔 공백이 없어짐
		
		a= a.replace("ab", "12");
		System.out.println(a); //앞의 문자를 찾아서 뒤의 문자로 교체
		
		System.out.println("=====================");
		
		String[] sArray= a.split(","); //배열에 넣어서 사용
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println("======================");
		
		String str = "Hello java!";
		String result01 = str.substring(3); //숫자만큼 앞에서 잘라버림
		System.out.println(result01);
		
		String result02 = str.substring(1, 3); //1번부터 3번 전까지 잘라버림
		System.out.println(result02);
		
		char result03 = str.charAt(8);
		System.out.println(result03);

	}

}
