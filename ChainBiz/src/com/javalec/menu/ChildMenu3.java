package com.javalec.menu;

public class ChildMenu3 extends ChildMenu2 {

	
	// Field
	
	
	// Constructor
	public ChildMenu3() {
		
	}
			
	
	// Method
	
	@Override
	public void makeBibim() {
		System.out.println("비빔밥 : 4,500");
	}
	@Override
	public void makeSundae() {
		System.out.println("순대국 : 4,500");
	}
	public void makeBob() {
		System.out.println("공기밥 : 제공되지 않습니다.");
	}
		
	
	
	
	
	
}
