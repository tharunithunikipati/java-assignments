package Basic;
public class AreavsPerimeter {









public static void main(String args[]) {
	int length=20;
	int breath=60;
	int area=length*breath;
	int perimeter=2*(length+breath);
	System.out.println("Area:"+area);
	System.out.println("perimeter:"+perimeter);
	if(area>perimeter) {
		System.out.println("area is greater");
	}else if(perimeter>area) {
		System.out.println("perimeter is greater");
	}else {
		System.out.println("both are same");
		
	}
}
}
