package Basic;
public class Test {
public static void main(String args[]) {
	int count=0;
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=7;j++) {
			++count;
			System.out.format("\u2665 ");
		}
		System.out.println(" ");
	}
}
}
