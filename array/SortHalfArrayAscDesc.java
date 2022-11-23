package com.example.assignment.array;

public class SortHalfArrayAscDesc {

	public static void main(String[] args) {
		int[] a = {3, 2, 4, 1, 10, 30, 40, 20};
	      int n = a.length;
	      
			/*
			 * Arrays.sort(arr);
			 * 
			 * // printing first half in ascending order for (int i = 0; i < n / 2; i++) {
			 * System.out.print(arr[i] + " "); } // printing second half in descending order
			 * for (int j = n - 1; j >= n / 2; j--) { System.out.print(arr[j] + " "); }
			 */
	      
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


