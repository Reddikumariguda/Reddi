package com.k7it.java.lang;

public class Pattern2 {

	public static void main(String[] args) {
		int[][] a=new int[5][5];
		for(int i=0;i<a.length;i++) {
         for(int j=0;j<i+1||i==j;j++) {
        	 System.out.print("* ");
         }
        System.out.println();
	}

	}
}
