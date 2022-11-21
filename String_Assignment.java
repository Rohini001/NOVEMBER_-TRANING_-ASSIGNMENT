1) Create a program in which two string is input by the user and after that user will enter index in 
first string where we want to insert the second string and insert the second string at that index 
and create a new string 
Ans:  

package com.example.assignment;

import java.util.Scanner;

public class StrInsertAtIndex {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first string :\n");
		String firstStr = scn.nextLine();
		System.out.println("Enter second string :");
		String secondStr = scn.nextLine();
		System.out.println("Enter index :");
		int index = scn.nextInt();

		String str = new String();

		for (int i = 0; i < firstStr.length(); i++) {
			str += firstStr.charAt(i);
			if (i == index) {
				str += secondStr;
			}
		}
		System.out.println("String After insertion :"+str);
	}

}
o/p: 
Enter first string :
rohini
Enter second string :
bhushan
Enter index :
4
String After insertion :rohinbhushani

--------------------------------------------------------------------------
2)WAP to print the all alphabets of string in ascending and descending order.
Ans:

package com.example.assignment;

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

o/p:
Enter string :
Rohini
Descending order :
Roniih
Ascending order :
hiinoR

--------------------------------------------------------------------------------------------
3) WAP to remove all the vowels from the given string.

Ans:
package com.example.assignment;

import java.util.Scanner;

public class RemoveVowelsString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
					&& s.charAt(i) != 'u' && s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I'
					&& s.charAt(i) != 'O' && s.charAt(i) != 'U') {
				str = str + s.charAt(i);
			}
		}
		System.out.println(str);
	}

}

o/p:
Enter String :
Rohini
Rhn

----------------------------------------------------------------------------------------------
4) WAP to print the number of alphabets repeated in the given string.

package com.example.assignment;

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

o/p:
Number of alphabets repeated in a given string: 
s
h
e
o

------------------------------------------------------------------------------
5) WAP to demonstrate which is fast in processing StringBuilder or StringBuffer
package com.example.assignment;

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

o/p:
StringBufferExample
The final String is - Hi!Rohini
StringBuilderExample
The final String is - WelcomeYash Technologies

-----------------------------------------------------------------------------------
6) WAP to demonstrate how memory is allocated to string objects in memory heap and string 
constant pool.

package com.example.assignment;

public class MemoryforStringObjects {

	public static void main(String[] args) {
		String s1 = "Java";  //SCP
		String s2 = "Java";  //SCP
		String s3 = new String("Java"); //HEAP
		
		System.out.println((s1 == s2) + ", String are equal."); 
		System.out.println((s1 == s3) + ", String are not equal."); 
	}

}

o/p: 
true, String are equal.
false, String are not equal.
---------------------------------------------------------------------------------
7) WAP to demonstrate how garbage collector work when any memory is not referenced by string 
object.

package com.example.assignment;

public class GarbageCollection {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		GarbageCollection s1 = new GarbageCollection();
		GarbageCollection s2 = new GarbageCollection();
		s1 = null;
		s2 = null;   //by nulling the reference
		System.gc();
	}
}

o/p: 
object is garbage collected
object is garbage collected


