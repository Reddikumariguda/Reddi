package PackageReddi;

 public enum Weekdays {
     SUNDAY(3),MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
     Weekdays(int i){
    	 System.out.println("weekday"+i);
     }

		
		
	 Weekdays() { 
		 System.out.println("no arg constructor"); 
		 }
		 
		 
				  public static void main(String[] args) {
					  Weekdays w1 = Weekdays.SUNDAY;
				  System.out.println(w1);
				  
				  }
				 

} 