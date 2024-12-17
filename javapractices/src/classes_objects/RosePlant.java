class Plants{
int age;
String name;
String color;
double height;
double weight;
int roots;
double branches;

double getDrinkingCapacity(){
return (roots*height)/age;
}
}
class RosePlant{
public static void main(String args[]){
Plants p1 = new Plants();
p1.name="RosePlant";
p1.age=5;
p1.height=5.4;
p1.roots= 300;

double rosePlant = p1.getDrinkingCapacity();

System.out.println("Name:"+p1.name);
System.out.println("Age:"+p1.age);
System.out.println("Height:"+p1.height);
System.out.println("Roots:"+p1.roots);
System.out.println("DrinkingCapacity:"+rosePlant);

}
}
 