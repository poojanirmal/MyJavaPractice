package Inheritance.Single_Inheritance;

public class _2_Car extends _1_Vehical {
	
	int type = 4;
	
	@Override
	public void start()
	{
		System.out.println("Car--start");
	}
	
	@Override
	public void stop()
	{
		System.out.println("car--stop");
	}
	
	public void autoMirror()
	{
		System.out.println("car--AutoMirror");
	}
	
	public static void gear()
	{
		System.out.println("car--Gear");
	}

}
