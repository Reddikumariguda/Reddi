package PackageReddi1;

	/*class A{
		int i;
	//A(){
	//System.out.println("constructor");
	//}
	//public static void main(String args[]){
	 //A a1 = new A();
	//}
	A(int i){
	   // this.i=i;
	    System.out.println(this.i);
	    System.out.println(i);
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
		A a2=new A();
		System.out.println(a2.i);
		
	}
	
	}*/
class A{
	int i;
	 A(int i, String name, double height){
		this.i=i;
		System.out.println("int,string,double type constructor");
	}
	
public static void main(String args[]){
	A a1 = new A(10,"reddi",59.00);
	System.out.println(a1.i);
	

}

}		

	


