package com.javalec.function;

import com.javalec.base.StoreHQ;

public class StoreShop1 extends StoreHQ {
	
	public StoreShop1() {
		
	}

	
	@Override
	public void orderKim();{
		System.out.println("김치찌개 : 2000");
	}
	public void orderBu();{
		
	}
	public abstract void orderKBi();	

}
