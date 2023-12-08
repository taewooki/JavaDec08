package com.javalec.model;

public abstract class LunchMenu {
	
	public int rice;
	public int bulgogi;
	public int bananan;
	public int milk;
	public int almond;
	// 모델에서는 데이터를 다적는다.
	
	public LunchMenu() {
		
	}

	public LunchMenu(int rice, int bulgogi, int bananan, int milk, int almond) {
		super();
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.bananan = bananan;
		this.milk = milk;
		this.almond = almond;
	}
	
	public abstract int calc();
	

}
