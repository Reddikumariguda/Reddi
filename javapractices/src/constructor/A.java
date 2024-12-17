/* class A{
	int i=10;
---> /* A(){
System.out.println("constructor");
}
public static void main(String args[]){
 A a1 = new A();
}   ---> */
/* A(int i){
    this.i=i;
	System.out.println("int type constructor");
}
A(String name){
	System.out.println("String type constructor");
}
A(int i,double d){
	System.out.println("int.double type constructor");
}
public static void main(String args[]){
	A a1 = new A(5);
	System.out.println(a1.i);
	
}
}*/
class A{
	
	A(int i, String name, double height){
		System.out.println("int,string,double type constructor");
	}
	
}
public static void main(String args[]){
	A a1 = new A();
	a1.i=10;
}
