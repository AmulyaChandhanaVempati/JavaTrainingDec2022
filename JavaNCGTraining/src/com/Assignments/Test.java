package com.Assignments;

public class Test {

	public static void main(String[] args)

	{
		String str;
		//int i=null;
		//System.out.println(i);
		Integer x =null;
		System.out.println(x);
		
		int x1 =10;
		int y1 =10;
//		x1.hashCode();
		Integer i = new Integer(10);
		Integer i1 = new Integer(10);
		String str1 = "5465";
		String str2 = "5465";
		System.out.println("Str1 : "+ str1.hashCode());
		System.out.println("i hash code :"+i.hashCode());
		System.out.println("i hash code :"+i1.hashCode());
		
	}

}
