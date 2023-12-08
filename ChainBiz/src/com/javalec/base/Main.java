package com.javalec.base;

import com.javalec.menu.ChildMenu;
import com.javalec.menu.ChildMenu2;
import com.javalec.menu.ChildMenu3;
import com.javalec.menu.ParentsMenu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentsMenu parentsMenu = new ParentsMenu();
		parentsMenu.makeKimchisoup();
		parentsMenu.makeBudae();
		parentsMenu.makeBibim();
		parentsMenu.makeSundae();
		parentsMenu.makeBob();
		
		System.out.println("---------Shop1--------- ");
		
		ChildMenu childMenu = new ChildMenu();
		
		childMenu.makeKimchisoup();
		childMenu.makeBibim();
		childMenu.makeSundae();
		childMenu.makeBob();
		System.out.println();
		
		System.out.println("----------Shop2----------");
		
		ChildMenu2 childMenu2 = new ChildMenu2();
		
		childMenu2.makeBibim();
		childMenu2.makeSundae();
		childMenu2.makeBob();
		childMenu2.makeKimchisoup();
		System.out.println();
		
		System.out.println("----------Shop3----------");
		ChildMenu3 childMenu3 = new ChildMenu3();
		childMenu3.makeBibim();
		childMenu3.makeSundae();
		childMenu3.makeBob();
		childMenu3.makeBudae();
		
		
		
	}

}
