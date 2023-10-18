package OopsConcept;

public class AbstractionBuyLaptop extends _1_AbstractionAddToCart {

	@Override
	public void login()
	{
		String username = "rajanirmal";
		String password = "raja@098";
		String both = username + password;
		System.out.println(both);
		
	}

	@Override
	public void searchprod()
	{
		System.out.println("search for laptop");
	}

	@Override
	public void addToCard() 
	{
		System.out.println("add laptop into the cart");
	}

	public static void billReceipt()
	{
		System.out.println("receive the bill receipt");
	}
	
	public void returnproduct()
    {
		System.out.println("return product because of some defect");
    }
}
