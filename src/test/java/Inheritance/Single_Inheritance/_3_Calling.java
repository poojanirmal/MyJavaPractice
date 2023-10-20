package Inheritance.Single_Inheritance;

public class _3_Calling {

	public static void main(String[] args) {
		
		
		_2_Car car = new _2_Car();
		
		car.start();
		car.stop();
		car.autoMirror();
		car.braked();
		car.clutch();
		System.out.println(car.type);
		_1_Vehical.fuel();
		_2_Car.gear();
		
//		Top Casting = only the methods which are available in parent class(overriden and available in parent class)
		
		_1_Vehical vehical = new _2_Car();
		
		vehical.braked();
		vehical.clutch();
		vehical.start();
		vehical.stop();
		_1_Vehical.fuel();
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
