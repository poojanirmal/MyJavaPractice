package JavaBasicQuestion;

public class _5ReverseString {
	
	   public static void main(String[] args)
	    {
	        String input = "Geeks for Geeks";
	 
	        // getBytes() method to convert string
	        // into bytes[].
	        byte[] strAsByteArray = input.getBytes();
	 
	        byte[] result = new byte[strAsByteArray.length];
	 
	        // Store result in reverse order into the
	        // result byte[]
	        for (int i = 0; i < strAsByteArray.length; i++)
	            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
	 
	        System.out.println(new String(result));
	        
//another method
	        String inputed = "Geeks for Geeks";
	        
	        StringBuilder input1 = new StringBuilder();
	 
	        // append a string into StringBuilder input1
	        input1.append(inputed);
	 
	        // reverse StringBuilder input1
	        input1.reverse();
	 
	        // print reversed String
	        System.out.println(input1);
	        
//another method
	        String originalStr = "Hello";
	        String reversedStr = "";

	        for (int i = 0; i < originalStr.length(); i++) {
	          reversedStr = originalStr.charAt(i) + reversedStr;
	        }

	        System.out.println("Reversed string: "+ reversedStr);
	        
	        
	        
	        
	        
	    }
	
	
	
}


