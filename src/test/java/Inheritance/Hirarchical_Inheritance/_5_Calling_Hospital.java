package Inheritance.Hirarchical_Inheritance;

public class _5_Calling_Hospital {
	
	public static void main(String args[]) {
		
		System.out.println(".................Calling the method of Emeregency Hospital...........");
		
		_4_Emeregency_Hospital eh = new _4_Emeregency_Hospital();
		
		eh.icuSection();
		eh.polioService();
		_1_Hospitals.oxygenService();
		
//		Top Casting 
		
		_1_Hospitals hospital = new _4_Emeregency_Hospital();
		
		hospital.polioService();
		_1_Hospitals.oxygenService();
		
		System.out.println(".............Calling the method of Private Hospital...............");
		
		_3_Private_Hospital ph = new _3_Private_Hospital();
		ph.icuSection();
		ph.operationTheater();
		ph.polioService();
		ph.specialRoom();
		_1_Hospitals.oxygenService();
		
		System.out.println("..........Calling the method of Government  Hospital............");
		
		_2_Govt_Hospital gh = new _2_Govt_Hospital();
		gh.polioService();
		_2_Govt_Hospital.icuSection();
		_2_Govt_Hospital.oxygenService();
		
	}

}
