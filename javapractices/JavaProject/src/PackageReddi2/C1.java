package PackageReddi2;

public class C1 {
	int age=24;
	String name="Reddi";
	
	@Override
	public String toString() {
		return "C1 [age=" + age + ", name=" + name + "]";
	}

	public static void main(String[] args) {
	C1 c1 = new C1();
	System.out.println(c1);
	PackageReddi1.C c2 = new PackageReddi1.C();

	System.out.println(c2.hashCode()); 
	
	}
}
