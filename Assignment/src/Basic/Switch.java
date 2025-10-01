package Basic;

import java.util;
public class Switch {
	public static void main(String args[]) {
		int val=10;
		switch(val%2)
		{
		case 0:
			System.out.println("Even");	
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
			System.out.println("Please give the proper input value");
	}
	}
}
