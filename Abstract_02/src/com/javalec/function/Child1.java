package com.javalec.function;

import com.javalec.model.LunchMenu;

public class Child1 extends LunchMenu{
	
	public Child1() {
		
	}
	
		
	public Child1(int rice, int bulgogi, int bananan, int milk, int almond) {
		super(rice, bulgogi, bananan, milk, almond);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int calc() {
		
		return rice + bulgogi + bananan;
				
	}
	
	

}
