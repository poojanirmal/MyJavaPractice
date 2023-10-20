package Inheritance.Hirarchical_Inheritance;

public class _2_Govt_Hospital extends _1_Hospitals {

	@Override
	public void polioService()
	{
		System.out.println("Goverment--Polio services");
	}
	
	public static void oxygenService()
	{
		System.out.println("Goverment--Oxygen Services");
	}
	
	public static void icuSection()
	{
		System.out.println("Goverment--ICU Service");
	}
}
