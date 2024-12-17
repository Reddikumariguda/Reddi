package com.k7it.java.lang;

import java.util.ArrayList;

public class Person {
	int age;
	String name;
	double ht;
	double wt;
     
	public Person(int age, String name, double ht, double wt) {
		this.age=age;
		this.name=name;
		this.ht=ht;
		this.wt=wt;
	}
	

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", ht=" + ht + ", wt=" + wt + "]";
	}


	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Person p1 =new Person(24,"reddi",5.3,50.25);
		Person p2 =new Person(23,"gnana",5.6,60.25);
		Person p3 =new Person(21,"mouni",5.5,45.25);
		Person p4 =new Person(32,"prasad",6.1,70.25);
		Person p5 =new Person(32,"prasad",6.1,70.25);
		
		
		list.add(p1);
		list.add(p2);
		list.add(p3);		
		list.add(p4);
		list.add(p4);
		list.add(p5);
		list.add(new Person(19,"lakshmi",5.4,54.73));
	
		//System.out.println(list);
		//list.forEach(System.out::println);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

	}

