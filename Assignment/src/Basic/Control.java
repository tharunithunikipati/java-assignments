package Basic;
public class Control {
	public static void main(String args[]) {
		int withdrawl_amt=600,bal_amount=7000;
		if(bal_amount>=withdrawl_amt) {
			bal_amount=withdrawl_amt;
			System.out.println("Balance:"+bal_amount);
			
		}
	}
}
