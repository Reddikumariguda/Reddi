class A{
int i=10;
int j=20;
static String name ="Reddi";
static double k=56.00;
static float f=34.0f;
static int z=30;
public static void main(String args[]){
	
A a1 = new A();
System.out.println(a1.j);//non static with obj ref
System.out.println(new A().i);//non static with obj
Person p1= new Person();
System.out.println(A.name);//static with class
System.out.println(a1.z);//static with obj ref
System.out.println(new A().f);//static with obj 

}
}