package JavaBasicQuestion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		//Even or Odd
		
		int i = 34;
		if(i % 2 == 0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		//Another method
//		Scanner sc = new Scanner(System.in);
//		int q = sc.nextInt();
//		if(q % 2 == 0)
//		{
//			System.out.println("number is even");
//		}
//		else
//		{
//			System.out.println("Number is odd");
//		}
// current date and time
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));
	    
// prime or not
	    int r = 67;
	    boolean flag = false;
	    for(int u=2;u<=r/2;u++)
	    {
	    if(r % u==0)
	    {
	    flag = true;
	    break;
	    }
	    }

	    if(!flag)
	    {
	    System.out.println("num is prime");
	    }
	    else
	    {
	    System.out.println("not a prime num");
	    }
		
// reverse String
	    String inputted = "Pooja vitthal Ghare";
	    StringBuilder input = new StringBuilder();
	    input.append(inputted);

	    input.reverse();
	    System.out.println(input);

// swapping two number
	    
	    int first = 100, second =200;
	    
		int temporary = first;
		first = second;
		second = temporary;
		
		System.out.println(first);
		System.out.println(second);
		
// reverse number
		int rev = 3456, reverse = 0;
		for(; rev !=0;rev/=10)
		{
		int digit = rev % 10;
		reverse = reverse*10+digit;
		}
		System.out.println(reverse);
		 


		
		
		
		
		
		
		
		
		
		
		
	}

}
