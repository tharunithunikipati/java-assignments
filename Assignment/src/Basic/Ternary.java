package Basic;
import java.util.*;
public class Ternary {
		public static void main(String args[]) {
			int numa=12;
			int numb=33;
			int numc= 89;
			int numd=45;
			System.out.println(numa+" ,"+numb+" ,"+numc+" ,"+numd+" ,");
			int min = numb<numa?numb:numa;
			int max=numd<numc?numd:numc;
			System.out.println("the greatest of the four numbers:"+ max);
			
		}

	}



