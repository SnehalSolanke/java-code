package inheritance;

public class Palindrome2 {

	public static void main(String[] args) {
	String input="madam";
	String output="";
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++char c1[]= input.toCharArray();
	for(int i=input.length()-1;i>=0;i--)
	{
	    char c1=input.charAt(i);
		output=output+c1;
	}
   if(input.equals(output))
   {
	   System.out.println("Its palindrome");
   }
   else
   {
	   System.out.println("Its not palindrome");
   }
	}

}
