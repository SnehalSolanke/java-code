package inheritance;

public class CountAlphabet {
	static int countofaplha=0;
	static int countofDigit=0;
	static int countofwhitespace=0;
	static int countofspecialchar=0;
	
	public static void main(String[] args) {
	String input ="snehal@56  ";
	char c1[]=input.toCharArray();
	for(int i=0;i<input.length();i++)
	{
		boolean b1=Character.isAlphabetic(c1[i]);
		if(b1==true)
		{
			countofaplha++;
		}
		boolean b2=Character.isDigit(c1[i]);
		if(b2==true)
		{
			countofDigit++;
		}
		boolean b3=Character.isWhitespace(c1[i]);
		if(b3==true)
		{
			countofwhitespace++;
		}
	}
	System.out.println("Total count of alphabet is:"+countofaplha);
	System.out.println("Total count of Digit is:"+countofDigit);
	System.out.println("Total count of white space is:"+countofwhitespace);
	countofspecialchar=input.length()-(countofaplha+countofDigit+countofwhitespace);
	System.out.println(countofspecialchar);
	
	}

}