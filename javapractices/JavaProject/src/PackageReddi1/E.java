package PackageReddi1;

public class E {
	int i;
	int j;

	public static void main(String[] args) {
		E e1 = new E();
		int result=e1.add(5, 1);
		System.out.println(result);
	}

	int calculator() {
		return 10;
	}

	int add(int i, int j) 
	{
		return i+j;
	}

}
