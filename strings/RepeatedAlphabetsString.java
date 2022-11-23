package com.example.assignment.strings;

public class RepeatedAlphabetsString {

	public static void main(String[] args) {
		int count = 0;
		String str = "Yash Technologies";
		char ch[] = str.toCharArray();
		System.out.println("Number of alphabets repeated in a given string: "); 
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}
			}
			if (count > 1 && ch[i] != '0') {
			System.out.println(ch[i]);

			}
		}
	}

}
