package Basic;
//basic 
public class DriverInsurance {
	public static void main(String args[]) {
		String gender="Female"; //male or female
		boolean married=true;//true or false
		int age=31;
		if(married) {
			System.out.println("driver is married");
		}else if(gender.equalsIgnoreCase("male")&&age>30) {
			System.out.println("driver is insured and unmarried male above age 30");
		} else if(gender.equalsIgnoreCase("Female")&&age>25) {
			System.out.println("driver is insured and unmarried male above age 25");
		}
	}

}
