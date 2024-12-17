interface Vehicle{
	     void fixEngine();// -> public abstract void fixEngine();
		 void fixBreaks();
		 void fixWheels();
		 void fixBody();
	   }
	   
	   class Lorry implements Vehicle{
	     // now implements all abstract methods which are inherited from Vehicle interface. 
		 
		  public void  fixEngine(){
		    System.out.println("fixing engine for Lorry");
		  }
		   public void  fixBreaks(){
		     System.out.println("fixing Breaks for Lorry");
		  }
		   public void  fixWheels(){
		     System.out.println("fixing Wheels for Lorry");
		  }
		   public void  fixBody(){
		     System.out.println("fixing Body for Lorry");
		  }	    
	   
	    //javac Lorry.java  -> 
		
	   Lorry tata = new Lorry();
	   Lorry ashok = new Lorry();
	   Lorry benz = new Lorry();
	   }
	   
	  abstract  class FourWheeler implements Vehicle{
	   
	       public void  fixEngine(){
		     System.out.println("fixing engine for Lorry");
		  }
		   public void  fixBreaks(){
		     System.out.println("fixing Breaks for Lorry");
		  }
		   public void  fixWheels(){
		     System.out.println("fixing Wheels for Lorry");
		  }
	   
	   }
	   
	   
	   // FourWheeler f1 = new FourWheeler();// cTE
		//f1.fixBody();
	   
	   
	   class Bus extends FourWheeler{
	   // 3 concremente methodss and 1 abstract will inherited from FourWheeler class. 
		public void fixBody(){// implementation
	      System.out.println("fixing Bus Body");
		}
	   
	   
	   Bus nonAc = new Bus();
	   Bus volvo = new Bus();
	   }
	   class SleeperBus extends Bus{
	   public void fixBody(){ // override
	      System.out.println("overring  Bus Body as a sleeper");
		}
	   
	   SleeperBus sleeper = new SleeperBus();
	  
	   
	   }
	   