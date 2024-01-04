package JavaProgram;

public class _8_StringManipulation {
	
	public static void main(String args[]) {
		
		
		String q = "Hii everyone , i am Pooja Nirmal";
		String w = "05@09@1997";
		String e = "..........Hello Everyone.........";
		String r = "hii everyone , I am pooja Nirmal";
		
		System.out.println(q.charAt(0));//character at index position 
		
		System.out.println(q.contains("Hii"));//containing the word
		
		System.out.println(q.indexOf('b'));//if some letter or word not present in string the output is -1
		
		System.out.println(q.indexOf('e'));//index position of character
		
		System.out.println(q.indexOf('i', 3));//index position of repeated character('i'+1)..it is used because the sequence of sentence not same some time spelling mistake
		
		System.out.println(q.isBlank());
		
		System.out.println(q.isEmpty());
		
		System.out.println(q.lastIndexOf('l'));//another way to find the length of string
		
		System.out.println(q.length());//to find the length of string
		
		System.out.println(q.replace('v', 't'));//changing the character in string
		
		System.out.println(w.replace('@', '#'));
		
          String str12 = "The transaction code is - 45$564 thank you";
		  
		 System.out.println(str12.substring(26,32));//when only no. get changed and all other remain same(.subSequence also work same)
          
         	
		System.out.println(q.toLowerCase());//to lower all the chara
		
		System.out.println(q.toUpperCase());//to upper the all chara
		
//		System.out.println(e.trim());
		
		System.out.println(q.compareToIgnoreCase(r));//compare both string 
		
		System.out.println(q.equalsIgnoreCase(r));//same or not by ignoring the upper or lower case
		
		System.out.println(q.equals(r));
		
		System.out.println(e.trim());//remove the extra place if we don't know the index value from where we need to trim
		
		//every word on next line for that used split method
		
		String t = "Aho ji I love you";
		
		String[] y = t.split(" ");
		
		for(int i = 0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
		
//		for reversing the word
		
		String[] u = t.split(" ");
		
		System.out.println(u[4]+" "+u[0]);
		
	//Questions practice
		
		String  x = "Standard Order 32456789 is created successfully for the account 789";
		System.out.println(x.substring(15, 23));
		
		int var= 5;
	       System.out.println(var++);//1+5 = 6 is output,now var become 6 for onward steps
	       System.out.println(var++);// var value 6 as it is but calculation on next step(6+1 but +1 is add on next step = 6 is ouput 
	       //( post means for next step)dont add or minus in this step used value as it is)
	       System.out.println(var);//+1+6=7 (+1 is coming from above step post increament and var value is 6 ) = 7 is is the output
		
		int war = 5;
		System.out.println(war--);//5
		System.out.println(--war);//3
		System.out.println(war);//3
		
		//print even no from array
		int []dr = {5,10,30,40,87,67};
		for(int i : dr)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
			int []d = {i};
		}
		
		
		
		
		
	}

}
