package inheritance;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {
	int input[]=new int[4];
	input[0]=12;
	input[1]=45;
	input[2]=90;
	input[3]=100;
	System.out.println("Initial Array is: "+Arrays.toString(input));
	int output[]=new int[4];
	
	for(int i=0,j=output.length-1;i<input.length;i++,j--)
	{
		output[j]=input[i];
	}
     
     System.out.println("Reverse Array is: "+Arrays.toString(output));
     
	}

}
