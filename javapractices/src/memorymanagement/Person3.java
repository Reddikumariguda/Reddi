class Person3{
	   
	     int age;
		 String name;
		 double height;
		 double weight;
		 
		 Person3(){
		   System.out.println("no arg constructor");
		 }
public static void main(String args[]){
		 
		    Person3 p1 = new Person3();
			
			System.out.println(p1.age);//0
			System.out.println(p1.name); //null
			System.out.println(p1.height);//0.0
			System.out.println(p1.weight);//0.0
			
}
}