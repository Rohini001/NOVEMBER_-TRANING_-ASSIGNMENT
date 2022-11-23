package com.example.assignment.strings;

public class StringBufferBuilderExample {

	public static void main(String[] args) {
		System.out.println("StringBufferExample");
		StringBuffer sb=new StringBuffer("Hi!");
		sb.append("Rohini");
		System.out.println("The final String is - " + sb); 

		System.out.println("StringBuilderExample"); 
		StringBuilder builder=new StringBuilder("Welcome");
		builder.append("Yash Technologies");
		System.out.println("The final String is - " + builder); 

	}

}
