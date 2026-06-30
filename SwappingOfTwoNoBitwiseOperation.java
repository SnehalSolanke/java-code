package inheritance;

public class SwappingOfTwoNoBitwiseOperation {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("Value of A is: "+a);
    System.out.println("Value of B is: "+b);
    
    a=a^b;
    b=b^a;
    a=a^b;
    System.out.println("Swap Value of A is: "+a);
    System.out.println("Swap Value of B is: "+b);

	}

}
