package accessspecifier;
class Amazon{
	void display()
	{
		System.out.println("Please add to cart");
	}
}

class Addition extends Amazon{
	void add()
	{
	   System.out.println("this is addition method");
    }
	void mul()
	{
	   System.out.println("this is multiplication"
	   		+ " method");
    }
	}	

	class flipcart extends Addition{
		void sub()
		{
			System.out.println("this is addition method");
		}
		/*void add()
		{
		   System.out.println("this is addition method");
	   */ }

public class Program1 {
public static void main(String[] args) {
		  Amazon a1 = new flipcart();
		// a1.add();
		 //a1.mul();
		 a1.display();
		 
		 flipcart f1=new flipcart();
		 f1.sub();
	  
		}
	}

