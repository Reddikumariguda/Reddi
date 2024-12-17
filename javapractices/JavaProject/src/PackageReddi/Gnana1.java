package PackageReddi;

public class Gnana1 implements Gnana {
	
	@Override
	public void m1() {
			System.out.println("implementation");
		}
	public void m3() {
		System.out.println("overriden method");
	}
public static void main(String[] args) {
		Gnana1 g1=new Gnana1();
		Gnana.m2();
		System.out.println(g1.age);
		System.out.println(g1.name);
		g1.m1();
		g1.m3();
	}
}
