package FirstProgramme;

import java.util.ArrayList;

public class _6_ArrayList {
	
	public static void main(String args[])
	{
		
//		Generic Array
		ArrayList<String> studendInfo = new ArrayList<String>();
		
		studendInfo.add("Pooja");
		studendInfo.add("Nirmal");
		studendInfo.add("Female");
		studendInfo.add("25");
		
		
		System.out.println(studendInfo.size());
		
		for(int i = 0;i<studendInfo.size();i++)
		{
			System.out.println(studendInfo.get(i));
		}
		
		studendInfo.remove(0);
		
		studendInfo.add("Vitthal");
		
		for(int i = 0;i<studendInfo.size();i++)
		{
			System.out.println(studendInfo.get(i));
		}
		
		studendInfo.clear();
		System.out.println(studendInfo.size());
		
//		Raw type ArrayList
		
		ArrayList ar = new ArrayList();
		
		ar.add("Pooja");
		ar.add(100);
		ar.add(255);
		
		for(int i = 0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
//		Object ArrayList
		
		ArrayList<Object> emp = new ArrayList<Object>();
		
		emp.add("Rahul");
		emp.add('M');
		emp.add(29);
		emp.add(4.7);
		
		for(int i = 0;i<emp.size();i++)
		{
			System.out.println(emp.get(i));
		}
		
		
		
		
	}

}
