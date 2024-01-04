package JavaBasicQuestion;

public class _12NoPrimeOrNot {
	
	 public static void main(String[] args)
	 {

		    int num = 29;
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)//make the condition reverse if flag = false... ! make it true
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		    
		    
		  }

}
