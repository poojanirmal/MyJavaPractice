package FirstProgramme;

public class TypesOfMethods {
	
	//no input no return
	public void myName()
	{
		System.out.println("my name is pooja");
	}
	
	public void studentList()
	{
		String studentName[] = new String[3];
		studentName[0] = "Pooja";
		studentName[1] = "Rahul";
		studentName[2] = "Nirmal";
		for(int i = 0; i<studentName.length;i++)
		{
			System.out.println(studentName[i]);
		}
		
	}
	
	//no input some return
	//1.
	
	public String countryName()
	{
		String nameOfCountry = "India";
		return nameOfCountry;
	}
	
	//2.
	
	public String browserName()
	{
		String nameOfBrowser = "chrome";
		return nameOfBrowser;
	}
	
	//some input some return
	//1.
	public int add(int a,int b)
	{
		int c = a+b;
		return c;
	}
	
	//2.
	public String browserDriverName(String browser)
	{
		if(browser.equals("chrome"))//here we can not used string manipulation ..we have to used browser name
		{
			System.out.println("The browser is -> ");
			//return browser; //either commented or this
		}
		else if(browser.equals("edge"))
		{
			System.out.println("The browser is -> ");
			//return browser;
		}
		else
		{
			System.out.println("no such browser");
		}
		
		//return "no such a browser found";
		return browser;
			
	}
	
	//3.
	
	public String driverName(String driver)
	{
		switch(driver.toLowerCase())//here we use string manipulation
		{
		case"chrome":
		System.out.println("The driver is -> ");
		break;
		//return browser; here we can not used like this
		
		case"opera":
			System.out.println("The driver is -> ");
		break;
		
		default:
			break;
		}
		return driver;
	}
	
	public static void main(String[] args) {
		
		//non void method called in print statement
		// in Array and Array list we can not used return type ultimately when we calling this method we have ti create another veriable and for loop for that
		
		TypesOfMethods typesOfMethods = new TypesOfMethods();
		
		typesOfMethods.studentList();
		
//		String[] name = typesOfMethods.studentList();
//		System.out.println(name); something weared output
		
		//typesOfMethods.myName();
		
		System.out.println(typesOfMethods.browserName());
		System.out.println(typesOfMethods.countryName());
		System.out.println(typesOfMethods.add(10, 20));
		System.out.println(typesOfMethods.browserDriverName("chrome"));
		System.out.println(typesOfMethods.driverName("opera"));
	
	
	
	}

}
