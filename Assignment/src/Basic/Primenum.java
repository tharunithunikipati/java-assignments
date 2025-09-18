package Basic;
import java.util.*;
public class Primenum {

	public static void main(String[] args) {
		int n=11;
		boolean isPrime=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
				
			}
		}
		System.out.println(n+(isPrime?"is Prime":"is not Prime"));
	}

}
