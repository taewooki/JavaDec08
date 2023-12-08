package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 0;
		
		System.out.println("Add :" + (i+j));
		System.out.println("Sub :" + (i-j));
		System.out.println("Mul :" + (i*j));
		
		// 예외처리
		try {
			System.out.println("div :"+(i/j));
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("숫자를 다시한번 확인하세요");
		} finally {
			
		}
		
		
		

	}

}
