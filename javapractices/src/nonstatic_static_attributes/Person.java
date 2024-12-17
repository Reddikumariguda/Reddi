/ * class Person{
			     int age;
				 String name;
			  }
			   class PersonManager{
			      public static void main(String args[]){
				     
					System.out.println(new Person().age=10); //0 
					// direct object usage without ref variable.
					/* above one line is equals to below 3 lines of code.
					   Person temp1 = new Person();
					   sop(temp1.age);// 0
					   temp1 = null;
					*/
					System.out.println(new Person().name);// null
					 /* above one line is equals to below 3 lines of code.
					   Person temp2 = new Person();
					   sop(temp2.name);
					   temp2 = null;
					*/
					// here temp1 , temp2 variables life time is only single line.
					// to access 2 attributes we are creating 2 objects. 
				  }
			     
			   } */
			   
class Person{
			    int age;
				String name;
			  }
			  class Manager{
			    static public void main(String[] args){
				
				Person p1 = new Person();
				System.out.println(p1.age);//0
				System.out.println(p1.name);//null
				System.out.println(p1.age);//0
				System.out.println(p1.name);//null
				/*
				 here p1 is a ref variable for person class object, p1 scope is entire 
				 main method scope. we can use p1 object any where in the main method how
				 many times you want to use it.
				*/
				
				p1.age = 25;
				System.out.println(p1.age);// 25
				p1.name = "k7it";
				System.out.println(p1.name);// k7it
				}
			  }
			
			   
