package com.k7it.java.lang;

class Arrays2 {
	// static int i;
	// static String s;
	/*
	 * Arrays(int i, String s) 
	 * { // this.i=i;
	 *  // this.s=s; 
	 *  System.out.println(i +"  " + s);
	 *   }
	 */
	 static int[] i1= {10,20,30,40,50} ;
	public static void main(String[] args) {
		// System.out.println(i[1]);
		/*
		 * int[] i=new int[5];
		 *   i[0]=10;
		 *   i[1]=20; 
		 *   i[2]=30; 
		 *   i[3]=40;
		 *   i[4]=50;
		 * System.out.println(i[3]); 
		 * System.out.println(i[6]);
		 */
		
		// System.out.println(a1);
		// Arrays[] a1= new Arrays[2];SS
		// System.out.println(a1[0]);
		/*---1st way of printing derived data types
		 * Array[] p1 = new Array[] { 
		 * new Array(24,"reddi"),
		 * new Array(30,"mouni"), 
		 * newArray(23,"gnana") };
		 */
		/*-----2nd way of printing derived data types
		 * Arrays[] p1 = {
		 *  new Arrays(22, "singam"), 
		 *  new Arrays(25, "somu"), 
		 *  new Arrays(19, "laxu") 
		 *  };
		 */
		// --- 3rd way of printing derived data types
   /*Arrays[] p1=new Arrays[4];
   p1[0]=new Arrays(21,"neha");
   p1[1]=new Arrays(22,"sai");
   p1[2]=new Arrays(23,"thanu sri");
	*/
	/*---- print values using for loop
	 * for(int i=0;i<i1.length;i++)
	 *  { 
	 *  System.out.println(i1[i]);
	 *   }
	 */
		for(int value:i1) {
			System.out.println(value);
			//System.out.println("hello world");
			
		}
		}
}
