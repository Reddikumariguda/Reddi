package com.k7it.java.lang;

import java.util.ArrayList;

public class ArrayListAddTypes {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add("java");
		list1.add("sql");
		list1.add("mongodb");
		list1.add("html");
		list1.add(4,"css");
		
		//System.out.println(list1);
		System.out.println(list1.get(0));
		
	}

}
