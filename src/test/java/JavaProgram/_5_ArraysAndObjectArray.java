package JavaProgram;



public class _5_ArraysAndObjectArray {
	
	public static void main(String args[]) {
		
//		size of array is fixed ,similar kind of data stored.
		int x[] = new int[3];
		
	    x[0] = 100;
	    x[1] = 200;
	    x[2] = 300;
	    
	    for(int i = 0;i<x.length;i++)
	    {
	    	System.out.println(x[i]);
	    	if(x[i] == 200)
	    	{
	    		System.out.println("The index value of number is -> "+i);
	    	}
	    }
		
		System.out.println("The length of the array is -> "+x.length);
		
//		in object type of array we can stored multiple type of data
		
		Object emp[] = new Object[3];
		
		emp[0] = "Pooja";
		emp[1] = 'F';
		emp[2] = 26;
		
		 for(int k = 0;k<emp.length;k++)
		    {
		    	System.out.println(emp[k]);
		    }
	}

}
