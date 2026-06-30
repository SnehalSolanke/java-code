package inheritance;

public class SwappingofTwoNoMathopertion {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("Value of A is: "+a);
    System.out.println("Value of B is: "+b);
    
    a=a+b;// a=30
    b=a-b;  // b=10->swapping done for b
    a=a-b;  // a=20->swapping done for a
    System.out.println("Swap Value of A is: "+a);
    System.out.println("Swap Value of B is: "+b);
    
	
	

	}

}
