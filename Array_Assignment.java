1) WAP to find third maximum number from list of numbers

package com.example.assignment.array;

public class ThirdMaxNum {

	public static int getThirdMax(int a[], int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 3];

	}

	public static void main(String[] args) {
		int a[] = { 10, 50, 60, 20, 5 };
		int max = getThirdMax(a, 5);
		System.out.println("3rd Max Number :" + max);
	}

}

o/p:
3rd Max Number :20

-------------------------------------------------------------------------------------
2) WAP to find duplicate numbers and there counting from list of numbers

package com.example.assignment.array;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] a = new int[] { 12, 24, 56, 42, 17, 24, 12,42 };
		int count = 0;
		System.out.println("Duplicate elements :");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					System.out.println(a[i]);
					break;
				}
			}
		}
		System.out.println("Count of duplicate numbers :" + count);
	}

}

o/p:
Duplicate elements :
12
24
42
Count of duplicate numbers :3

---------------------------------------------------------------------------------
3) WAP to create a dynamic array. Dynamic Array means when user want to input the number 
more than size of array it will increase the size of array without throwing exception.

package com.example.assignment.array;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Array size before adding elements :"+al.size());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("The dynamic array is: " + al);
		System.out.println("Array size after adding elements :"+al.size());
	}

}

o/p:
Array size before adding elements :0
The dynamic array is: [10, 20, 30, 40, 50]
Array size after adding elements :5

----------------------------------------------------------------------------------------

4) An Array contain the n numbers you have to find out combination which satisfy Pythagoras 
Template. ( Pythagoras templates:- 3*3+4*4==5*5)

package com.example.assignment.array;

import java.util.Scanner;

public class Pythagoras {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n = sr.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = sr.nextInt();
		}
		int a, b, c;
		boolean found= false;
		for (int i = 0; i < n - 2; i++)
		{
			for (int j = i + 1; j < n - 1; j++)
			{
				for (int k = i + 2; k < n; k++)
				{
					a = arr[i];
					b = arr[j];
					c = arr[k];
					if (a * a + b * b == c * c) {
						found= true;
						System.out.println("Pythagoras template :"+a + "  " + b + "  " + c);
					}
				}
			}
		}
		if(!found)
			System.out.println("Not found !");
		
	}

}

o/p:
Enter size of array :
5
Enter array elements :
2
3
4
5
6
Pythagoras template :3  4  5

--------------------------------------------------------------------------------------------------------
5) An Array Contain different numbers you have to find how many are even, odd, perfect and 
prime 

package com.example.assignment.array;

import java.util.Scanner;

public class EvenOddPerfectPrimeNum {

	public static void main(String[] args) {

		int[] arr = new int[5]; // { 2, 3, 5, 1, 6, 7, 9 };
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array elements :");
		for (int i = 0; i < 5; i++) {
			arr[i] = scn.nextInt();
		}
		// Even Number
		System.out.println("The Even Elements from the array: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

		// Odd Number
		System.out.println(" ");
		System.out.println("The Odd Elements from the array: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}

		/// Prime number
		System.out.println("\nPrime numbers in the array :");
		int count = 0;
		for (int j = 0; j < 5; j++) {
			for (int k = 1; k <= arr[j]; k++) {
				if (arr[j] % k == 0)
					count++;
			}
			if (count == 2)
				System.out.println(arr[j]);
			count = 0;

		}

		// Perfect number
		System.out.println(" ");
		int sum = 0, perfectNum = 0;
		for (int i = 0; i < arr.length; i++) {
			perfectNum = (int) Math.sqrt(arr[i]);
			sum = perfectNum * perfectNum;

			if (sum == arr[i])
				System.out.println("Perfect Number :" + arr[i]);
//				else
//					System.out.println("Not Perfect Number :" + arr[i]);
		}
	}
}

o/p:
Enter the array elements :
9
3
5
4
57
The Even Elements from the array: 
4  
The Odd Elements from the array: 
9 3 5 57 
Prime numbers in the array :
3
5
 
Perfect Number :9
Perfect Number :4
-----------------------------------------------------------------------------------------

6) Suppose that you are having an array of size N. now your task is to sort the half array that is 
from 0 to N/2 in ascending order and N/2+1 to N in descending order. 

package com.example.assignment.array;

public class SortHalfArrayAscDesc {

	public static void main(String[] args) {
		int[] a = {3, 2, 4, 1, 10, 30, 40, 20};
	      int n = a.length;	      
	      int temp;
	      for(int i=0;i < n-1;i++)
	      {
	         for(int j = 0;j < n/2; j++) { 
	        	 if(a[j]>a[j+1])
	             {
	               temp=a[j];
	               a[j]=a[j+1];
	               a[j+1]=temp;
	             }
	         }

	         for(int j = n/2;j < n-1; j++)
	         {
	             if(a[j] < a[j+1])
	             {
	                temp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	             }
	          }
	       }
	      System.out.println("Numbers of array in Ascending and Descending order :");
	       for(int i = 0; i < n; i++)
	          System.out.print(a[i] + " ");

	    }
	}

o/p:
Numbers of array in Ascending and Descending order :
1 2 3 4 40 30 20 10 
---------------------------------------------------------------------------------------------

7) WAP to find the LCM and HCF of array numbers.

