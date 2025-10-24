package Basic;
public class Sample {
	public static void main(String[] args) {
		int withdrawl_amt=8000,bal_amount=7000;
		if(bal_amount>=withdrawl_amt) {
			bal_amount=withdrawl_amt;
			System.out.println("Balance:"+bal_amount);
		}
		else {
			System.out.println("Insufficient Funds");
		}
	}
}
