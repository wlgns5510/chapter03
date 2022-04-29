package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		Point p00 = new Point(3, 5);
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = p02; //p02와 p03은 같은 공간을 사용
		
//		System.out.println(p01.getX());
		
		//Point클래스의 부모로 Object클래스를 자동으로 상속한다.
		
		System.out.println("===============클래스정보 보기============");
		System.out.println(p01.getClass());
		
		System.out.println("");
		
		
		System.out.println("===============인스턴스정보 보기============="); //Point의 toString() 재정의 전후 비교
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		
		System.out.println("");
		
		System.out.println("==============해쉬코드================"); //메모리의 주소값에 대응되는 중복되지 않는 숫자
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println("");
		
		System.out.println("=============이퀄스=================");
		System.out.println(p01.equals(p02)); //누가봐도 둘이 다름
		System.out.println(p02.equals(p01)); //위와 동일값이지만 p02의 이퀄스를 사용함		
		System.out.println(p01.equals(p01)); //본인과 본인비교 --> true
		System.out.println(p02.equals(p03)); //달라보이지만 같은 공간을 사용하고 있음 -->true
		
		System.out.println("===========이퀄스와 '=='비교'========");
		
		System.out.println(p02 == p03); //주소가 같음
		System.out.println(p00.equals(p01)); //3, 5가 동일하지만 장소가 다름 --> false
	}

}
