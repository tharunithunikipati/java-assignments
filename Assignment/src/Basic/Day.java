package Basic;
import java.util;
public class Day {
public static void main(String args[]) {
	int day=2;
	String result = switch(day) {
	case 1->"monday";
	case 2->"tuesday";
	case 3->"wednesday";
	case 4->"friday";
	case 5->"saturday";
	case 6->"sunday";
	default->"please enter proper input value";
	};
	System.out.println("result is:"+result);
}
}
