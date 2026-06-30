package inheritance;

import java.util.Arrays;

public class a1 {

	public static void main(String[] args) {
	String input="dog";
	String output="god";
	if(input.length()!=output.length())
	{
		System.out.println("it never be an Anagram");
	}
		else
		{
			char c1[]=input.toCharArray();
			char c2[]=output.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Its Anagram");
			}
			else
			{
				System.out.println("Its not Anagram");
			}
		
		
	}
	}
}
	
	