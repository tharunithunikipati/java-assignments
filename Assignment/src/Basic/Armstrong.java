package Basic;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		int n=1634,count=0,digit=0,temp1=0,temp2=0;
		double sum=0;
		temp1=n;//hjkrgfjg
		while(temp1>0) {
			temp1=temp1/10;
			count++;	
		}
		System.out.println("count:"+count);
		temp2=n;
		while(temp2>0) {
			digit=temp2%10;
			sum=(sum+Math.pow(digit,count));
			temp2=temp2/10;	
		}
		
		if(sum==n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not");
		}
	}
}
