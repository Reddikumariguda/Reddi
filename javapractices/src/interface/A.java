class A{
A(){
}
void m1(){
}
}
class B extends A{
public static void main(String args[]){
A a1 = new B();
a1.m1();
}
}