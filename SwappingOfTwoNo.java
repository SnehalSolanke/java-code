package inheritance;

public class SwappingOfTwoNo {

	public static void main(String[] args) {
	int a=10;
	int b=20;
    int temp;
    System.out.println("Value of A is: "+a);
    System.out.println("Value of B is: "+b);
    
	temp=a; // value of a is stored in temp
	a=b;    // value of b is stored in a
	b=temp; // value of temp is stored in b
	System.out.println("Swap Value of A is: "+a);
    System.out.println("Swap Value of B is: "+b);
	

	}

}
