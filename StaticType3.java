package accessspecifier;

import Collection.A;

public class StaticType3 extends A
{
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);
		
		StaticType3 obj= new StaticType3();
		System.out.println(obj.e);
		System.out.println(obj.f);
		//System.out.println(obj.g);
		//System.out.println(obj.h);
	}
	
}
