package com.javalec.function;

import com.javalec.model.LunchMenu;

public class Child2 extends LunchMenu {
	
	public Child2() {
		
	}

	public Child2(int rice, int bulgogi, int bananan, int milk, int almond) {
		super(rice, bulgogi, bananan, milk, almond);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int calc() {
		
		return rice + bulgogi + milk + almond;
		
	}

}
