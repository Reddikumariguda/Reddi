package com.k7it.java.lang;

public class CompareString {
	static String s1="aBcd";
	static String s2="afghijk";

	public static void main(String[] args) {
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));

	}

}
