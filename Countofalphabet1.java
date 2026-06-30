package inheritance;

public class Countofalphabet1 {
     static int countofaplha=0;
     static int countofdigit=0;
     static int countofwhitespace=0;
     static int countofspecialchar=0;
     public static void main(String[] args) {
    	 String input="snehal@45  ";
    	 char c1[]=input.toCharArray();
    	 for(int i=0;i<input.length();i++)
    	 {
    		 boolean b1= Character.isAlphabetic(c1[i]);
    		 if(b1==true)
    		 {
    			 countofaplha++;
    		 }
    		 boolean b2= Character.isDigit(c1[i]);
    		 if(b2==true)
    		 {
    			 countofdigit++;
    		 }
    		 boolean b3= Character.isWhitespace(c1[i]);
    		 if(b3==true)
    		 {
    			 countofwhitespace++;
    		 }   		 
    	 }
    	 System.out.println("Total no of Alphabet: "+countofaplha);
     System.out.println("Total no of digit: "+countofdigit);
     System.out.println("Total no of whitespace: "+countofwhitespace);
     countofspecialchar=input.length()-(countofaplha+countofdigit+countofwhitespace);
     System.out.println(countofspecialchar);

	}

}
