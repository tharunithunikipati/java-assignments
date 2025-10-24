package Basic;
import java.util.*;
public class Rev {
	public static void main(String args[]) {
		int num=12345,rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;	
		}
		System.out.println("Reversed="+rev);
	}
}
