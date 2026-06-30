package inheritance;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
	int input[]=new int[4];
	input[0]=20;
	input[1]=80;
	input[2]=60;
	input[3]=100;
	
	int output[]=new int[4];
	for(int i=0,j=output.length-1;i<input.length;i++,j--)
	{
		output[j]=input[i];
	}
	System.out.println("Input Array is"+Arrays.toString(input));
	System.out.println("Input Array is"+Arrays.toString(output));
	}
}