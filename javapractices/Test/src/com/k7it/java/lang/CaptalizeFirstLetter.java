package com.k7it.java.lang;

public class CaptalizeFirstLetter {
	String result="";
    String reddi="";
	
	public String captalizeFirstLetter(String[] s4) {
		for(int i=0; i<s4.length;i++) {
			result=s4[i];
			result=result.substring(0,1).toUpperCase();
			result += s4[i].substring(1);
			reddi += result+" ";
			
		}
		return reddi.trim();
		}

	public static void main(String[] args) {
		CaptalizeFirstLetter c1=new CaptalizeFirstLetter();
		String s1="this is k7it";
		String[] s4 = s1.split(" ");
		String capital = c1.captalizeFirstLetter(s4);
		System.out.println(capital);
	}

}
