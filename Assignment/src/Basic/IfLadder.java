package Basic;
public class IfLadder {
	public static void main(String[] args) {
	int units=500;
	float price=0.0f;
	if(units>=10 && units<=100) 
		price=units*1.0f;
	else if(units>100 && units<=200)
		price=units*2.0f;
	else if(units>200 && units<=300)
		price=units*3.0f;
	else
		price=units*4.0f;
	System.out.println("price value:"+price);	
	}
	}


