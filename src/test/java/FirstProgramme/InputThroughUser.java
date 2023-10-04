package FirstProgramme;

import java.util.Scanner;

public class InputThroughUser {
	
	public static void main(String args[]) {
		
//		Scanner sc = new Scanner(System.in);
//		String i = sc.next();
//		sc.close();
//		
//		TypesOfMethods typesOfMethods = new TypesOfMethods();
//		System.out.println(typesOfMethods.browserDriverName(i));
		
		 Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		sc.close();
		
		TypesOfMethods typesOfMethods = new TypesOfMethods();
		System.out.println(typesOfMethods.add(p, q));
		
		
		
	}

}
