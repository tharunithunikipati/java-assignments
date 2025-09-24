package Basic;
import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter a year");
		a=sc.nextInt();
		String b="leapyear";
		String c="not a leapyear";
		String year=(a%4==0 && a%100==0 && a%400==0)?b:c;
		System.out.println(year);
	}

}
