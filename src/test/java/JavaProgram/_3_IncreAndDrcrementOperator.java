package JavaProgram;

public class _3_IncreAndDrcrementOperator {
	
	
	public static void main(String args[]) {
		
//		++ increase by 1
//		-- decrease by 1
		
//		pre increment
		
		int p = 10;
		int q = ++p;
		System.out.println(p);//11
		System.out.println(q);//11
		
//		post increment
		
		int r = 20;
		int s = r++;
		System.out.println(r);//21
		System.out.println(s);//20
		
//		pre decrement
		
		int t = 30;
		int u = --t;
		System.out.println(t);//29
		System.out.println(u);//29
		
//		post decrement
		
		int v = -3;
		int w = v--;
		System.out.println(v);//-4
		System.out.println(w);//-3
	}

}
