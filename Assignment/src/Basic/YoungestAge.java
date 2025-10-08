package Basic;
public class YoungestAge {
	public static void main(String args[]) {
		int age1=24;
		int age2=90;
		int age3=87;
		int Youngest;
		if(age1<age2 && age1<age3) {
			Youngest=age1;
			
		}else if(age2<age3 && age2<age1){
			Youngest=age2;
		} else {
			Youngest=age3;
		}
		System.out.println("Youngest is:"+ Youngest);
	}
	}

