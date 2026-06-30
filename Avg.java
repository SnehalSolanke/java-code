package inheritance;

public class Avg {

	public static void main(String[] args) {
	int input []= new int[4];
	input[0]=10;
	input[1]=20;
	input[2]=30;
	input[3]=40;
	int sum=0;
	double Average=0;
	for(int i=0;i<input.length;i++)
	{
		sum=sum+input[i];
	}
	Average= sum/input.length;
	System.out.println(sum);
	System.out.println(Average);
	}
}
