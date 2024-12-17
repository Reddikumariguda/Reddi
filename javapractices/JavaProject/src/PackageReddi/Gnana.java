package PackageReddi;

public interface Gnana {
		public static final int age=10;
		public static final String name="java";
		
		public abstract void m1();
		public static void m2() {
			System.out.println("static method");
		}
		public default void m3() {
			System.out.println("default method");
		}
}
