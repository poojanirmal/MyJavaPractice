package FirstProgramme;

public class _4_ConditionalOperator {
	
	
	public static void main(String args[]) {
		
//		&& And operator(circuit operator)
//		|| or operator
//		< less than operator
//		> greater than operator
//		<= less than equals to
//		>= greater than equals to
//		!= not equals to
//		== equals to (used in primitive data type ) .equals (used in String)
		
		
//		And result
//		T T = T This condition i used
//       T F = F
//		F T = F
//		F F = F
		
		String userName = "Pooja";
		String browser = "Chrome";
		
		if(userName.equals("Pooja") && browser.equals("Chrome"))
		{
			System.out.println("The name of username is -> "+ userName +" And he use the browser is -> "+browser);
		}
		else if(userName.equals("Pooja") && browser.equals("firefox"))
		{
			System.out.println("This is true statement");
		}
		else
		{
			System.out.println("The username not found");
		}
		
//		or result
//		T T = T
//		T F = T
//		F T = T
//		F F = F
		
		String QA = "Pooja";
		
		
		if(QA.equals("Rahul") || QA.equals("Pooja"))
		{
			System.out.println("The QA name is "+ QA );
		}
		else 
		{
			System.out.println("The result not matched");
		}
		
//		other conditional opeartor
		
//		for>
		
		int x = 100;
		int y = 200;
		int z = 50;
		
		if(x>y)
		{
			System.out.println("x is greater number");
		}
		else if(x>z)
		{
			System.out.println("x is greater number");
		}
		else if(y>z)
		{
			System.out.println("y is greater number");
		}
		else
		{
			System.out.println("z is greatest number");
		}
		
//		for == 
		int p = 500;
		
		if(p == 300)
		{
			System.out.println("The number is correct");
		}
		else
		{
			System.out.println("The number is mismatched");
		}
		
//		for >=
		
		int q = 200;
		
		if(q >= 100)
		{
			System.out.println("The number is equals to or less than 200");
		}
		else
		{
			System.out.println("The number is greater than 200");
		}
		
	}
	
	
	

}
