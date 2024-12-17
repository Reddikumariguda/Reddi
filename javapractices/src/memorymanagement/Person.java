class Person{
int age;
String name;
              
public static void main(String args[]){
Person p1=new Person();
p1.age=24;
p1.name="Reddi";
Person p2=new Person();
p2.age=21;
p2.name="Prakash";
p2=p1;
System.out.println(p2.name);
Person p3=new Person();
System.out.println(p3.name);
p3=p2;
System.out.println(p3.age);
}
}