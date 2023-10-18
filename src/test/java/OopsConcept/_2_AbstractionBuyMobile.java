package OopsConcept;

public class _2_AbstractionBuyMobile extends _1_AbstractionAddToCart {

	@Override
	public void login() 
	{
		String username = "poojanirmal";
		String password = "Pooja@098";
		String both = username + password;
		System.out.println(both);
	}

	@Override
	public void searchprod() 
	{
		System.out.println("search for mobile");
		
	}

	@Override
	public void addToCard()
	{
		System.out.println("add mobile into the cart");
		
	}
	
	public void buy()
	{
		System.out.println("buy the mobile");
	}
	
	public static void billReceipt()
	{
		System.out.println("receive the bill receipt");
	}

}
