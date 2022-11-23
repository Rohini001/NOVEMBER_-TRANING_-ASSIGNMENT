package com.example.assignment.strings;

import java.util.Scanner;

public class AscnDescString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter string :");
		String s = scn.nextLine();
		
		System.out.println("Descending order :");
		char ch[]= s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(Character.toLowerCase(ch[j])>Character.toLowerCase(ch[i])) {
					char temp= ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}	
		System.out.println(ch);

		System.out.println("Ascending order :");	
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(Character.toLowerCase(ch[j])<Character.toLowerCase(ch[i])) {
					char temp= ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
			System.out.println(ch);
	}

}
