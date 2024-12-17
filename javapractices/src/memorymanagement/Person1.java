class Person1{
int age;
String name;
double height;
double weight;

Person1(int age,String name,double weight,double height){
this.age=age;
this.name=name;
this.weight=weight;
this.height=height;
}
public static void main(String args[]){
Person1 p2  = new Person1(27,"Mouni",5.5,65.0);		
			
			System.out.println(p2.age);// 27
			System.out.println(p2.name);//Mouni
			System.out.println(p2.height);// 5.5
			System.out.println(p2.weight);// 65.0
				
}
}