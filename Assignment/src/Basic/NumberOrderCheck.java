package Basic;

public class NumberOrderCheck {
	public static void main(String args[]) {
		int num1=20;
		int num2=10;
		int num3=6;
		if(num1<num2 && num2<num3) {
			System.out.println("numbers are in increasing order");
		}else if(num1>num2 && num2>num3) {
			System.out.println("numbers are in decreasing order");
		}else {
			System.out.println("numbers are neither in increasing order nor in decreasing order");
		}
	}

}
