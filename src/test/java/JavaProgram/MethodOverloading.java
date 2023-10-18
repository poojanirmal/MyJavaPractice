package JavaProgram;

public class MethodOverloading {
	//Method Overloading - having same method name but different parameter with different sequence
	 //String name;
	public void login()
	{
		System.out.println("no parameter");
	}
	
	public void login(String userName)
	{
		System.out.println("one parameter");
	}
	
	public void login(String userName,int password)
	{
		System.out.println("two parameter");
	}
	
	public void login(int mobNo,String email)
	{
		System.out.println("two parameter");
	}
	
	public static void main(String args[])
	{
//		 name = "pooja";
//		System.out.println(name);
		MethodOverloading methodOverloading = new MethodOverloading();
//		name = "pooja";
//		System.out.println(name);
		methodOverloading.login();
		methodOverloading.login("poojanirmal");
	}

}
