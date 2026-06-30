package inheritance;

public class CheckTheValueAndIndexing {

	public static void main(String[] args) {
		int input[]=new int[5];
		input[0]=10;
		input[1]=20;
		input[2]=30;
		input[3]=100;
		input[4]=90;
		int notocheck=100;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]==notocheck)
			{
			System.out.println("yes mentioned value is present");
	        System.out.println("value is present at index:"+i);
			}
		}
          
	}

}
