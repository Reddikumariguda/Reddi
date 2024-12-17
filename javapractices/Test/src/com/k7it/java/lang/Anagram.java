package com.k7it.java.lang;

public class Anagram {
	static String s1 = "k7it";
	static String s2 = "tik7";

	public static boolean isAnagramWords(String s1, String s2) {
		if (s1.length() == s2.length()) {
			char[] chars = s1.toCharArray();
			//for (char c1 : chars) {
			for(int i=0;i<chars.length;i++) {
				//if (!s2.contains("" + chars[i])) {
				if (s2.contains(" "+chars[i])) {
					return true;
				} else {
					return false;

				}

			}
		}
		return true;
	}
	public static void main(String args[]) {
		boolean flag = isAnagramWords(s1, s2);
		if (flag) {
			System.out.println("both are anagram");
		} else {
			System.out.println("both are not anagram");
		}
	}
}

// for(int i=0;i<s1.length();i++) {
// for(int j=0;j<s2.length();j++) {
/*
 * for(char c1:chars) { } if(!s1.equals(s2)) {
 * System.out.println("both are Anagrams"); } else{
 * System.out.println("both are not anagrams"); }
 * 
 * }
 */
