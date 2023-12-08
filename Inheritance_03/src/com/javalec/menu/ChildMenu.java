package com.javalec.menu;

public class ChildMenu extends ParentsMenu {
	
	//Field
	
	// Constructor
	public ChildMenu() {
		
	}
	
	
	
	// Method
	
	public void makeBeefChung() {
		
		System.out.println("쇠고기 청국장");
	}
	public void makeHotDoen() {
		System.out.println("얼큰 된장국");
		super.makeChung();  // super 는 이전 데이터 기억.
	}
	public void makeKongna() {
		System.out.println("콩나물국");
	}
	
	@Override	
	public void makeChung() {
		
	System.out.println("냄새없는 청국장");
		
	}

}
