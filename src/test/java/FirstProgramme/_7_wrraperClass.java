package FirstProgramme;

public class _7_wrraperClass {
	
	
	public static void main(String args[]) {
		
//		String ti int
		
		String i = "100";
		
		System.out.println(i+10);//10010
		
		int p = Integer.parseInt(i);
		
		System.out.println(p+10);//110
		
//		int to string
		
		int k = 200;
		System.out.println(k+20);//220
		
		String s = String.valueOf(k);
		
		System.out.println(s+20);//20020
		
//		float to string
		
		float f = 0.010f;
		
		System.out.println(f+10);//10.010
		
		String x = String.valueOf(f);
		
		System.out.println(x+10);//0.01010
		
//		string to double
		
		String z = "100";
		
		System.out.println(z+200);//100200
		
		double d = Double.parseDouble(z);
		
		System.out.println(d+200);//300
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
