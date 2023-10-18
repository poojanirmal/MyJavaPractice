package JavaProgram;

import java.util.Scanner;

public class InputThroughUser {
	
	public static void main(String args[]) {
		
		// scanner run at a time only one method(by using different reference name till not)
		
		Scanner sc1 = new Scanner(System.in);
		String i = sc1.next();
		sc1.close();
		
		TypesOfMethods typesOfMethods1 = new TypesOfMethods();
		System.out.println(typesOfMethods1.browserDriverName(i));
		
//		 Scanner sc2 = new Scanner(System.in);
//		int p = sc2.nextInt();
//		int q = sc2.nextInt();
//		sc2.close();
//		
//		TypesOfMethods typesOfMethods2 = new TypesOfMethods();
//		System.out.println(typesOfMethods2.add(p, q));
		
		
		
	}

}
