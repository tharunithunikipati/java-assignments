package Basic;
public class UnaryOperator {
	public static void main(String args[]) {
		int a=5,b=6,c=4;
		System.out.println("A value is:"+a);
		b=a++;
		System.out.println("A value is:"+a);
		System.out.println("B value is:"+b);
		c=++a;
		System.out.println("A value is:"+c);
		System.out.println("B value is:"+a);
	}

}
