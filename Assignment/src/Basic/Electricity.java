package Basic;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units consumed: ");
		int units = sc.nextInt();
		double bill=0;
		if (units<=100) {
			bill=units*1.5;
			
		} else if(units<=200) {
			bill=(100*1.5)+(units-100*2.5);
		} else if(units<=300) {
			bill=(100*1.5)+(100*2.5)+(units-200)*4.0;
			
		}else {
			bill=(100*1.5)+(100*2.5)+(100*4.0)+(units-300)*6.0;
		}
bill+=50;
System.out.println("Total Electricity Bill: $"+bill);
	}
}

	