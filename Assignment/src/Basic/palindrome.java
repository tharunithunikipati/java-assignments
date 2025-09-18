package Basic;
import java.util;
public class palindrome {
	public static void main(String[] args) {
		int n=345;
		int r=0;
		int m=n;
		int rev=0;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		//System.out.println(rev);
		if(m==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}

