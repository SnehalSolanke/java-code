package inheritance;

import java.util.Arrays;

public class CheckArraysEqualorNot {

	public static void main(String[] args) {
	int input[]=new int[4];
	input[0]=88;
	input[1]=54;
	input[2]=100;
	input[3]=25;
	
	int output[]=new int[4];
	for(int i=0;i<input.length;i++)
	{
		output[i]=input[i];
	}
     if(Arrays.equals(input, output)==true)
     {
    	    System.out.println("Two Arrays are equal");
     }
     else
     {
    	 System.out.println("Two Arrays are not equal");
     }
	}

}
