package JavaBasicQuestion;

public class _4FactorialProgram {
	
	 public static void main(String[] args) {

	        int num = 10;
	        long factorial = 1;
	        for(int i = 1; i <= num; ++i)
	        {
	             factorial = factorial * i;
	            //factorial *= i;
	        }
	        System.out.printf("Factorial of "+ num + " = " + factorial);
	    }

}
