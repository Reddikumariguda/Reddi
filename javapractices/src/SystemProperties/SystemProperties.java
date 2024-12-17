class SystemProperties{
public static void main(String args[]){
int age=Integer.parseInt(System.getProperty("age"));
String name=System.getProperty("name");
double ht=Double.parseDouble(System.getProperty("ht"));
double wt=Double.parseDouble(System.getProperty("wt"));
System.out.println("Name:"+name+", Age:"+age+" ,ht:"+ht+" ,wt:"+wt);
}
}