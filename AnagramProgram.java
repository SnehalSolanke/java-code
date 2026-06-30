package inheritance;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
	String s1="cat";
	String s2="act";
	
	char c1[]=s1.toCharArray();
	char c2[]= s2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	if(Arrays.equals(c1, c2))
	{
		System.out.println("Its Anagram");
	}
	else
	{
		System.out.println("not an Anagram");
	}
	}

}
