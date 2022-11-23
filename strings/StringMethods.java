package com.example.assignment.strings;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = " rohini ";
		String s2 = "rohini";
		String s3 = "ROHINI";
		String s4 = "java";
		String s5 = "";
		int x=3;
		if(x==3)
			x=4;
			System.out.println(x);
		System.out.println(s5.isEmpty());  
		System.out.println(s2.isEmpty());  
		
		System.out.println(s1.equals(s2));// true because content and case is same
		System.out.println(s1.equals(s3));// false because case is not same
		System.out.println(s1.equals(s4));
		
		System.out.println(s1+"javatpoint");//without trim()  
		System.out.println(s1.trim()+"javatpoint");//with trim()
		
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored 
		
		System.out.println(s1.compareTo(s2));//0 because both are equal 
		
		System.out.println(s1.substring(2,4));//returns va  
		System.out.println(s1.substring(2));//returns vatpoint  
		
		System.out.println(s1.compareToIgnoreCase(s2));  
		
	}

}
