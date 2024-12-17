package PackageReddi1;

public class EnumManager {
	
		public static void main(String[] args) {
			
			WeekDays e1 = WeekDays.SATURDAY;
			System.out.println(e1);
			
			System.out.println("Name:"+e1.name());
			
			System.out.println("Ordinal:"+e1.ordinal());
			System.out.println("Values:"+e1.values());
			System.out.println("valueOf:"+e1.valueOf("SUNDAY"));
			
			MonthDays m = MonthDays.JAN;
			
		}
	}


