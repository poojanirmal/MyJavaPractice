package JavaBasicQuestion;

import java.util.Scanner;

public class _2SwappingTwoNo {
	

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
   
	
  
     // System input
        int x, y, t;// x and y are to swap   
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value of X and Y");  
        x = sc.nextInt();  
        y = sc.nextInt();  
        System.out.println("before swapping numbers: "+x +"  "+ y);  
        /*swapping */  
        t = x;  
        x = y;  
        y = t;  
        System.out.println("After swapping: "+x +"   " + y);  
        System.out.println( );  
        
        
     } 
     
    
}