package com.example.assignment.array;

import java.util.Scanner;

public class LCMHCFofArray {

	public static void main(String[] args) {
		int temp1, temp2, num1, num2, temp, hcf, lcm;
	      Scanner scanner = new Scanner(System.in);

	      System.out.print("Enter First Number: ");
	      num1 = scanner.nextInt();
	      System.out.print("Enter Second Number: ");
	      num2 = scanner.nextInt();

	      temp1 = num1;
	      temp2 = num2;

	      while(temp2 != 0){
	         temp = temp2;
	         temp2 = temp1%temp2;
	         temp1 = temp;
	      }

	      hcf = temp1;
	      lcm = (num1*num2)/hcf;

	      System.out.println("HCF of input numbers: "+hcf);
	      System.out.println("LCM of input numbers: "+lcm);
	}

}

o/p:
Enter First Number: 10
Enter Second Number: 35
HCF of input numbers: 5
LCM of input numbers: 70
------------------------------------------------------------------------------

8) You are given a sequence of Character in the form of Array. Now you have to put all vowels and 
consonants together in the array

package com.example.assignment.array;

public class VowelsConsonants {

	public static void main(String[] args) {
		String line = "Yash Technologies";
		int vowels = 0, consonants = 0;

		line = line.toLowerCase();
		for (int i = 0; i < line.length(); ++i) {
			char ch = line.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			}
			else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;
			}

		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}

}

o/p:
Vowels: 6
Consonants: 10
-----------------------------------------------------------------------------------------------

9) User will enter the element in M*M order matrix that is square matrix now you have to print 
first row, last row, first column, and last column elements. Code should be applicable for matrix 
of any order.

package com.example.assignment.array;

public class SquareMatrix {

	public static void main(String[] args) {

		int square[][] = { { 1, 3, 5 }, { 2, 4, 6 } };
		System.out.println("Square Matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
	}

}

o/p:
Square Matrix: 
1 3 5 
2 4 6 
-----------------------------------------------------------------------------------------------------

10) You are having array of strings. Now you have to arrange strings in array on the basis of the 
length of each string. Smallest string will be first and so on.

package com.example.assignment.array;

import java.util.Scanner;

public class SortStringArrayByLength {

	public static void main(String[] args) {
		
		String temp;
		String arr[] = new String[3];
		int n=arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		for(int i=0;i<n;i++){
		 arr[i] = sc.nextLine();
		}
		
		for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].compareTo(arr[j])>0) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
		}
		System.out.println("Strings after sorting :");
		for(String a:arr) {
        System.out.println(a);
		}
	}
}

o/p:
Enter String :
Banana
Grapes
Apple
Strings after sorting :
Apple
Banana
Grapes
------------------------------------------------------------------------------------

11) WAP to remove the String which is not palindrome string from the array of String.

package com.example.assignment.array;

public class RemoveNotPalindromeString {

	private static void printOnlyPalindrome(String str) {
		
		int strLength = str.length();
		String reverseStr = "";
		for (int i = strLength - 1; i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}
		
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {

		String[] stringArray = { "madam", "rohini", "sanas", "level", "Bhushan" };
		System.out.println("Palindrome Strings are :");
		for (int i = 0; i < stringArray.length; i++) {
			printOnlyPalindrome(stringArray[i]);
		}

	}
}

o/p:
Palindrome Strings are :
madam
sanas
level
-----------------------------------------------------------------------------------------------
12) WAP to sort array on the basis of unit place. For example we are having following numbers:-
	10,2,3,41,12,13,19,81,9. Output will be 10,41,81,2,12,3,13,19,9

package com.example.assignment.array;

import java.util.Collections;
import java.util.Vector;

public class SortArrBasisofUnitPlace {

//	public static void main(String[] args) {
//		int a[] = new int[] { 10, 2, 3, 41, 12, 13, 19, 81, 9 };		
//	}

	static void Sort(Vector<Integer> m, int n) {
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();
		Vector<Integer> v3 = new Vector<>();
		int i;

		for (i = 0; i < n; i++) {
			// If elements are even and divisible by 10
			if (m.get(i) % 10 == 0)
				v1.add(m.get(i));

			// If number is even but not divisible by 5
			else if (m.get(i) % 2 == 0)
				v2.add(m.get(i));
			else
				// If number is odd
				v3.add(m.get(i));
		}

		Collections.sort(v1, Collections.reverseOrder());

		for (int ii = 0; ii < v1.size(); ii++) {
			System.out.print(v1.get(ii) + " ");
		}
		for (int ii = v2.size() - 1; ii >= 0; ii--) {
			System.out.print(v2.get(ii) + " ");
		}
		for (int ii = 0; ii < v3.size(); ii++) {
			System.out.print(v3.get(ii) + " ");
		}
	}
	public static void main(String[] args) {
	
		Vector<Integer> arr = new Vector<>();
		arr.add(10);
		arr.add(2);
		arr.add(3);
		arr.add(41);
		arr.add(12);
		arr.add(13);
		arr.add(19);
		arr.add(81);
		arr.add(9);
		int N = arr.size();

		Sort(arr, N);
	}
}
