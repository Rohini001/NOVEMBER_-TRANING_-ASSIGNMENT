package com.example.assignment.strings;

public class MemoryforStringObjects {

	public static void main(String[] args) {
		String s1 = "Java";  //SCP
		String s2 = "Java";  //SCP
		String s3 = new String("Java"); //HEAP
		
		System.out.println((s1 == s2) + ", String are equal."); 
		System.out.println((s1 == s3) + ", String are not equal."); 
	}

}
