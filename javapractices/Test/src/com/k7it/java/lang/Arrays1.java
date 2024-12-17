package com.k7it.java.lang;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays1 {

	public static void main(String[] args) {
	int[] a1=new int[5];
	a1[0]=70;
	a1[1]=20;
	a1[2]=60;
	a1[3]=90;
	a1[4]=40;
	Arrays.sort(a1);
	//Arrays.sort(a1,Comparator.reverseOrder());
	for(int i=0;i<a1.length;i++)
	System.out.println(a1[i]);

	}

}
