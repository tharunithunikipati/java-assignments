package Basic;

public class NestedIf {
	public static void main(String args[]) {
		        int age = 25, price = 0;
		        String day = "weekday";
		        if (day.equals("weekend")) {
		            System.out.println("Inside if");
		            if (age > 0) {
		                if (age < 13) {
		                    price = 40;
		                } else if (age > 65) {
		                    price = 30;
		                } else {
		                    price = 100;
		                }
		            } else {
		                System.out.println("Please provide The proper Input Value");
		            }
		        } else if (day.equals("weekday")) {
		            System.out.println("Else");
		            if (age > 0) {
		                if (age < 13) {
		                    price = 50;
		                } else if (age > 65) {
		                    price = 40;
		                } else {
		                    price = 200;
		                }
		            } else {
		                System.out.println("Please provide The proper Input Value");
		            }
		        } else {
		            System.out.println("Please provide The proper Input Value");
		        }
		        System.out.println("price:" + price);
		    }
		}
