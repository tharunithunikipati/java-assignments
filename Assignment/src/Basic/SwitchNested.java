package Basic;

public class SwitchNested {
public static void main(String args[]) {
	 int year=2;
	 String dept="Cse";
	 switch(year) {
	 case 1:
		 System.out.println("C,physics,English");
	 case 2:
		 switch(dept) {
		 case "Cse":
			 System.out.println("java, python,os");
		 case "Ece":
			 System.out.println("Electronics and Comunication");
			 break;
		 case "Eee":
			 System.out.println("Electrical and Electronics");
			 break;
			 default:
				 System.out.println("pls enter proper i/p value");
		 }
		 break;
		 default:
			 System.out.println("Enter valid values");
	 }	
}
}
