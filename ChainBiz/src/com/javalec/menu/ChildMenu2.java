package com.javalec.menu;

public class ChildMenu2 extends ChildMenu {
	
	//Field
	
			
	//Constructor
	public ChildMenu2() {
		
	}
	
		
	//Method
	
	@Override
	public void  makeBibim() {			
		System.out.println("비빔밥 : 5,000");
	}
	@Override
	public void  makeSundae() {			
		System.out.println("순대국 : 4,000");
		
	}
	@Override
	public void  makeBob() {			
		System.out.println("공기밥: 무료입니다.");
	}
	
	
}
