package com.k7it.java.lang;

class A {
    static int i=10;
    String name="reddi";
	//public static void main(String[] args) {
		A(){

	}

}
class B extends A{
	public static void main(String[] args) {
		
	
	int age=10;
	B b1=new B();
	A a1=new B();
    B b2=(B)a1;
System.out.println(b1.i);
}
}