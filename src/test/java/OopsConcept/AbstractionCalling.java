package OopsConcept;

public class AbstractionCalling  {
	
	public static void main(String args[])
	{
		
		AbstractionBuyLaptop abstractionBuyLaptop = new AbstractionBuyLaptop();
		abstractionBuyLaptop.addToCard();
		abstractionBuyLaptop.login();
		abstractionBuyLaptop.searchprod();
		AbstractionBuyLaptop.billReceipt();
		abstractionBuyLaptop.returnproduct();
		
		
		_2_AbstractionBuyMobile abstractionBuyMobile  = new _2_AbstractionBuyMobile();
		abstractionBuyMobile.addToCard();
		abstractionBuyMobile.buy();
		abstractionBuyMobile.login();
		abstractionBuyMobile.searchprod();
		_2_AbstractionBuyMobile.billReceipt();
		
		
		//TopCasting (only overriden methods)
		_1_AbstractionAddToCart abstractionAddToCart = new AbstractionBuyLaptop();
		abstractionAddToCart .addToCard();
		abstractionAddToCart .login();
		abstractionAddToCart .searchprod();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
