package Basic;
//basic 
public class SwapNumbers {
public static void main(String args[]) {
	int a=9;
	int b=8;
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a+" "+b);
}
}
