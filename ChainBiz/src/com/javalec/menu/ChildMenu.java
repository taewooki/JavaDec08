package com.javalec.menu;

public class ChildMenu extends ParentsMenu {
	
	//Field
	
	
	//Constructor
	public ChildMenu() {
		
	}
	
	// Method
	
	@Override
	public void  makeKimchisoup() {			
		System.out.println("김치찌개 : 4,500");
	}
	@Override
	public void  makeBudae() {			
		System.out.println("부대찌개 : 5,000");
	}
	@Override
	public void  makeSundae() {			
		System.out.println("순대국 : 판매하지 않습니다.");
	}
	
	

}
