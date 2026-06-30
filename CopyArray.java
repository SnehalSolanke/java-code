package inheritance;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
	int input[]=new int[4];
	input[0]=10;
	input[1]=20;
	input[2]=30;
	input[3]=40;
	
	int output[]=new int[4];
	
	for(int i=0;i<input.length;i++)
	{
		output[i]=input[i];
	}
		System.out.println("Input Array is: "+Arrays.toString(input));
		System.out.println("Input Array is: "+Arrays.toString(output));
	}

}
