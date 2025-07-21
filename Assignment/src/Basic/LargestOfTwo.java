package Basic;
//basic 
import java.util.Scanner;

public class LargestOfTwo {
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
	        int a,b;
	        System.out.println("Enter two numbers");
	        a=scanner.nextInt();
	        b=scanner.nextInt();
	        if(a>b) {
	        	System.out.println("a is Max");
	        } else if(b>a) {
	        	System.out.println(" b is min");
	        }
	 }
}
