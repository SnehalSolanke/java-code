package inheritance;

public class AverageOfArray {

	public static void main(String[] args) {
	int input[]=new int[4];
	input[0]=10;
	input[1]=20;
	input[2]=30;
	input[3]=40;
	double sum=0;
	double Average=0;
	for(int i=0;i<input.length;i++)
	{
		sum=sum+input[i];// 0+10=10,10+20=30,30+30=60,60+40=100
	}
	System.out.println(sum);
	 Average = sum/input.length;
	 System.out.println(Average);
	 

	}

}
