package PackageReddi;
class D {
	int i = 20;

	void m2() {
		int i=60;
		System.out.println("m2" +i);
	}
	D(){
	
		System.out.println("D-no-arg");
	}
	D(int k){
		System.out.println("D-int-arg");
	}
	
}

public class C extends D {
	public static int i = 50;

	public static void main(String[] args) {
		int i = 30;
		D d1=new D();
		C a2 = new C();
		System.out.println(i);
		System.out.println(a2.i);
		a2.m1();
	}

	void m1() {
		int j=this.i;
		System.out.println(this.i);
		System.out.println(super.i);
		this.m3();
		super.m2();
		System.out.println("j"+j);
	}

	void m3() {
		System.out.println("m3");
	}
	public C(){
		this(80);
		System.out.println("c-no-arg");
	}
	C(int k){
		super();
		System.out.println("c-int-arg");
	}

}
