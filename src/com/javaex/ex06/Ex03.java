package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		//문자열 --> 정수
		int i00 = 3;
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(20);		
		Short s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		Integer iRsult = new Integer(3) + new Integer(5);
		System.out.println(iRsult);
		
		Integer no = 3; //박싱
		int r01 = no.parseInt("1234"); //문자열-->정수로 
		System.out.println(r01+1);
		
		int r02 = Integer.parseInt("12345");
		System.out.println(r02);
		
		
		Integer no02 = 100;
		int no03 = no02; //언박싱
		
		
		//정수 --> 문자열
		String str = "안녕하세요";
		String str01 = str.valueOf(555);
		System.out.println(str01 + 1);
		
		String str02 = String.valueOf(555); //정수 --> 문자열
		System.out.println(str02);
		
		//정수 --> 문자열
		String str03 = ""+555; //문자열+정수 --> 문자열
		
		

	}

}
