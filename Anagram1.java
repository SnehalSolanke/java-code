package inheritance;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
	String input="cat";
	String output="act";
	
	char c1[]=input.toCharArray();
	char c2[]=output.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	if(Arrays.equals(c1, c2))
	{
		System.out.println("Ita Anagram");
	}
	else
	{
		System.out.println("Its not Anagram");
	}
	
	
	}
}