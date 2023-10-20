package PatternPrinting;

public class StarPattern {

	public static void main(String args[])
	{
//		Star pattern
//		1.Triangle pattern
//		*
//		**
//		***
//		****
//		*****
		for(int i =0;i<=4;i++)
		{
		 for(int j=0;j<=i;j++)
		{
		 System.out.print("*");
		}
		 System.out.println(" ");
		}

		System.out.println(".......................");
		
//		2.Reverse Triangle Pattern
//		*****
//		****
//		***
//		**
//		*
		for(int i=0;i<=4;i++)
		{
		 for(int j=4;j>=i;j--)
		{
		 System.out.print("*");
		}
		 System.out.println(" ");
		}

		System.out.println(".......................");
		
//		3.Both Combine
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		for(int i=0;i<=4;i++)
		{
		 for(int j=0;j<=i;j++)
		{
		 System.out.print("*");
		}
		 System.out.println(" ");
		}

		for(int i=0;i<=4;i++)
		{
		 for(int j=4;j>i;j--)
		{
		 System.out.print("*");
		}
		 System.out.println(" ");
		}

		System.out.println(".......................");
		
//		4.Star With Space In Triangle Form
//		---*
//		--**
//		-***
//		****
		for(int i=1;i<=4;i++)
		{
		 for(int j=3;j>=i;j--)
		{
		 System.out.print(" ");
		}
		 for(int k=1;k<=i;k++)
		{
		 System.out.print("*");
		}
		 System.out.println(" ");
		}

		System.out.println(".......................");
		
//		5.Reverse of Star with Space
//		****
//		-***
//		--**
//		---*
		for(int i=1;i<=4;i++)
		{
		 for(int j=1;j<i;j++)
		{
		 System.out.print(" ");
		}
		for(int k=4;k>=i;k--)
		{
		 System.out.print("*");
		}
		System.out.println(" ");
		}
		
		System.out.println(".......................");
		
//		6.Both combine
		
		for(int i=1;i<=4;i++)
		{
		 for(int j=3;j>=i;j--)
		{
		 System.out.print(" ");
		}
		 for(int k=1;k<=i;k++)
		{
		 System.out.print("*");
		}
		 System.out.println(" ");
		}
		for(int i=1;i<=4;i++)
		{
		 for(int j=1;j<i;j++)
		{
		 System.out.print(" ");
		}
		 
		 
		for(int k=4;k>=i;k--)
		{
		 System.out.print("*");
		}
		System.out.println(" ");
		}
		
		System.out.println(".......................");
		
//		6.Pyramid pattern
//		   *
//		 *   *
//	   *   *   *
//   *   *   *   *
	
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 3; j>=i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				System.out.print(" *");
			}
			System.out.println(" ");
		}
		
		System.out.println(".......................");
		
//		7.Alphabetical pattern
//		A
//		A B
//		A B C
//		A B C D
//		A B C D E

		int alpha = 65;
		for (int i = 0; i <= 4; i++) 
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print((char) (alpha + j) + " ");
			}
			
			System.out.println(" ");
		}
		
		System.out.println(".......................");


//		8.Another Type Of Alphabetical Pattern
//		A
//		B B
//		C C C
//		D D D D
//		E E E E E

		int beta = 65;

		for (int i = 0; i <= 4; i++) 
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print((char) beta + " ");
			}
			beta++;
			System.out.println(" ");
		}
		
		
		
	}
}
