package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str0		="가나다라마바"; // 대문자로 시작 // 객체형 변수
		String str1  	= new String("abcdefg");
		String str11  	= new String("ABCDEFG");
		String str2  	= new String("HIJKLMN");
		String str3  	= new String("	  abc	"); // 입력 프로그램 ID를 입력하세요. 스페이스 bar 제거.
	
	// string 기능을 사용할 수 있게 해준다. 복사하는 방법이 new 를 통해서 사용.
		// scanner 도 sting 이다.
		
		System.out.println(str1);
		System.out.println(str1.concat(str2)); // concat 를 Method 를 사용.
		System.out.println(str1.substring(3)); // sub 부분집합. 필요한 부분만가져옴.사용빈도높음.
		System.out.println(str1.substring(3,5));
		System.out.println(str0.substring(3,5));
		
		System.out.println(str1.length()); // id 입력시 사용. 자릿수 확인등.
		System.out.println(str1.toUpperCase());// 대문자로 변환하기.
		System.out.println(str2.toLowerCase());
		
		System.out.println(str1.charAt(3));
		System.out.println(str1.indexOf("d"));
		
		System.out.println(str1.equals(str2)); // true or false 값으로 준다.
		
		// str1과 str11을 equals 로 비교해서 true 값이 나오게 만들기!
				
		System.out.println(str1.equals(str11.toLowerCase()));//주어는 바뀌면 안된다.
				
		System.out.println(str3);
		System.out.println(str3.trim()); // trim 을 꼭 사용해줘야 혼란을 피할 수 있다.
		// 스페이스 bar 없애 주어야 한다. 화면에 뜨는 것은 문자이다. 숫자가 아니다.숫자는 암호화가 안된다.
		System.out.println(str1.replace('a', 'z')); // a 을 z 로 바뀐다.
		System.out.println(str1.replaceAll("abc", "zzzzzzz"));
		
		// Sting 의 문제점
		// 메모리를 과소비한다. 초기의 데이터가 새로운 데이터로 바뀐다.
		
		
	}

}
