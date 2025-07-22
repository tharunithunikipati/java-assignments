package Basic;

public class NestedTernary {
	public static void main(String args[]) {
		int a=1,b=9,c=8;
		int res=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("value:"+res);
		}

}
