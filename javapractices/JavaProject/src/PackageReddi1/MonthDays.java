package PackageReddi1;

public enum MonthDays {
	JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),
	 SEP(30),OCT(31),NOV(30),DEC(31);

	MonthDays(int i) {
		
		System.out.println("No of days in "+this+":"+i);
	}

}
