package com.k7it.java.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingForPrimitiveValues {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add("java");
		list1.add("#sql");
		list1.add("mongodb");
		list1.add("567");
		list1.add("Html");
		System.out.println("sorting ascending order for primitive");
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("sorting descending order for primitive");
		Collections.sort(list1,Comparator.reverseOrder());
		System.out.println(list1);
		
	}

}
