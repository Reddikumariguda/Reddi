package com.k7it.java.lang;
import java.util.Scanner;
public class Scanner_sc {


public static void main(String[] args) {
	boolean flag;
	do {
		System.out.println(args);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter your name");
	String s2=sc.next();
	System.out.println("enter your age");
	int s3=sc.nextInt();
	System.out.println("enter your ht");
    double s4=sc.nextDouble();
    System.out.println("enter your wt");
   double s5=sc.nextDouble();
//    System.out.println("details completed");
//    String s6=sc.next();
    System.out.println("do you want add another person details:true or false");
     flag=sc.nextBoolean();
	}
while(flag);
System.out.println("details completed");	
}
}